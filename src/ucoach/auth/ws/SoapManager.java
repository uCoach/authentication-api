package ucoach.auth.ws;

import introsde.assignment.soap.ws.*;
import ucoach.auth.model.AuthToken;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SoapManager{

	
	public String login(long userName, String criptedPassword) throws MalformedURLException{
			URL url = new URL("https://frozen-shore-6890.herokuapp.com/ws/people?wsdl");
			QName qname = new QName("http://ws.soap.assignment.introsde/", "PeopleService");
		 	Service service = Service.create(url, qname);	        
	        People people = service.getPort(People.class);	        	        
	        try{
	        	Person p = people.readPerson(userName);
	        	
	        	if(p.getFirstname().equals(criptedPassword) ){
	        		AuthToken at = new AuthToken();
	        		at.setuId(p.getIdPerson());
	        		at.setCreated(new Date());
	        		at.generateNewRandonToken();
	        		at = AuthToken.saveToken(at);
	        		return at.getToken();
	        	}
	        	return null;
	        	
	        }catch(Exception e){
	        	System.out.println(e);
	        	return null;
	        }    	        	        		
	}
	
}
