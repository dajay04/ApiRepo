package org.testing.utilities;

import org.json.JSONArray;
import org.json.XML;
import org.json.JSONObject;

public class JSONtoXML 
{

	public static String jsontoxmlObject(String jsondata)
	{
	  JSONObject j2=new JSONObject(jsondata);
		return XML.toString(j2);
	}
	
	public static String jsontoxmlArray(String jsondata)
	{
	  JSONArray j1=	new JSONArray(jsondata);
		return XML.toString(j1);
	}
}
