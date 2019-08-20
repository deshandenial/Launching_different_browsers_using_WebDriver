package com.launching_different_browser_using_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class How_to_Handle_Untrusted_Certificate_Selenium_Webdriver {

	public static void main(String[] args) {
		
//Method 1 - Handle untrusted certificate in Firefox
		
	/*	
		
		// Create object of DesiredCapabilities class
		DesiredCapabilities cap=DesiredCapabilities.firefox();

		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Set the driver path
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		

		// Open browser with capability
		WebDriver driver=new FirefoxDriver(cap);
		driver.get("https://www.github.com");
	*/	

//Method 2 - Handle untrusted certificate in Chrome	
		
	/*	// Create object of DesiredCapabilities class
		DesiredCapabilities cap=DesiredCapabilities.chrome();

		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Set the driver path
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		// Open browser with capability
		WebDriver driver=new ChromeDriver(cap);
		driver.get("https://www.github.com");
	*/	
		
//Method 3 - Handle untrusted certificate in InternetExplorer
		
		// Create object of DesiredCapabilities class

		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();

		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Set the driver path
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");

		// Open browser with capability
		WebDriver driver=new InternetExplorerDriver(cap);
		driver.get("https://github.com/");
		
	
//Method 4 - Handle untrusted certificate in Safari
		
	/*	// Create object of DesiredCapabilities class

		DesiredCapabilities cap=DesiredCapabilities.safari();

		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Set the driver path
		System.setProperty("webdriver.safari.driver","Safari driver path");

		// Open browser with capability
		WebDriver driver=new SafariDriver(cap);		
		
		*/
		
		
		
	}

}
