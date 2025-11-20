package TextExecution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.createCILsplitlistingpage;
import pageobject.createaccountpage;

public class BusinessaccountExecutionclass extends Baseclass {
	
	@Test(priority = 0, enabled = true)
	public void createbusinessaccountpage() throws InterruptedException
	{
		createaccountpage account = new createaccountpage(driver);
		account.createbusinessaccount(prop.getProperty("aadharnumber"),prop.getProperty("mobilenumber"),prop.getProperty("Rolename"), prop.getProperty("createpwd"), 
				prop.getProperty("confirmpwd"));
				
	}
	

	
}
