package com.cucumberpom.Page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.cucumberpom.Base.baseClass;

public class searchResultPageClass extends baseClass {
public void clickTrutime() {    //clicking on trutime from the results
	String currentHandle1= driver.getWindowHandle();   //switching window to trutime application
	driver.findElement(By.xpath("//span[@ng-repeat='title in document.hitHighlights.appTitle']//span[@class='search-hit-highlight ng-scope'][normalize-space()='TruTime']")).click();
	Set<String> currentHandle = driver.getWindowHandles();
	Iterator<String> itr = currentHandle.iterator();
	itr.next();
	String abc = itr.next();
	driver.switchTo().window(abc);
}
}
