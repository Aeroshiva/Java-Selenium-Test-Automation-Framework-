package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Env;

public class PropertiesUtil {
//Read properties file!
	
	
	public static String readProperty(Env env, String propertyName)  {
		
		File proFile = new File(System.getProperty("user.dir")+"/config/"+ env +".properties");
		FileReader fileReader = null;
		Properties properties = new Properties();

		try {
			fileReader = new FileReader(proFile);
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		String value =	properties.getProperty(propertyName.toUpperCase());
		return value;
	
	
	}
	
	
	
	
	
	
}
