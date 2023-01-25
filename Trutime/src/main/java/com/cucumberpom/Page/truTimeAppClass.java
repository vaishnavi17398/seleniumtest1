package com.cucumberpom.Page;

import java.text.DateFormatSymbols;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumberpom.Base.baseClass;

public class truTimeAppClass extends baseClass {
	public String day;
	public String[] y;
	public String[] z;
	public int i = 1;
	public String a[]=new String[10];
	public void comparison() {
	String[] week_days= new DateFormatSymbols().getShortWeekdays();  //using java date class to print expected days in a week
	int length = week_days.length;

    for (int d = 0; d < length; d++) {

        // Iterating over the string array of weekdays
        // to get respective names
    	 day = week_days[d];
    	 a[d]=day;
        System.out.println(day);
	
    }
   //below code is for printing actual days showing in the trutime app in the current week and comparing it with expected days
     driver.switchTo().frame("appFrame");  //frame index passed here
    List<WebElement> list = driver.findElements(By.xpath("//div[@class='dayDetail ng-scope']"));
 	 
 	for (WebElement webElement : list) {
 	String x = webElement.getText();
 	String[] y=x.split("-");
 	System.out.println("Actual dates in the current week "+y[0]);
 	String[] z=y[0].split(",");
	System.out.println(z[0]);
	String v=a[i];
	i++;
	Assert.assertEquals(z[0], v, "not compared");
	
	if(z[0].equalsIgnoreCase(v)) {
	System.out.println("compared sucessfully");
	}
	
	}
 
}
}
