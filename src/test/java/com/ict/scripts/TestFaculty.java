package com.ict.scripts;

import java.io.IOException;


import org.ict.pages.FacultyPage;
import org.ict.utilities.ExcelUtility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestFaculty extends TestBase{
FacultyPage fp;
	
	@Test(priority=1)
	public void AdminLoginDashboard() throws IOException, Throwable 
	{
	
	   	fp=new FacultyPage(driver);
		String username= ExcelUtility.getData(1, 0);
		String passwrd=ExcelUtility.getData(1, 1);
		//log.LoginHome();
		fp.setUsername(username);
		fp.setPassword(passwrd);
		fp.Loginclick();
		Thread.sleep(1000);
		fp.okclick();
		Thread.sleep(1000);
		
	}
	@Test(priority=5)
	public void RespondingtoRequirement()
	{
		fp=new FacultyPage(driver);
		fp.ReqRespond();
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void ViewMycurriculums()
	{
		fp=new FacultyPage(driver);
		fp.viewCurriculum();
		driver.navigate().refresh();
	}
	@Test(priority=3)
	public void ViewDescription()
	{
		fp=new FacultyPage(driver);
		fp.viewdesc();
		driver.navigate().refresh();
	}
	@Test(priority=4)
	public void VerifySearch()
	{
		
		fp=new FacultyPage(driver);
		fp.req();
		fp.search();
		driver.navigate().refresh();
	}
	
	
	

}
