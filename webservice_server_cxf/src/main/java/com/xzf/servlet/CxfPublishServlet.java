package com.xzf.servlet;

import javax.servlet.ServletConfig;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

import com.xzf.service.impl.MsgServiceImpl;

/*
 * 部署到tomcat，但不用spring的实现方式
 * http://localhost:8080/webservice_server_cxf/msgService?wsdl
 */
public class CxfPublishServlet extends CXFNonSpringServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void loadBus(ServletConfig sc)
	{
	    super.loadBus(sc);
	    Bus bus = getBus();
	    BusFactory.setDefaultBus(bus);
	    Endpoint.publish("/msgService",new MsgServiceImpl());//此时的服务地址已经变成http://你的应用地址/msgService
	}
}
