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

public class TC6 
{
	static Timestamp a = new Timestamp(System.currentTimeMillis()); ;
	static String str=a.toString();
	static String idValue;
	@Test
	public static void testcase6() throws IOException 
	{
		JSONObject data = new JSONObject();
		data.put("employee_name", "Power Ranger");	
		data.put("employee_salary", "Hai Hi nahi (Gareeb)");
		data.put("employee_age", "12");
		data.put("id", str);
		
		Properties pr = ProprtiesFileLoad.propertiesFile("C:\\Users\\2374\\Desktop\\Selenium\\API_Framework\\Env.Properties");
		HTTPMethods http = new HTTPMethods(pr);
	    Response res= http.PostRequest("EMPL_DTL_CREATE_URI", data.toString());
	    System.out.println("6th Test Case Execution Started");
	    ResponseValidation.responseStatusCodeValidate(201,res);
	    
	   idValue= ResponeDataParsing.response_parsing(res, "id");
	   
		System.out.println("***RESPONSE CODE IS****");
	    System.out.println(res.statusCode());
	    System.out.println("******Data is  ******");
	    System.out.println(res.asString());
		
	}
}
