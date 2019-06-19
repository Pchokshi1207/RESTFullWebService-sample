package org.studyeasy.showroom.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class StartupPage {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations(@HeaderParam("HeaderValue") String headerAttrib){
		
		return "Header value: "+headerAttrib;
	}

}
