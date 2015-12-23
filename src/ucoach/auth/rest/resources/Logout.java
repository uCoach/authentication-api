package ucoach.auth.rest.resources;
import ucoach.auth.model.*;
import ucoach.auth.restclient.ClientApp;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless // will work only inside a Java EE application
@LocalBean // will work only inside a Java EE application
@Path("/logout")
public class Logout {
	
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })	
	public Response logout(RestToken rt) throws Exception{
		Response r;
		ClientApp ca = new ClientApp();
		int idPerson = 0;
		try{
			idPerson = Integer.parseInt(rt.getId());
		}catch(Exception e){
			 r =  Response.noContent().build();
			 return r;
		}
		
		try{
			AuthToken at = AuthToken.getTokenByPerson(idPerson, rt.getToken());
			AuthToken.removeAuthToken(at);			
			r = Response.accepted().build();
			
			return r;
		}catch(Exception e){
			
		}
		
		
		return null;
		//return ca.login(l.getUserName(), l.getPassword());
	}
}
