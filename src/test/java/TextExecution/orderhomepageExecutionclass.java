package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.orderhomepage;

public class orderhomepageExecutionclass extends Baseclass {
	
	//@Test(priority = 0, enabled = true)
	public void orderlistsearchfunctionality() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.Orderlistsearchscenario(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("searchbycoalname"));
	}

	
	//@Test(priority = 1, enabled = true)
	public void orderlistallstatusdropdownfunctionality() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.orderlistfetchstatus(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("statusoptionname"));
	}
	
	@Test(priority = 2)
	public void orderlistselectvendor() throws InterruptedException
	{
		order = new orderhomepage(driver);
		order.Buyerordersplitandselectvendor(prop.getProperty("username"), prop.getProperty("password"),
				prop.getProperty("actionstatusname"));
	}
	
	
	

}
