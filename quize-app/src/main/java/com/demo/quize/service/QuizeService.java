package com.demo.quize.service;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.quize.dao.QuestionDao;
import com.demo.quize.dao.QuizeDao;
import com.demo.quize.db.model.QuestionEntity;
import com.demo.quize.db.model.QuizeEnity;
import com.demo.quize.model.QuizeModel;

public class QuizeService {
	
	private QuizeDao quizeDao;
	
	public QuizeService(QuizeDao quizeDao) {
		this.quizeDao = quizeDao;
	}
	
	public void createQuize(QuizeModel quizeModel) {
		String quizeName = quizeModel.getQuizeName();
		List<String> questions = quizeModel.getQuestions();
		QuizeEnity quizeEnity = QuizeEnity.create(quizeName);
		List<QuestionEntity> questionEntities = questions.stream().map(q -> QuestionEntity.create(q, quizeEnity)).collect(Collectors.toList());
		quizeEnity.setQuestions(questionEntities);
		quizeDao.createQuize(quizeEnity);
	}

}
