package com.testing.experta.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetConfig {
	
	Properties prop;
	
	public GetConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	public String getUrl() {
		String url = prop.getProperty("baseURL");
		return url;
	}
	
	public String getChromePath() {
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath() {
		String firefoxpath = prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getIEPath() {
		String iepath = prop.getProperty("iepath");
		return iepath;
	}
}
