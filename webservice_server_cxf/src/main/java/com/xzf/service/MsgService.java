package com.xzf.service;

import javax.jws.WebService;

import com.xzf.vo.User;

@WebService
public interface MsgService {

	public String sayHello(String name);
	
	public User dealBean(User user);
}
