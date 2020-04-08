package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ProprtiesFileLoad;

import com.jayway.restassured.response.Response;

public class TC9 
{
	@Test
	public static void testcase9() throws IOException 
	{
		JSONObject data = new JSONObject();
		data.put("employee_name", "Updated-Power Ranger");	
		data.put("employee_salary", "Salery Aagyi 10k Extra");
		data.put("employee_age", "72");
		data.put("id", TC6.idValue);
		
		Properties pr = ProprtiesFileLoad.propertiesFile("C:\\Users\\2374\\Desktop\\Selenium\\API_Framework\\Env.Properties");
		HTTPMethods http = new HTTPMethods(pr);
	    Response res= http.PutRequest("EMPL_DTL_UPDATE_URI", TC6.idValue,data.toString());
	    
	    System.out.println();
	    System.out.println("9th Test Case Execution Started");
	    ResponseValidation.responseStatusCodeValidate(201,res);
	    
	    System.out.println("***RESPONSE CODE IS****");
	    System.out.println(res.statusCode());
	    System.out.println("******Data is  ******");
	    System.out.println(res.asString());
	}
}
