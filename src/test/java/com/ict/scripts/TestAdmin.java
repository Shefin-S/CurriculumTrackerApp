package com.ict.scripts;

import java.io.IOException;

import org.ict.pages.AdminPage;

import org.ict.utilities.ExcelUtility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestAdmin extends TestBase{
	AdminPage ap;
	
	@Test (priority = 1)
	public void AdminLoginDashboard() throws IOException, Throwable 
	{
	
	   	ap=new AdminPage(driver);
		String username= ExcelUtility.getData(0, 0);
		String passwrd=ExcelUtility.getData(0, 1);
		//log.LoginHome();
		ap.setUsername(username);
		ap.setPassword(passwrd);
		ap.Loginclick();
		Thread.sleep(1000);
		ap.okclick();
		Thread.sleep(1000);
		
		
	}
	@Test(priority = 2)
	public void viewallcurriculum() throws InterruptedException {
	
		ap=new AdminPage(driver);
		ap.curriculumclick();
		driver.navigate().refresh();
		
	}
	
	@Test(priority = 3)
	public void verifydeleteoption() throws InterruptedException {
	
		ap=new AdminPage(driver);
		ap.curriculumdelete();
		driver.navigate().refresh();
	}
	@Test(priority = 4)
	public void viewapprovedcurriculums() throws InterruptedException {
	
		ap=new AdminPage(driver);
		ap.approvedcurriculum();
		driver.navigate().refresh();
	}
	@Test(priority = 5)
	public void viewpendingcurriculums() throws InterruptedException {
	
		ap=new AdminPage(driver);
		ap.pendingcurriculum();
		driver.navigate().refresh();
	}
	@Test(priority = 6)
	public void VerifyApprovingcurriculum() throws InterruptedException {
	
		ap=new AdminPage(driver);
		ap.Approvingcurriculum();
		driver.navigate().refresh();
	}
	

}
