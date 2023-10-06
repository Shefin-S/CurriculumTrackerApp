package org.ict.pages;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateForm {
	WebDriver driver;

	private WebElement rname,reg,fc;
	private WebElement inst,hrs,username,passw,logina,cl;
	
	

	public CreateForm(WebDriver driver)
	
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
	public void formclick() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	fc=driver.findElement(By.xpath("//i[@routerlink='/dashboard/requirement-list/rform']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",fc);
		Thread.sleep(1000);
		
				}
	
	public void setReqname(String setUser)
	{
	rname=driver.findElement(By.id("requirementName"));
	rname.sendKeys(setUser);
	}

public void setArea()
{
	Select drpAr= new Select(driver.findElement(By.name("trainingArea")));
	drpAr.selectByVisibleText("CSA");
	}
	
public void setInstname(String setUser)
{
inst=driver.findElement(By.id("institution"));
inst.sendKeys(setUser);
}
public void setCategory()
{
	Select drpCr= new Select(driver.findElement(By.name("category")));
	drpCr.selectByVisibleText("Academic");
	}	
public void setHours(long setUser)
{
hrs=driver.findElement(By.id("trainingHours"));
hrs.sendKeys(String.valueOf(setUser));
}	
public void SubmitButton()
{
reg=driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/div[2]/app-requirementform/form/button"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();",reg);
	

}	
	
	
	
	
	
}
