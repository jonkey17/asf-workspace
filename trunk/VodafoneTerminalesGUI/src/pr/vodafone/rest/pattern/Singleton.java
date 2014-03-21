package pr.vodafone.rest.pattern;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Singleton {

	private static ClientConfig config = new DefaultClientConfig();
	private static Client client = Client.create(config);
	private static WebResource service = null;
	
	protected Singleton() {
	 // Exists only to defeat instantiation.
	}
	   
	public static WebResource getInstance() {
	   if(service == null) {
	      service = client.resource(getBaseURI());
	   }
	   return service;
	}

	public static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/vodafone").build();
	}
	
}
