package org.ict.pages;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class HomePage {
	WebDriver driver;

	private WebElement crs,mem,lnk,ln,bn,pt,pr,ser;
	
	public HomePage(WebDriver driver)
	
	{
		this.driver=driver;
 }

public void quicklinkmembership() throws Throwable  {
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	mem=driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div[1]/div/div[2]/div[3]/div/a[1]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",mem);
	
	Thread.sleep(100);
	
}

public void partnershipslink() throws Throwable  {
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	pt=driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div[1]/div/div[2]/div[3]/div/a[2]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",pt);
	
	Thread.sleep(100);
	
}
public void projectslink() throws Throwable  {
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	pr=driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div[1]/div/div[2]/div[3]/div/a[3]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",pr);
	
	Thread.sleep(100);
	
}
public void serviceslink() throws Throwable  {
	
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	ser=driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div[1]/div/div[2]/div[3]/div/a[4]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",ser);
	
	Thread.sleep(100);
	
}
	
public void ourcourse() {
	
	crs=driver.findElement(By.xpath("/html/body/app-root/app-home/app-footer/div[1]/div/div[2]/div[2]/div/a[2]"));
	crs.click();
	
}
public void icon() throws Throwable {
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	lnk=driver.findElement(By.xpath("/html/body/app-root/app-home/app-navbar/div[1]/div/div[2]/div/a[1]"));
	lnk.click();
	Thread.sleep(1000);
}
public void insticon() throws Throwable {
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	ln=driver.findElement(By.xpath("/html/body/app-root/app-home/app-navbar/div[1]/div/div[2]/div/a[3]"));
	ln.click();
	Thread.sleep(1000);
}	
public void linkdicon() throws Throwable {
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	bn=driver.findElement(By.xpath("/html/body/app-root/app-home/app-navbar/div[1]/div/div[2]/div/a[2]"));
	bn.click();
	Thread.sleep(1000);
}	
	

}
