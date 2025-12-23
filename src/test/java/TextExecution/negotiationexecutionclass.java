package TextExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.listingNegotiationactionpage;

public class negotiationexecutionclass extends Baseclass {

	// working
	@Test(priority = 1, enabled = true)
	public void Expressinterest() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.ExpressInterestOrdergenerate(prop.getProperty("negotiatorname"), prop.getProperty("password"),
				prop.getProperty("businessname"),prop.getProperty("trustedbusinessname"));
	}
	
	// working
	@Test(priority = 2, enabled = false)
	public void NegotiatorNegotiation() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.negotiationordergenerate(prop.getProperty("negotiatorname"), prop.getProperty("password"),
				prop.getProperty("businessname"), prop.getProperty("offerQTY"), prop.getProperty("offerRATE"), 
				prop.getProperty("trustedbusinessname"));
				
	}
	
	// working
	@Test(priority = 3, enabled = false)
	public void OwnerNegotiation() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.Onwernegotiationordergenerate(prop.getProperty("username"), prop.getProperty("password")
				);
				
	}
}
