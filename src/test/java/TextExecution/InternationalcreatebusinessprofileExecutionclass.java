package TextExecution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.InternationalBusinesscreationpage;
import pageobject.consumerBusinesscreationpage;

public class InternationalcreatebusinessprofileExecutionclass extends Baseclass {

	@Test
	public void createbusinessprofileExecutionclass() throws InterruptedException, AWTException
	{
		internationalprofile = new InternationalBusinesscreationpage(driver);
		internationalprofile.Internationalcreatebusinessprofile(prop.getProperty("Rolename"),
				prop.getProperty("mobilenumber"),
				prop.getProperty("createpwd"), prop.getProperty("confirmpwd"),
				 prop.getProperty("Registeredaddress"), prop.getProperty("Zipcodenumber"), 
				 prop.getProperty("DnBnumber"), prop.getProperty("designation"),
				 prop.getProperty("Indiandesignation")
				 
				 
				);		
		  	
	}
}
