package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.paymentlistscenario;

public class customerpaymentlistExecutionclass extends Baseclass {

	// working
	@Test(priority = 0, enabled = true)
	public void paymentlistfunctionality() throws InterruptedException
	{
		paymentlistscenario payment = new paymentlistscenario(driver);
		payment.paymentdateandstatusfilterscenario(prop.getProperty("username"), prop.getProperty("password"));
	}
}
