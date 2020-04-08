package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ProprtiesFileLoad;
import com.jayway.restassured.response.Response;

public class TC2 
{
	@Test
	public static void testcase2() throws IOException 
	{
		Properties pr = ProprtiesFileLoad.propertiesFile("C:\\Users\\2374\\Desktop\\Selenium\\API_Framework\\Env.Properties");
		HTTPMethods http = new HTTPMethods(pr);
	
	    Response res= http.GetRequest("QA_URI",TC1.idValue);
	    
	    System.out.println();
	    System.out.println("2nd Test Case Execution Started");
	    ResponseValidation.responseStatusCodeValidate(200,res);
	    
	    System.out.println("***RESPONSE CODE IS****");
	    System.out.println(res.statusCode());
	    System.out.println("******Data is  ******");
	    System.out.println(res.asString());
	}
}
