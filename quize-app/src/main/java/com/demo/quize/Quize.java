package com.demo.quize;

import com.demo.quize.resource.QuizeResource;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Environment;

public class Quize extends Application<QuizeConfiguration>{
	
	public static void main(String[] args) throws Exception {
		new Quize().run(args);
	}
	

	HibernateBundle<QuizeConfiguration> hibernateBundle = new HibernateBundle<QuizeConfiguration>() {
		
		@Override
		public DataSourceFactory getDataSourceFactory(QuizeConfiguration configuration) {
			// TODO Auto-generated method stub
			return configuration.getDatabase();
		}
	};
	
	@Override
	public void run(QuizeConfiguration configuration, Environment environment) throws Exception {
		environment.jersey().register(QuizeResource.class);
	}
	
	

}
