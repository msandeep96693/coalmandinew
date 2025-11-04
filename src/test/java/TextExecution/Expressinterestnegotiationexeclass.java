package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.listingNegotiationactionpage;

public class Expressinterestnegotiationexeclass extends Baseclass {

	@Test
	public void Expressinterest() throws InterruptedException
	{
		listingNegotiationactionpage orderlisting = new listingNegotiationactionpage(driver);
		orderlisting.ExpressInterestOrdergenerate(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("businessname"));
				
	}
}
