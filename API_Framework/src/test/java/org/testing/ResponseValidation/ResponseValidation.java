package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseValidation 
{

	public static void responseStatusCodeValidate(int expectedStatusCode, Response res)
	{		
		if(expectedStatusCode == res.statusCode())
		{
			System.out.println("Expected Status Code Matches with Respone of API Code"+res.statusCode());
		}
		
		else 
		{
			System.out.println("Status Code Doesn't Matches Here!!!!!"+res.statusCode());
		}
	}
}
