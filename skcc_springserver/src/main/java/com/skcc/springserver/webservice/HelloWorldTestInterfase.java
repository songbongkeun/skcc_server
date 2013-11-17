package com.skcc.springserver.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class HelloWorldTestInterfase {

	@GET
	@Path("/test")
	@Produces({"text/plain"})
	public String sayHelloWorld() {
		return "Hello World";
	}
}
