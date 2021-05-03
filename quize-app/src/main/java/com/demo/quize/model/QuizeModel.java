package com.demo.quize.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuizeModel implements Serializable {

	private static final long serialVersionUID = 7149310282900351030L;

	private String quizeName;
	
	List<String> questions = new ArrayList<String>();

	public QuizeModel() {
		// TODO Auto-generated constructor stub
	}
	
	public String getQuizeName() {
		return quizeName;
	}



	public void setQuizeName(String quizeName) {
		this.quizeName = quizeName;
	}



	public List<String> getQuestions() {
		return questions;
	}

	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
}
