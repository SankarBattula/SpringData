package com.sankar.spring.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sankar.spring.dao.AccountDAOImpl;


public class AccountController {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("com/sankar/spring/config/applicationContext.xml");
	public static void main(String[] args) {
		
		AccountDAOImpl service = (AccountDAOImpl) context.getBean("accountDAORef");
		
		service.create();
		
		System.out.println("success");
	}
	

}
