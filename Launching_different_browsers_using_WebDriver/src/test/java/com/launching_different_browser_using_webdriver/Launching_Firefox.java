package com.launching_different_browser_using_webdriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox {

/*	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/");

	}*/
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/");
	}

}
