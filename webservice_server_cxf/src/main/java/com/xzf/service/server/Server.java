package com.xzf.service.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.xzf.service.impl.MsgServiceImpl;

/**
 * 无需部署到tomcat，但需要内嵌jetty服务器
 * @author xiezf
 *
 */
public class Server {

	public static void main(String[] args) {
		 
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setAddress("http://localhost:8080/msgService");
		factory.setServiceBean(new MsgServiceImpl());
		
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		
		factory.create();
		System.out.println("发布服务成功...");
	}
}
