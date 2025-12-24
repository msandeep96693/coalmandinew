package TextExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.orderhomepage;

public class orderhomepageExecutionclass extends Baseclass {
	
	//working
	@Test(priority = 0, enabled = true)
	public void orderlistsearchfunctionality() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.Orderlistsearchandstatusfilterscenario(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"));
	}
 
	// working
	@Test(priority = 2, enabled = false)
	public void Buyerorderselectvendor() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.Buyersplitorderandselectvendor(prop.getProperty("buyername"), prop.getProperty("password"),
				prop.getProperty("actionstatusname"));
	}
	
	// working
	@Test(priority =3, enabled = false)
	public void ownerorderselectvendor() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.Ownerorderselectvendor(prop.getProperty("ownername"), prop.getProperty("password"),
				prop.getProperty("actionstatusname"));
	}
	
	// working
	@Test(priority =4, enabled = false)
	public void customerselleradddispatch() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.selleradddispatch(prop.getProperty("ownername"), prop.getProperty("password"));
	}
	
	// working
		@Test(priority =4, enabled = false)
		public void customersellerupdatedispatchhistory() throws InterruptedException
		{
			order = new orderhomepage(driver);
			order.sellerupdatedispatchhistory(prop.getProperty("ownername"), prop.getProperty("password"));
		}
		
	// working
		@Test(priority =4, enabled = false)
		public void customerselleraddpayment() throws InterruptedException
		{
			order = new orderhomepage(driver);
			order.selleraddpayment(prop.getProperty("ownername"), prop.getProperty("password"));
		}

}
