package ucoach.auth.restclient;



import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

public class PersonClient {

	private final transient Client client;
	private final transient WebTarget baseTarget;

	/**
	 * Class constructor
	 * @param serviceUrl
	 */
	public PersonClient(URI serviceUrl) {
		ClientConfig config = new ClientConfig().register(new JacksonFeature());
        client = ClientBuilder.newClient(config);
        baseTarget = client.target(serviceUrl);
	}

	/**
	 * Get all people in XML format
	 * @return
	 */
	public Response getAllPeopleXml() {
		WebTarget target = baseTarget
				.path("person");

		return fetchGetResponse(target, MediaType.APPLICATION_XML);
	}

	/**
	 * Get all people in JSON format
	 * @return
	 */
	public Response getAllPeopleJson() {
		WebTarget target = baseTarget
				.path("person");

		return fetchGetResponse(target, MediaType.APPLICATION_JSON);
	}

	/**
	 * Get person by id in XML format
	 * @param personId
	 * @return
	 */
	public Response getPersonXml(int personId) {
		WebTarget target = baseTarget
				.path("person")
				.path(Integer.toString(personId));

		return fetchGetResponse(target, MediaType.APPLICATION_XML);
	}

	/**
	 * Get person by id in JSON format
	 * @param personId
	 * @return
	 */
	public Response getPersonJson(int personId) {
		WebTarget target = baseTarget
				.path("person")
				.path(Integer.toString(personId));

		return fetchGetResponse(target, MediaType.APPLICATION_JSON);
	}
	
	/**
	 * Update person by id in XML
	 * @param personId
	 * @param body
	 * @return
	 */
	public Response putPersonXml(int personId, String body) {
		WebTarget target = baseTarget
				.path("person")
				.path(Integer.toString(personId));
		
		return fetchPutResponse(target, body, MediaType.APPLICATION_XML);
	}
	
	/**
	 * Update person by id in JSON
	 * @param personId
	 * @param body
	 * @return
	 */
	public Response putPersonJson(int personId, String body) {
		WebTarget target = baseTarget
				.path("person")
				.path(Integer.toString(personId));
		
		return fetchPutResponse(target, body, MediaType.APPLICATION_JSON);
	}
	
	/**
	 * Update person by id in XML
	 * @param personId
	 * @param body
	 * @return
	 */
	public Response postNewPersonXml(String body) {
		WebTarget target = baseTarget
				.path("person");
		
		return fetchPostResponse(target, body, MediaType.APPLICATION_XML);
	}
	
	/**
	 * Update person by id in JSON
	 * @param personId
	 * @param body
	 * @return
	 */
	public Response postNewPersonJson(String body) {
		WebTarget target = baseTarget
				.path("person");
		
		return fetchPostResponse(target, body, MediaType.APPLICATION_JSON);
	}
	
	/**
	 * Delete person by id
	 * @param personId
	 * @return
	 */
	public Response deletePerson(int personId) {
		WebTarget target = baseTarget
				.path("person")
				.path(Integer.toString(personId));

		return target.request().delete();
	}

	/**
	 * 
	 * @param target
	 * @param mediaType
	 * @return
	 */
	private Response fetchGetResponse(final WebTarget target, String mediaType) {
		return target.request().accept(mediaType).get();
	}
	
	/**
	 * 
	 * @param target
	 * @param mediaType
	 * @return
	 */
	private Response fetchPutResponse(final WebTarget target, String body, String mediaType) {
		return target.request().accept(mediaType).put(Entity.entity(body, mediaType));
	}
	
	/**
	 * 
	 * @param target
	 * @param mediaType
	 * @return
	 */
	private Response fetchPostResponse(final WebTarget target, String body, String mediaType) {
		return target.request().accept(mediaType).post(Entity.entity(body, mediaType));
	}
}