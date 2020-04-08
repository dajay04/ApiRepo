package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods

{
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr = pr; //Point to Global Variable
	}
	
	public Response GetRequest(String Uri_key,String id_Value)
	{
		String uri = pr.getProperty(Uri_key) + "/" + id_Value;
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
		
		return res;
	}
	
	public Response GetRequest(String Uri_key)
	{
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(Uri_key));
		return res;
	}
	
	public Response PostRequest(String Uri_key,String body)
	{
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(Uri_key));
		
		return res;
	}
	
	public Response PutRequest(String Uri_key,String id_Value,String body) 
	{
		String uri = pr.getProperty(Uri_key) + "/" + id_Value;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(uri);
		
		return res;
	}
	
	public Response DeleteRequest(String Uri_key,String id_Value) 
	{
		String uri = pr.getProperty(Uri_key) + "/" + id_Value;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		
		return res;
	}
}
