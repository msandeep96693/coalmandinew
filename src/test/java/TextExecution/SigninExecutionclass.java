package TextExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.signinpage;

public class SigninExecutionclass extends Baseclass {
	
	
	
	@Test(priority = 1, enabled = false)
	public void signinpage() throws InterruptedException
	{
		sign = new signinpage(driver);
	 sign.signinpage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 0, enabled = false)
	public void signinloginwithotp()
	{
		sign = new signinpage(driver);
		System.out.println("check :- "+ driver);
		sign.signinwithotp(prop.getProperty("username"));
	}
	
	@Test(priority = 2, enabled = false)
	public void signinwithinvalidpassword()
	{
		sign = new signinpage(driver);
		sign.signinwithinvalidpassword(prop.getProperty("username"), prop.getProperty("invalidpwd"));
	}
	
	@Test(priority = 3, enabled = true)
	public void signinwithinvalidemailID()
	{
		sign = new signinpage(driver);
		sign.signinwithinvalidemailID(prop.getProperty("invalidemailID"), "password");
	}
}
