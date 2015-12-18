package ucoach.auth.rest.resources;
import ucoach.auth.model.*;
import ucoach.auth.restclient.ClientApp;
import ucoach.auth.soap.SoapManager;

import java.net.MalformedURLException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Stateless // will work only inside a Java EE application
@LocalBean // will work only inside a Java EE application
@Path("/login")
public class TokenResource {
	
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	
	public AuthToken login(Login l) throws Exception{
		System.out.println("ENTROU");
		ClientApp ca = new ClientApp();		
		return ca.login(l.getUserName(), l.getPassword());
	}
}
