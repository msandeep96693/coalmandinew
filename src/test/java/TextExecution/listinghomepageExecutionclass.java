package TextExecution;

import org.testng.annotations.Test;
import java.security.BasicPermission;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.listinghomepage;

public class listinghomepageExecutionclass  extends Baseclass {
	
	
	@Test(priority = 0, enabled = false)
	public void mylistingsearchfunctionality() throws InterruptedException
	{
		listhome = new listinghomepage(driver);
		listhome.Mylistingsearchscenario(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"));
	}

	
	@Test(priority = 1, enabled = true)
	public void mylistingallstatusdropdownfunctionality() throws InterruptedException
	{
		listhome = new listinghomepage(driver);
		listhome.Mylistingfetchstatus(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("mylistingStatusoptionname"));
	}
	
	@Test(priority = 2, enabled = false)
	public void participatedsearchfunctionality() throws InterruptedException
	{
		listhome = new listinghomepage(driver);
		listhome.Participdatedsectionsearchfunctionality(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"));
	}
	
	@Test(priority = 3, enabled = false)
	public void participatedallstatusdropdownfunctionality() throws InterruptedException
	{
		listhome = new listinghomepage(driver);
		listhome.Participatedsectionfetchstatus(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("participatedstatusoptionname"));
	}
	
	
}
