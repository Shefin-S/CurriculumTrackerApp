package org.ict.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
	WebDriver driver;

	private WebElement username,passw,logina,cl,al,dlt,ap,pc,apc,appr;
	
	public AdminPage(WebDriver driver)
	
	{
		this.driver=driver;
 }
	
	public void setUsername(String setUser) throws InterruptedException
	{
	username=driver.findElement(By.id("exampleInputEmail1"));
	username.sendKeys(setUser);
	Thread.sleep(1000);
	username.clear();
	}
	
	public void setPassword(String passwordstr) throws InterruptedException

	{
	passw=driver.findElement(By.id("exampleInputPassword1"));
	passw.sendKeys(passwordstr);
	Thread.sleep(1000);
	passw.clear();
	}
	
	public void Loginclick()
	{
		logina=driver.findElement(By.xpath("//button[@type='submit']"));
		logina.click();
				}
	public void okclick()
	{
		cl=driver.findElement(By.xpath("html/body/div/div/div[6]"));
		cl.click();
				}
	public void curriculumclick()
	{
		al=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[1]/div/ul/li[2]/a/span"));
		al.click();
				}
	public void curriculumdelete()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		dlt=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[2]/app-curriculum-list/div/div/div/div[1]/div/button"));
		//dlt.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",dlt);
	           }
	public void approvedcurriculum()
	{
		ap=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[1]/div/ul/li[2]/ul/li[1]/a/span"));
		ap.click();
				}
	public void pendingcurriculum() 
	{
		pc=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[1]/div/ul/li[2]/ul/li[2]/a/span"));
		pc.click();
		
				}
	public void Approvingcurriculum() 
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		apc=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[2]/app-pending/div/div/ul/li[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",apc);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
		appr=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[2]/app-view/div[2]/div[2]/div[2]/button"));
		JavascriptExecutor jss=(JavascriptExecutor)driver;
	     jss.executeScript("arguments[0].click();",appr);
				}
	
	

}
