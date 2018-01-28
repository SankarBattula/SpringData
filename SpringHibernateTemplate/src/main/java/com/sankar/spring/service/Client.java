package com.sankar.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sankar.spring.bean.Account;
import com.sankar.spring.dao.AccountDAOImpl;

public class Client {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("com/sankar/spring/config/applicationContext.xml");
	public static void main(String[] args) {
		
		AccountDAOImpl daoImpl = (AccountDAOImpl) context.getBean("daoImpl");
		
		Account account = new Account();
		account.setAccno(101);
		account.setName("Sankar");
		account.setBalance(4500.0);;
		daoImpl.insert(account);;
		
		System.out.println("success");
	}

}
