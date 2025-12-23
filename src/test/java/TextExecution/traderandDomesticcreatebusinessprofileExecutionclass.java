package TextExecution;

import org.testng.annotations.Test;
import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.ImporterBusinesscreationpage;
import pageobject.TraderandDomesticBusinesscreationpage;
import pageobject.consumerBusinesscreationpage;

public class traderandDomesticcreatebusinessprofileExecutionclass extends Baseclass {

	@Test
	public void TradercreatebusinessprofileExecutionclass() throws InterruptedException, AWTException
	{
		traderprofile = new TraderandDomesticBusinesscreationpage(driver);
		traderprofile.tradercreatebbusinessprofile(prop.getProperty("Rolename"), prop.getProperty("mobilenumber"),prop.getProperty("aadharnumber"), 
				prop.getProperty("createpwd"), prop.getProperty("confirmpwd"),
				 prop.getProperty("gstnumber"), prop.getProperty("designation"), prop.getProperty("IFSCcode"), prop.getProperty("accountno"),
				 prop.getProperty("confirmaccountno"),prop.getProperty("udyamno"), prop.getProperty("udyamdateno"),
				 prop.getProperty("iecdateno"), prop.getProperty("DnBno")
				 
				);		
		  	
	}
}
