package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.Negotiationhomepage;

public class negotiationhomepageExecutionclass extends Baseclass {

	
	@Test(priority = 0, enabled = false)
	public void mylistingsearchfunctionality() throws InterruptedException
	{
		negotiation = new Negotiationhomepage(driver);
		negotiation.Mylistingsearchscenario(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"), prop.getProperty("statusname"));
	}

	
	@Test(priority = 1, enabled = false)
	public void mylistingallstatusdropdownfunctionality() throws InterruptedException
	{
		negotiation = new Negotiationhomepage(driver);
		negotiation.Mylistingfetchstatus(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("mylistingStatusoptionname"), prop.getProperty("statusname"));
	}
	
	@Test(priority = 2, enabled = false)
	public void participatedsearchfunctionality() throws InterruptedException
	{
		negotiation = new Negotiationhomepage(driver);
		negotiation.Participdatedsectionsearchfunctionality(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"), prop.getProperty("statusname"));
	}
	
	@Test(priority = 3, enabled = true)
	public void participatedallstatusdropdownfunctionality() throws InterruptedException
	{
		negotiation = new Negotiationhomepage(driver);
		negotiation.Participatedsectionfetchstatus(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("participatedstatusoptionname"), prop.getProperty("statusname"));
	}
}
