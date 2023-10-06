package org.ict.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	private WebElement username;
	private WebElement passw,cl,cl2;
	private WebElement  logina,logot,logotf;

	public LoginPage(WebDriver driver)
	
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
	public void ok2click()
	{
		cl2=driver.findElement(By.xpath("/html/body/div/div/div[6]"));
		cl2.click();
				}
	
	public void LogOut()
	{
		logot=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[1]/div/div[3]/a/span/button/i"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",logot);
		//logot.click();
				}
	///html/body/app-root/app-faculty-dashboard/div/div/div[1]/div/div[3]/a/span/button
	public void LogOutF()
	{
		logotf=driver.findElement(By.xpath("//i[@class='bi bi-box-arrow-left']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",logotf);
		//logotf.click();
	}
}
