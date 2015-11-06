package com.secl.metrica.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@Path("/test")
public class TestService {
	@GET
	@Path("/test1")
	@Consumes(MediaType.APPLICATION_JSON)
	public User getTestMessage(@PathParam("test1") String msg)
	{
		//String output = "Jersey say : " + msg;
		UserService userService = new UserService();
		return userService.getDefaultUser();
		//return Response.status(200).entity(output).build();
	}
	
	public class UserService {

	    public User getDefaultUser() {
	        User user = new User();
	        user.setFirstName("JonFromREST");
	        user.setLastName("DoeFromREST");
	        return user;
	    }
	}
	
	@XmlRootElement
	public class User {

	    private String firstName;
	    private String lastName;

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	}

}


