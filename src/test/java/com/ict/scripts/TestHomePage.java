package com.ict.scripts;

import org.ict.pages.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestHomePage extends HomeBase {
	HomePage hp;
	


	@Test(priority=1)
	public void verifyfacebookicon() throws Throwable 
	{
		hp=new HomePage(driver);
        hp.icon();
        driver.navigate().refresh();
}	
	
	@Test(priority=2)
	public void verifyLinkedinicon() throws Throwable 
	{
		hp=new HomePage(driver);
		driver.get("http://143.244.139.123:3001/");
        hp.linkdicon();
        driver.navigate().refresh();
}	

	@Test(priority=3)
	public void verifyInstagramicon() throws Throwable 
	{
		hp=new HomePage(driver);
		driver.get("http://143.244.139.123:3001/");
        hp.insticon();
        driver.navigate().refresh();
}	
	@Test(priority=4)
	public void verifymembershiplink() throws Throwable 
	{
		hp=new HomePage(driver);
		driver.get("http://143.244.139.123:3001/");
        hp.quicklinkmembership();
        driver.navigate().refresh();
}
	@Test(priority=5)
	public void verifypartnershipslink() throws Throwable 
	{
		hp=new HomePage(driver);
		driver.get("http://143.244.139.123:3001/");
        hp.partnershipslink();
        driver.navigate().refresh();
}
	@Test(priority=6)
	public void verifyprojectslink() throws Throwable 
	{
		hp=new HomePage(driver);
		driver.get("http://143.244.139.123:3001/");
        hp.projectslink();
        driver.navigate().refresh();
}
	@Test(priority=7)
	public void verifyserviceslink() throws Throwable 
	{
		hp=new HomePage(driver);
		driver.get("http://143.244.139.123:3001/");
        hp.serviceslink();
        driver.navigate().refresh();
}
		@Test(priority=8)
	public void verifyOurcourseslink() 
	{
		hp=new HomePage(driver);
		driver.get("http://143.244.139.123:3001/");
        hp.ourcourse();
        driver.navigate().refresh();
}
		

		
	
	
	
}