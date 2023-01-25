package com.cucumberpom.Page;

import org.openqa.selenium.By;


import com.cucumberpom.Base.baseClass;

public class homePageClass extends baseClass {

	public  void captureDetails() {    //capturing user's details
		 String a = driver.findElement(By.xpath("//div[@class='media']//div[@class='media-body media-middle']")).getText();
		System.out.println(a);
		
	}
	
	public void clickSearchTab() {     //cursor going to search tab
		driver.findElement(By.xpath("//input[@id='searchbox']")).click();
	}
	
	public void enterTrutime(String abc) {   //Enter trutime
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys(abc);
		
	}
	public void clickSearchIcon() {         //click search icon
		driver.findElement(By.xpath("//span[@class='icomoon-search2']")).click();
	}
	
}
