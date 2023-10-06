package com.ict.scripts;

import java.io.IOException;
import org.ict.pages.CreateForm;
import org.ict.utilities.Exclform;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestForm extends TestBase {
	CreateForm cr;
	
	@Test(priority=1)
	public void CreatingValidRequirement() throws IOException, Throwable {
		cr=new CreateForm(driver);
		String username=Exclform.getData(0, 0);
		String passwrd=Exclform.getData(0, 1);
		String Reqname=Exclform.getData(0, 2);
		String Instname=Exclform.getData(0, 3);
		long Hours=Exclform.getNumericData(0, 4);
		cr.setUsername(username);
		cr.setPassword(passwrd);
		cr.Loginclick();
		Thread.sleep(1000);
		cr.okclick();
		
		cr.formclick();
		cr.setReqname(Reqname);
		cr.setArea();
		cr.setInstname(Instname);
		cr.setCategory();
		cr.setHours(Hours);
		cr.SubmitButton();
		driver.navigate().refresh();
		
	}
	@Test(priority=2)
	public void CreatingInValidRequirement() throws IOException, Throwable {
		cr=new CreateForm(driver);
		String username=Exclform.getData(1, 0);
		String passwrd=Exclform.getData(1, 1);
		String Reqname=Exclform.getData(1, 2);
		String Instname=Exclform.getData(1, 3);
		long Hours=Exclform.getNumericData(1, 4);
		cr.setUsername(username);
		cr.setPassword(passwrd);
		cr.Loginclick();
		Thread.sleep(1000);
		cr.okclick();		
		cr.formclick();
		cr.setReqname(Reqname);
		cr.setArea();
		cr.setInstname(Instname);
		cr.setCategory();
		cr.setHours(Hours);
		cr.SubmitButton();
		
	}
	

}
