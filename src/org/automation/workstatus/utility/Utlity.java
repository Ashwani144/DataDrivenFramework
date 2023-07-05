package org.automation.workstatus.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Utlity {
	
	public static Object fetchPropertyValue(String key) throws Exception{
		
		FileInputStream file=new FileInputStream("./Config/config.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key);
	}
	
	

}
