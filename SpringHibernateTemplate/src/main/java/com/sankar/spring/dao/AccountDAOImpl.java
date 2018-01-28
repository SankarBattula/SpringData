package com.sankar.spring.dao;


import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.sankar.spring.bean.Account;

@Transactional(readOnly = false)
public class AccountDAOImpl {

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert(Account account) {
		hibernateTemplate.save(account);
		System.out.println("Account inserted succesfully");
	}
}
