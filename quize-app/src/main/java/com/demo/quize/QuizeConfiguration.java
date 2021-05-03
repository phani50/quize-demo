package com.demo.quize;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

public class QuizeConfiguration extends Configuration{

	private static final long serialVersionUID = 7958281948214733613L;
	
	@JsonProperty("database")
	private DataSourceFactory database = new DataSourceFactory();

	public DataSourceFactory getDatabase() {
		return database;
	}

	public void setDatabase(DataSourceFactory database) {
		this.database = database;
	}
	
	

}
