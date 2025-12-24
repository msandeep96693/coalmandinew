package TextExecution;

import org.testng.annotations.Test;
import java.security.BasicPermission;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.listinghomepage;

public class listinghomepageExecutionclass  extends Baseclass {
	
	// working
	@Test(priority = 0, enabled = false)
	public void mylistinglistfunctionality() throws InterruptedException
	{	
		listhome = new listinghomepage(driver);
		listhome.Mylistingsearchstatusfilterscenario(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"));
	}

	// working
	@Test(priority = 2, enabled = true)
	public void participatedlistfunctionality() throws InterruptedException
	{
		listhome = new listinghomepage(driver);
		listhome.Participdatedsectionsearchfunctionality(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("participatedsearchbycoalname"));
	}
	
	
	
	
}
