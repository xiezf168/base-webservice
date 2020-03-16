package com.xzf.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.cxf.jaxws.context.WebServiceContextImpl;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import com.xzf.service.MsgService;
import com.xzf.vo.User;

public class MsgServiceImpl implements MsgService {
	

	@Override
	public String sayHello(String name) {
		return String.format("hello,%s", name);
	}

	@Override
	public User dealBean(User user) {
		System.out.println(user);
		return user;
	}

}
