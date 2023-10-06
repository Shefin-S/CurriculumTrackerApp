package com.ict.scripts;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("http://143.244.139.123:3001/login");
		driver.manage().window().maximize();
		
		
	}
	@AfterTest
	public void Teardown()
	{
		driver.close();
	}
	
}
