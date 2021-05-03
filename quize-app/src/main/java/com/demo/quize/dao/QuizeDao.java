package com.demo.quize.dao;

import org.hibernate.SessionFactory;

import com.demo.quize.db.model.QuizeEnity;

import io.dropwizard.hibernate.AbstractDAO;

public class QuizeDao extends AbstractDAO<QuizeEnity>{

	public QuizeDao(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public void createQuize(QuizeEnity quizeEnity) {
		super.persist(quizeEnity);
	}

}
