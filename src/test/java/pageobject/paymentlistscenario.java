package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class paymentlistscenario extends Basicpage{

	public paymentlistscenario(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//button[.='Payments']")
	private WebElement paymentsidebtn;
	
	@FindBy(xpath = "//input[@placeholder='Start Date']")
	private WebElement clickonstartdatecalender;
	
	@FindBy(xpath = "//input[@placeholder='End Date']")
	private WebElement clickonenddatecalender;
	
	@FindBy(xpath = "//div[@class='ant-picker-body']/table//tbody/tr/td/div")
	private List<WebElement> listofdateinamonth;
	
	@FindBy(xpath = "//span[.='All Status']")	
	private WebElement clickonstatusdropdown;
	
	@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']")
	private List<WebElement> statusoptions;
	
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td/span")
	private List<WebElement> listofpaymentdata;
	
	@FindBy(xpath = "//h4[.='Seller']")
	private WebElement sellerbtn;
	
	@FindBy(xpath = "//button[.='Continue as Seller']")
	private WebElement continueassellerbtn;
	
	@FindBy(xpath = "//span[@aria-label='user']")
	private WebElement clickonprofileicon;
	
	@FindBy(xpath = "//span[.='Logout']")
	private WebElement logoutbtn;
	
	public void paymentdateandstatusfilterscenario(String email, String pwd) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		waitforElement(sellerbtn);
		javascriptclick(sellerbtn);
		
		waitforElement(continueassellerbtn);
		javascriptclick(continueassellerbtn);
		
		// left navigation listing button
		waitforElement(paymentsidebtn);
		javascriptclick(paymentsidebtn);
		
		waitforElement(clickonstartdatecalender);
		javascriptclick(clickonstartdatecalender);
		
		selectstartenddate("24");
		
		waitforElement(clickonenddatecalender);
		javascriptclick(clickonenddatecalender);
		
		selectstartenddate("25");
		
		waitforElement(clickonstatusdropdown);
		clickonstatusdropdown.click();
//		javascriptclick(clickonstatusdropdown);
		
		statusoptions.get(0).click();
		
		Thread.sleep(1000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
		
		
	}

	public void selectstartenddate(String startenddate)
	{
		for(int i = 0; i < listofdateinamonth.size(); i++)
		{
			
			 WebElement date = listofdateinamonth.get(i);
			 String selectdate = date.getText();
			 if(selectdate.contains(startenddate) || selectdate.equalsIgnoreCase(startenddate))
			 {
//				 date.click();
				 javascriptclick(date);
				 break;
			 }
		}
	}
	
	
}
