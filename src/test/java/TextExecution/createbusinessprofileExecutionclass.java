package TextExecution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.Businesscreationpage;

public class createbusinessprofileExecutionclass extends Baseclass {

	@Test
	public void createbusinessprofileExecutionclass() throws InterruptedException, AWTException
	{
		businessprofile = new Businesscreationpage(driver);
		businessprofile.createbbusinessprofile(prop.getProperty("mobilenumber"), prop.getProperty("createpwd"), prop.getProperty("confirmpwd"),
				 prop.getProperty("gstnumber"), prop.getProperty("designation"), prop.getProperty("accountno"),
				 prop.getProperty("confirmaccountno"),prop.getProperty("udyamno"), prop.getProperty("udyamdateno"),
				 prop.getProperty("iecdateno"), prop.getProperty("DnBno")
				 
				);		
		  
		
	}
}
