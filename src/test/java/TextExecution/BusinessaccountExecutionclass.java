package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.createaccountpage;

public class BusinessaccountExecutionclass extends Baseclass {
	
	@Test
	public void createbusinessaccountpage() throws InterruptedException
	{
		createaccountpage account = new createaccountpage(driver);
		account.createbusinessaccount(prop.getProperty("mobilenumber"), prop.getProperty("createpwd"), prop.getProperty("confirmpwd"));
				
	}
	

}
