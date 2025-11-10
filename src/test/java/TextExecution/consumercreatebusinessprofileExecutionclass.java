package TextExecution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.consumerBusinesscreationpage;

public class consumercreatebusinessprofileExecutionclass extends Baseclass {

	@Test
	public void createbusinessprofileExecutionclass() throws InterruptedException, AWTException
	{
		consumerprofile = new consumerBusinesscreationpage(driver);
		consumerprofile.createbbusinessprofile(prop.getProperty("mobilenumber"), prop.getProperty("createpwd"), prop.getProperty("confirmpwd"),
				 prop.getProperty("gstnumber"), prop.getProperty("designation"), prop.getProperty("IFSCcode"), prop.getProperty("accountno"),
				 prop.getProperty("confirmaccountno"),prop.getProperty("udyamno"), prop.getProperty("udyamdateno"),
				 prop.getProperty("iecdateno"), prop.getProperty("DnBno")
				 
				);		
		  	
	}
}
