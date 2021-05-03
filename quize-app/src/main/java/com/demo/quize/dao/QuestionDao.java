package com.demo.quize.dao;

import org.hibernate.SessionFactory;

import com.demo.quize.db.model.QuestionEntity;
import com.demo.quize.db.model.QuizeEnity;

import io.dropwizard.hibernate.AbstractDAO;

public class QuestionDao extends AbstractDAO<QuestionEntity>{

	public QuestionDao(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	

}
