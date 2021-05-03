package com.demo.quize.db.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Quize")
public class QuizeEnity {
	
	@Id
	private String uuid;
	
	private String quizeName;
	
	private Instant createdDate;
	
	private Instant modifiedDate;
	
	@OneToMany(mappedBy = "quizeEnity", cascade = CascadeType.ALL)
	private List<QuestionEntity> questions = new ArrayList<QuestionEntity>();
	
	public static QuizeEnity create(String quizeName) {
		return new QuizeEnity(UUID.randomUUID().toString(), quizeName, Instant.now(), Instant.now());
	}
	
	public QuizeEnity(String uuid, String quizeName, Instant createdDate, Instant modifiedDate) {
		super();
		this.uuid = uuid;
		this.quizeName = quizeName;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getQuizeName() {
		return quizeName;
	}

	public void setQuizeName(String quizeName) {
		this.quizeName = quizeName;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public Instant getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public List<QuestionEntity> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionEntity> questions) {
		this.questions = questions;
	}
	
	
	

}
