package org.ict.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
	WebDriver driver ;
	private WebElement username,phno,mail,passw,cpassw,reg;
	public SignupPage(WebDriver driver) {
		this.driver=driver;
		
	}

	public void setUsername(String setUser) throws Throwable {
		username=driver.findElement(By.xpath("//input[@name='Name']"));
		username.sendKeys(setUser);
		Thread.sleep(1000);
		//username.clear();
	}
	
	public void setMail(String setMails) throws Throwable {
		mail=driver.findElement(By.xpath("//input[@name='Email']"));
		mail.sendKeys(setMails);
		Thread.sleep(1000);
		//mail.clear();
	}
	public void setPhno(long setPh) throws Throwable {
		phno=driver.findElement(By.xpath("//input[@name='Contact']"));
		phno.sendKeys(String.valueOf(setPh));
		Thread.sleep(1000);
		//phno.clear();
	}
	public void setPass(String setPassw) throws Throwable {
		passw=driver.findElement(By.xpath("//input[@name='Password']"));
		passw.sendKeys(setPassw);
		Thread.sleep(1000);
		//passw.clear();
	}
	public void setCpass(String setCpassw) throws Throwable {
		cpassw=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		cpassw.sendKeys(setCpassw);
		Thread.sleep(1000);
		//cpassw.clear();
	}
	public void Registerclick() throws Throwable {
	reg=driver.findElement(By.xpath("//button[@type='submit']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",reg);
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	}         

}
