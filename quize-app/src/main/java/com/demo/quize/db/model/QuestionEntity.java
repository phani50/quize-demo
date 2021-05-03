package com.demo.quize.db.model;

import java.time.Instant;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class QuestionEntity {

	@Id
	private String uuid;
	
	private String questionName;
	
	private Instant createdDate;
	
	private Instant modifiedDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "uuid")
	private QuizeEnity quizeEnity;
	
	public static QuestionEntity create(String questionName, QuizeEnity quizeEnity) {
		return new QuestionEntity(UUID.randomUUID().toString(), questionName, Instant.now(), Instant.now(), quizeEnity);
	}

	public QuestionEntity(String uuid, String questionName, Instant createdDate, Instant modifiedDate,
			QuizeEnity quizeEnity) {
		super();
		this.uuid = uuid;
		this.questionName = questionName;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.quizeEnity = quizeEnity;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
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
	
	
}
