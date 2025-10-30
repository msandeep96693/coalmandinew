package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orderhomepage extends Basicpage {

	public orderhomepage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[.='Orders']")
	private WebElement leftnavorderbutton;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchtextfield;
	
	@FindBy(xpath = "//span[@title='All Status']" )
	private WebElement clickonstatusdropdown;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']") 
	private List<WebElement> statusdropdownoptions;
	
	public void Orderlistsearchscenario(String email, String pwd, String searchbycoalname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		// left navigation listing button
		waitforElement(leftnavorderbutton);
		javascriptclick(leftnavorderbutton);
		
		Thread.sleep(2000);
		// search textfield
		searchtextfield.sendKeys(searchbycoalname);
		
		Thread.sleep(1000);
	}
	
	
	public void orderlistfetchstatus(String email, String pwd, String optionname ) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		// click on nav listing  button
		waitforElement(leftnavorderbutton);
		javascriptclick(leftnavorderbutton);
		
		Thread.sleep(6000);
		
		// click on all status dropdown
		waitforElement(clickonstatusdropdown);
		clickonstatusdropdown.click();
		
		// select the option based on a name
		selectDropdownOption(statusdropdownoptions, optionname);

			
		
		//Thread.sleep(1000);
		
	}
	
	

	
}
