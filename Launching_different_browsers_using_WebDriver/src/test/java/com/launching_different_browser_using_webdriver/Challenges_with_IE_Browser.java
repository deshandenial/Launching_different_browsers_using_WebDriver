package com.launching_different_browser_using_webdriver;

public class Challenges_with_IE_Browser 
{

	public static void main(String[] args)
	{
		// refer: http://learn-automation.com/challenges-with-ie-browser-in-selenium-webdriver/
		/*
		 * Challenges with IE browser in Selenium Webdriver
		 * 
		You will get the different type of Exception while working with IE Browser I will try to sum up some exception, which I faced and what are the solutions that worked for me.

		If you are new to Selenium then check below URL to get familiar with exceptions.

		How to handle exception in Selenium

		What are the exception available in Selenium

		Exceptions and their Solutions

	Issues 1-

	openqa.selenium.NoSuchWindowException
	
	This is a common issue with Selenium and you can avoid this by doing some IE setting, which we are going to discuss now.

 

	Issue 2-

	sendKeys works very slow it takes 1-2 second to type each character.
	
	This is a known issue with Selenium and it only happens once you work with IE 64 bit driver.

	Solution- You can download IE Driver 32 bit and start using it, even you are working with 64 bit OS this 32 bit IE driver works every time.

 

	Issue 3-

	Unexpected error launching Internet Explorer. Protected Mode must be set to the same value
	
	When I started working with IE this was the first exception, which I used to get, and I was sure that this related to some browser setting.
		 
		
		//Tools->Security->Internet->check the protected sites 
		//Tools->Security->local intranet->check the protected sites 
		//Tools->Security->Trusted Sites->check the protected sites 
		//Tools->Security->Restricted Sites->check the protected sites 
		  
		 Finally click on OK and apply and you are done.

	Issue 4-

	Unexpected error launching Internet Explorer. Browser zoom level was set to 0%

	By the name itself, you can see that we have to set the zoom level to 100 % to make it work
		 
		 
	Issue 5: 

	Handle Untrusted SSL certificate error in IE browser in different ways
	Solution: IE is the product of Microsoft and IE is much worried about security so when you start working with some https application you will get a untrusted certificate.

	Selenium has so many ways to handle this, but we will see 2 ways which work all the time for me.

		First:
		1-  Open the application for which SSL certificate is coming so use below code after passing the URL.
		driver.get(“ur app URL”);
		driver.navigate().to(“javascript:document.getElementById(‘overridelink’).click()”);
		// you can use your code now

	Second:

		You can handle this certificate using Desired Capabilities as well.

*/
		
		

	}

}
