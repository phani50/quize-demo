package com.demo.quize.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.quize.model.QuizeModel;
import com.demo.quize.service.QuizeService;

import io.dropwizard.hibernate.UnitOfWork;

@Path("/quize")
public class QuizeResource {
	
	private QuizeService quizeService;
	
	public QuizeResource(QuizeService quizeService) {
		this.quizeService = quizeService;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@UnitOfWork
	public Response createQuize(QuizeModel quizeModel) {
		quizeService.createQuize(quizeModel);
		return Response.ok().build();
	}
}
