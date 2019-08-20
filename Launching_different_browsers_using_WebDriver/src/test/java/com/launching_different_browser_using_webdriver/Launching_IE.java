package com.launching_different_browser_using_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launching_IE 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://github.com/");
	}
 
}
