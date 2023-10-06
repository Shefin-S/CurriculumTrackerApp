package com.ict.scripts;

import java.io.IOException;
import org.ict.pages.LoginPage;
import org.ict.utilities.ExcelUtility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestClass extends TestBase 
{
LoginPage log;
	
	@Test(priority=1)
		public void verifyValidAdminLogin() throws IOException, Throwable 
		{
		
		   	log=new LoginPage(driver);
			String username= ExcelUtility.getData(0, 0);
			String passwrd=ExcelUtility.getData(0, 1);
			//log.LoginHome();
			log.setUsername(username);
			log.setPassword(passwrd);
			log.Loginclick();
			Thread.sleep(1000);
			log.okclick();
			
			log.LogOut();
			driver.navigate().refresh();
			Thread.sleep(1000);
				
		}
	
	@Test(priority=2)
	public void verifyValidFacultyLogin() throws IOException, Throwable
	{
	
	   	log=new LoginPage(driver);
		String username= ExcelUtility.getData(1, 0);
		String passwrd=ExcelUtility.getData(1, 1);
		//log.LoginHome();
		log.setUsername(username);
		log.setPassword(passwrd);
		log.Loginclick();
		Thread.sleep(1000);
		log.ok2click();
		
		log.LogOutF();
		driver.navigate().refresh();
		Thread.sleep(1000);
		
	}
	

	@Test(priority=3)
		public void verifyInValidAdminLogin() throws IOException, Throwable
		{
		
		   	log=new LoginPage(driver);
			String username= ExcelUtility.getData(0, 2);
			String passwrd=ExcelUtility.getData(0, 3);
			//log.LoginHome();
			log.setUsername(username);
			log.setPassword(passwrd);
			log.Loginclick();
			driver.navigate().refresh();
			Thread.sleep(1000);
			
				
		}
	@Test(priority=4) 
	public void verifyInValidFacultyLogin() throws IOException, Throwable
	{
	
	   	log=new LoginPage(driver);
		String username= ExcelUtility.getData(1, 2);
		String passwrd=ExcelUtility.getData(1, 3);
		//log.LoginHome();
		log.setUsername(username);
		log.setPassword(passwrd);
		log.Loginclick();
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		
	}
	
	

}
