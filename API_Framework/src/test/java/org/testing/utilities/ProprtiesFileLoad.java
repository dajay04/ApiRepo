package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProprtiesFileLoad 
{
	public static Properties propertiesFile(String filepath) throws IOException
	{
		File f = new File(filepath);
		FileInputStream fr= new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fr);
		
		return pr;
	}

	
}
	