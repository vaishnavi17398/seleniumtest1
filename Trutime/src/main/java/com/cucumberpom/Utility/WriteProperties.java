package com.cucumberpom.Utility;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class WriteProperties {
	@Test
	public void write() {
		Properties prop = new Properties();
		OutputStream writeFile = null;
		try {
			writeFile = new FileOutputStream("resources\\testdata\\config.properties");
			prop.setProperty("browserName", "chrome");
			prop.setProperty("websiteURL", "https://be.cognizant.com/");
	
			try {
				prop.store(writeFile, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (writeFile != null) {
				try {
					writeFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
//click on run as Java application
// config.properties file created now.
//to change the browsername, write browser name here and click on run as, config.properties ill be modified now.
