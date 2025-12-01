package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.listingNegotiationactionpage;

public class negotiationexecutionclass extends Baseclass {

	//@Test
	public void Expressinterest() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.ExpressInterestOrdergenerate(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("businessname"),prop.getProperty("trustedbusinessname"));
				
	}
	
	@Test
	public void Negotiationwithoutsplit() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.negotiationordergeneratewithoutsplit(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("businessname"), prop.getProperty("offerQTY"), prop.getProperty("offerRATE"), 
				prop.getProperty("trustedbusinessname"));
				
	}
	
	
}
