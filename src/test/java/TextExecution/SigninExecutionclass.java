package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.signinpage;

public class SigninExecutionclass extends Baseclass {
	
	
	
	//@Test(priority = 1)
	public void signinpage() throws InterruptedException
	{
		sign = new signinpage(driver);
	 sign.signinpage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	//@Test(priority = 0)
	public void signinloginwithotp()
	{
		sign = new signinpage(driver);
		System.out.println("check :- "+ driver);
		sign.signinwithotp(prop.getProperty("username1"));
	}
	
	@Test(priority = 2)
	public void signinwithinvalidpassword()
	{
		sign = new signinpage(driver);
		sign.signinwithinvalidpassword(prop.getProperty("username"), prop.getProperty("invalidpwd"));
	}
}
