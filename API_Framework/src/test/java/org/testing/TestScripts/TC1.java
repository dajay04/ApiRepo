package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ProprtiesFileLoad;
import org.testing.utilities.ResponeDataParsing;
import com.jayway.restassured.response.Response;

public class TC1 
{
	
	static Timestamp a = new Timestamp(System.currentTimeMillis()); ;
	static String str=a.toString();
	static String idValue;
	
	@Test
	public static void testcase1() throws IOException 
	{
		JSONObject data = new JSONObject();
		data.put("roll_no", "005");	
		data.put("age", "24");
		data.put("Name", "Ajay Dahiya");
		data.put("id", str);
		data.put("Designation", "QA Level 2");
		
		Properties pr = ProprtiesFileLoad.propertiesFile("C:\\Users\\2374\\Desktop\\Selenium\\API_Framework\\Env.Properties");
		HTTPMethods http = new HTTPMethods(pr);
	    Response res= http.PostRequest("QA_URI", data.toString());
	    System.out.println("1st Test Case Execution Started");
	    ResponseValidation.responseStatusCodeValidate(201,res);
	    
	   idValue= ResponeDataParsing.response_parsing(res, "id");
	   
	   System.out.println(idValue);
		System.out.println("***RESPONSE CODE IS****");
	    System.out.println(res.statusCode());
	    System.out.println("******Data is  ******");
	    System.out.println(res.asString());
		
	}
}
