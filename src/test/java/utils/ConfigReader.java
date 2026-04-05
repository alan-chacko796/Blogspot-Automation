package utils;

import java.util.Properties;

 public class ConfigReader {
	     static Properties prop = new Properties();
	
	
	     public static Properties loadProperties() {

	    	    try {
	    	        java.io.InputStream input = ConfigReader.class
	    	                .getClassLoader()
	    	                .getResourceAsStream("config.properties");

	    	        if (input == null) {
	    	            throw new RuntimeException("config.properties file not found in classpath");
	    	        }

	    	        prop.load(input);

	    	    } catch (Exception e) {
	    	        e.printStackTrace();
	    	    }

	    	    return prop;
	    	}

}
