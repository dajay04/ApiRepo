package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class XMLtoJson
{

	public static String xmltoJsonObject(String xml)
	{
		JSONObject responseMessage =XML.toJSONObject(xml);
		return responseMessage.toString();
	}
	
	public static String xmltoJsonArray(String xml)
	{
		JSONArray jr = new JSONArray(xml);
		return jr.toString();
	}
}
