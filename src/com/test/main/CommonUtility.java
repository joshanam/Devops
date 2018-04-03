package com.test.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonUtility
{
	WebDriver driver=null;
	
	public void performClick(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}

}
