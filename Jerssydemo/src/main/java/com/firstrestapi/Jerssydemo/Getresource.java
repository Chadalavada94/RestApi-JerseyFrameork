package com.firstrestapi.Jerssydemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("getresource")
public class Getresource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getResource()
	{
	Employee e = new Employee();
	e.setEmpid(101);
	e.setFname("ram");
	e.setLname("sham");
	
	return e;
	}	
	

}
