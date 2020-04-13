package org.testing.utilities;

import org.json.JSONObject;

public class ResponseParsingUsingORGJSON 
{

	public static String responseParsing(String message,String s,String searchkey)
	{
		JSONObject j= new JSONObject(message);
		return j.getJSONObject(s).get(searchkey).toString();
	}
}
