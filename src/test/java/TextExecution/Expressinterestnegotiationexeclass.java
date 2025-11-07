package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.listingNegotiationactionpage;

public class Expressinterestnegotiationexeclass extends Baseclass {

	//@Test
	public void Expressinterest() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.ExpressInterestOrdergenerate(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("businessname"));
				
	}
	
	//@Test
	public void Negotiationwithoutsplit() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.negotiationordergeneratewithoutsplit(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("businessname"), prop.getProperty("offerQTY"), prop.getProperty("offerRATE"));
				
	}
	
	@Test
	public void Negotiationwithsplit() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.negotiationordergeneratewithsplit(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("businessname"), prop.getProperty("offerQTY"), prop.getProperty("offerRATE"));
				
	}
	
	@Test
	public void Negotiationotherparty() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.otherpartynegotiation(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("businessname"), prop.getProperty("offerQTY"), prop.getProperty("offerRATE"));
				
	}
	
	
}
