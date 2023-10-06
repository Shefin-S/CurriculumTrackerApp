package com.ict.scripts;

import java.io.IOException;


import org.ict.pages.SignupPage;
import org.ict.utilities.ExclReg;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestClassSign extends TestBase2 {
	SignupPage reg;
@Test()
	
	public void verifyvalidSignup() throws IOException, Throwable  {
		reg=new SignupPage(driver);
		String Username=ExclReg.getData(0, 0);
		String mail=ExclReg.getData(0, 1);
		long Phno=ExclReg.getNumericData(0, 2);
		String Passwrd=ExclReg.getData(0, 3);
		String CPasswrd=ExclReg.getData(0, 4);
		reg.setUsername(Username);
		reg.setMail(mail);
		reg.setPhno(Phno);
		reg.setPass(Passwrd);
		reg.setCpass(CPasswrd);
		Thread.sleep(1000);
		reg.Registerclick();
		driver.navigate().refresh();
}
	
@Test

public void verifyInvalidSignup() throws IOException, Throwable  {
	reg=new SignupPage(driver);
	String Username=ExclReg.getData(1, 0);
	String mail=ExclReg.getData(1, 1);
	long Phno=ExclReg.getNumericData(1, 2);
	String Passwrd=ExclReg.getData(1, 3);
	String CPasswrd=ExclReg.getData(1, 4);
	reg.setUsername(Username);
	reg.setMail(mail);
	reg.setPhno(Phno);
	reg.setPass(Passwrd);
	reg.setCpass(CPasswrd);			
	reg.Registerclick();
	Thread.sleep(1000);
	driver.navigate().refresh();
	
}

	

}
