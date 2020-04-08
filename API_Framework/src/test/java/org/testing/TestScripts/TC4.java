package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ProprtiesFileLoad;
import com.jayway.restassured.response.Response;

public class TC4 
{
	@Test
	public static void testcase4() throws IOException 
	{
		JSONObject data = new JSONObject();
		data.put("roll_no", "001");	
		data.put("age", "27");
		data.put("Name", "Goku(Kakorot)");
		data.put("id", TC1.idValue);
		data.put("Designation", "Over 9000");
		
		Properties pr = ProprtiesFileLoad.propertiesFile("C:\\Users\\2374\\Desktop\\Selenium\\API_Framework\\Env.Properties");
		HTTPMethods http = new HTTPMethods(pr);
	    Response res= http.PutRequest("QA_URI", TC1.idValue,data.toString());
	    
	    System.out.println();
	    System.out.println("4th Test Case Execution Started");
	    ResponseValidation.responseStatusCodeValidate(201,res);
	    
	    System.out.println("***RESPONSE CODE IS****");
	    System.out.println(res.statusCode());
	    System.out.println("******Data is  ******");
	    System.out.println(res.asString());
	}
}
