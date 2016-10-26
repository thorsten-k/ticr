package de.kisner.ticr.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.kisner.ticr.model.xml.Blogs;

@Path("/rest/client")
public interface TumblrRest
{		    
	@GET @Path("/test") @Produces(MediaType.TEXT_PLAIN)
    String getComplaintStatuses();
	
	 @POST @Path("/blogs") @Produces(MediaType.TEXT_PLAIN) @Consumes(MediaType.APPLICATION_XML)
	 String updateBlogs(Blogs blogs);
}
