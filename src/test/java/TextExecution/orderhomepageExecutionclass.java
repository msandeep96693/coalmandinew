package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.orderhomepage;

public class orderhomepageExecutionclass extends Baseclass {
	
	@Test(priority = 0, enabled = false)
	public void orderlistsearchfunctionality() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.Orderlistsearchscenario(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"));
	}

	
	@Test(priority = 1, enabled = false)
	public void orderlistallstatusdropdownfunctionality() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.orderlistfetchstatus(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("statusoptionname"));
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
	@Test(priority =3, enabled = true)
	public void ownerorderselectvendor() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.Ownerorderselectvendor(prop.getProperty("ownername"), prop.getProperty("password"),
				prop.getProperty("actionstatusname"));
	}
	
	
	

}
