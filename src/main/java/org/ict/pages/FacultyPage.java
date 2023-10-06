package org.ict.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacultyPage {
	WebDriver driver;

	private WebElement username,passw,logina,ck,vr,rr;
	private WebElement sn,des,subt,vc,vcc,vd,ss,a,b;
	

	public FacultyPage(WebDriver driver)
	
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
		ck=driver.findElement(By.xpath("html/body/div/div/div[6]"));
		ck.click();
				}
	public void viewReq()
	{
		vr=driver.findElement(By.xpath("//div[@class='card-body']"));
		vr.click();
				}
	public void req() {
		b=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[1]/div/ul/li[1]/a/button"));
		b.click();
	}
	public void ReqRespond()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		rr = driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-rform-faculty/div[2]/div/div[1]/div/a/div/h5"));
		rr.click();
		a=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-create-curriculums/div/div[1]/div[1]/ul/li[3]/a"));
		a.click();
		sn=driver.findElement(By.xpath("//input[@name='s_no']"));
		sn.sendKeys("S120");
		des=driver.findElement(By.id("description"));
		des.sendKeys("abcdefghkijkl");
		subt=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-create-curriculums/div/div[1]/div[2]/app-details/div/div/div/form/div[5]/button"));
		subt.click();
		
				}
	public void viewCurriculum()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		vc=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[1]/div/ul/li[2]/a/span"));
		vc.click();
		vcc=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-my-curriculums/div/div/div/div[1]"));
		vcc.click();
	}	
	public void viewdesc()	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		vd=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-curriculum-view/div[3]/div[2]/button[1]"));
		vd.click();
	}	
	public void search() {
		ss=driver.findElement(By.xpath("/html/body/app-root/app-faculty-dashboard/div/div/div[2]/app-rform-faculty/div[1]/input"));
		ss.sendKeys("ID1");
	}	

}