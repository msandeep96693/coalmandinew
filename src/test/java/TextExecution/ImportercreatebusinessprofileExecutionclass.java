package TextExecution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.ImporterBusinesscreationpage;
import pageobject.consumerBusinesscreationpage;

public class ImportercreatebusinessprofileExecutionclass extends Baseclass {

	@Test
	public void ImportercreatebusinessprofileExecutionclass() throws InterruptedException, AWTException
	{
		Importerprofile = new ImporterBusinesscreationpage(driver);
		Importerprofile.importercreatebbusinessprofile(prop.getProperty("Rolename"), prop.getProperty("mobilenumber"), prop.getProperty("createpwd"), 
				prop.getProperty("confirmpwd"),
				 prop.getProperty("gstnumber"), prop.getProperty("designation"), prop.getProperty("IFSCcode"), prop.getProperty("accountno"),
				 prop.getProperty("confirmaccountno"),prop.getProperty("udyamno"), prop.getProperty("udyamdateno"),
				 prop.getProperty("iecdateno"), prop.getProperty("DnBno")
				 
				);		
		  	
	}
}
