package com.workout.webservices.controllers.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/")
public class RestRoot {
	
	@GET
	@Path("/")
	public Response getMsg() {
		String output = "Hello from Jersey";
		return Response.status(200).entity(output).build();
	}
}
