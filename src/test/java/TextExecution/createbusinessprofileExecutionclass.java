package TextExecution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.Businesscreationpage;

public class createbusinessprofileExecutionclass  extends Baseclass {

	@Test
	public void createbusinessprofileExecutionclass() throws InterruptedException, AWTException
	{
		businessprofile = new Businesscreationpage(driver);
		businessprofile.createbbusinessprofile(prop.getProperty("Username"), prop.getProperty("Password"),
				 prop.getProperty("gstnumber"), prop.getProperty("designation")
				 
				);		
		  
		
	}
}
