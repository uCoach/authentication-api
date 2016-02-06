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
@Path("/login")
public class TokenResource {
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })	
	public Response login(Login l) throws Exception{
		
		ClientApp ca = new ClientApp();		
		return ca.login(l.getUserName(), l.getPassword());
	}
}

/*{
  "id": 1,
  "firstname": "Ana",
  "lastname": "Daniel",
  "email": "anidi@mail.com",
  "birthdate": "1990-1-1",
  "healthMeasure": [
    {
      "id": 1,
      "value": 60,
      "createdDate": "2016-2-1",
      "hmType": {
        "id": 1,
        "name": "weight",
        "units": "kg"
      }
    },
    {
      "id": 2,
      "value": 159,
      "createdDate": "2016-2-1",
      "hmType": {
        "id": 2,
        "name": "height",
        "units": "cm"
      }
    }
  ],
  "password": "encryptedPassword",
  "coach": {
    "id": 1,
    "lastname": "Ferrari",
    "firstname": "Charles",
    "birthdate": null,
    "email": null,
    "password": null
  },
  "twitterUsername": "anidi"
}
 * */
