package com.xzf.service.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.xzf.service.MsgService;
import com.xzf.vo.User;

public class Client {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean facotry = new JaxWsProxyFactoryBean();
		//部署到tomcat，但不用spring的实现方式
//		facotry.setAddress("http://localhost:8080/webservice_server_cxf/msgService");
		//使用内嵌jetty
//		facotry.setAddress("http://localhost:8080/msgService");
		//部署到tomcat，使用spring
		facotry.setAddress("http://localhost:8080/webservice_server_cxf/ws/msgService");
		facotry.setServiceClass(MsgService.class);
		MsgService service = facotry.create(MsgService.class);
		System.out.println(service.sayHello("一夜暴富"));
		service.dealBean(new User("1", "平儿", 26));
	}
}
