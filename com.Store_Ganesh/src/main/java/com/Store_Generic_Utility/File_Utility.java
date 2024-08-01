package com.Store_Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;




public class File_Utility {
	
	public String readPropertyData(String Key) throws IOException {
		FileInputStream fis=new FileInputStream(Framework_Constant.propertyPath);
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(Key);
		return value;
		
	}
	

}
