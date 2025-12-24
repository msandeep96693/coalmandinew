package TextExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.Negotiationhomepage;

public class negotiationhomepageExecutionclass extends Baseclass {

	//working
	@Test(priority = 0, enabled = true)
	public void mylistingsearchfunctionality() throws InterruptedException
	{
		negotiation = new Negotiationhomepage(driver);
		negotiation.Mylistingsearchscenario(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"));
	}

	//working
	@Test(priority = 1, enabled = true)
	public void participatedsearchfunctionality() throws InterruptedException
	{
		negotiation = new Negotiationhomepage(driver);
		negotiation.Participdatedsectionsearchfunctionality(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("participatedsearchbycoalname"));
	}	
}
