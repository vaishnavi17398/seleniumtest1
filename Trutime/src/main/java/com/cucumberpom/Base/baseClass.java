package com.cucumberpom.Base;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cucumberpom.Utility.FrameworkConstants;


public class baseClass {
	
		public static WebDriver driver;         
		public static Properties prop;

		

		public static void initBrowser() {
			prop = new Properties();
			try {
				FileInputStream fis = new FileInputStream(
						System.getProperty("user.dir") + "\\resources\\testdata\\config.properties");
				prop.load(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(prop.getProperty("browserName").matches("chrome")) {
					System.setProperty("webdriver.chrome.driver","resources\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
					
				} else if(prop.getProperty("browserName").matches("edge"))  {
					System.setProperty("webdriver.edge.driver",
							FrameworkConstants.edge_browser);
					driver = new EdgeDriver();
				
				} else {
					System.setProperty("webdriver.ie.driver",
							FrameworkConstants.ie_browser);
					driver = new InternetExplorerDriver();
					
				}

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		

	}catch (Exception e) {
		e.printStackTrace();
	}
		}
		
		public void invokeUrl() {
			prop = new Properties();
			try {
				FileInputStream fis = new FileInputStream(
						System.getProperty("user.dir") + "\\resources\\testdata\\config.properties");
				prop.load(fis);
			} catch (Exception e) {
				e.printStackTrace();
			}
			prop=new Properties();
			try 
			{
				prop.load(new FileInputStream(System.getProperty("user.dir") +"\\resources\\testdata\\config.properties"));
			}	
			 catch (Exception e) 
			{
				e.printStackTrace();
			}
			try {
				
			driver.get(prop.getProperty("websiteURL"));
			
			
			
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void email() {

			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             String emailid = null;   
             System.out.println("Please Enter the user email :: ");
             try {
				emailid= br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
             
             driver.findElement(By.cssSelector("#i0116")).sendKeys(emailid);
             driver.findElement(By.cssSelector("#idSIButton9")).click();
		}
		public void password() {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String pw = null;   
            System.out.println("Please Enter the user password :: ");
            try {
				pw= br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
           
            driver.findElement(By.cssSelector("#i0118")).sendKeys(pw);
            
            driver.findElement(By.cssSelector("#idSIButton9")).click();
		}
		public void otp() {
			//driver.findElement(By.xpath("//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]")).click();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String otp = null;   
            System.out.println("Please Enter the otp :: ");
            try {
				otp= br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
            driver.findElement(By.xpath("//input[@id='idTxtBx_SAOTCC_OTC']")).sendKeys(otp);

            driver.findElement(By.xpath("//input[@id='idSubmit_SAOTCC_Continue']")).click();
            driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		}
		
		
	public static void closeDriver(){
	       driver.quit();
	    }
		}

