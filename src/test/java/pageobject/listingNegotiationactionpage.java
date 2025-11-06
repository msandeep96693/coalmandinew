package pageobject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class listingNegotiationactionpage extends Basicpage {

	public listingNegotiationactionpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@class='btn']")
	private List<WebElement> viewdetailsbtn;
	
	@FindBy(xpath = "//button[@class='pag-btn active']")
	private WebElement pagination2;
	
	@FindBy(xpath = "//button[.='Express Interest']")
	private WebElement expressinterestbtn;
	
	@FindBy(xpath = "((//div[@class='space-y-4'])[2]/div)[2]/div")
	private List<WebElement> selectthesplitlisting;
	
	@FindBy(xpath = "(//span[.='Select business profile'])[2]")
	private WebElement clickonbusinessprofiledropdown;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']")
	private List<WebElement> selectthebusinessprofileoption;
	
	@FindBy(xpath = "//button[.='Confirm']")
	private WebElement clickonsubmitbtn;
	
	@FindBy(xpath = "//div[@class='ant-form-item-control-input']/div/div/input")
	private List<WebElement> verifyotppage;
	
	@FindBy(xpath = "(//input[@type='text'])[1]") 
	private WebElement emailfield;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passwordfield;
	
	@FindBy(xpath = "(//span[text()='Log in'])[1]/..") 
	private WebElement siginbtn;
	
	
	// negotiation
	
	@FindBy(xpath = "//button[.='Negotiate']")
	private WebElement negotiationbtnlistingdetails;

	@FindBy(xpath = "(//span[.='Select business profile'])[2]")
	private WebElement clickbusinessprofile;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']")
	private List<WebElement> businessprofiledropdownoption;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement offerqtyfield;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement offerratefield;
	
	@FindBy(xpath = "//button[.='Submit Offer (OTP Required)']")
	private WebElement submitofferotpbtn;
	
	
	
	public void ExpressInterestOrdergenerate(String email, String pwd, String businessname ) throws InterruptedException
	{
		//driver.get("https://coalmandi-api.rokkun.dev/static/active.html");
		//driver.manage().window().maximize();
		
		
		
		waitforElement(pagination2);
		javascriptclick(pagination2);
		
		for(int i = 0; i<viewdetailsbtn.size(); i++)
		{
			Thread.sleep(1000);
		    javascriptclick(viewdetailsbtn.get(2));	
			break;
		}
		
		Thread.sleep(10000);
		
		// enter a email 
					waitforElement(emailfield);
					emailfield.sendKeys(email);
					// enter a password
					waitforElement(passwordfield);
					passwordfield.sendKeys(pwd);
							// click on signin button
							waitforElement(siginbtn);
							JavascriptExecutor js = (JavascriptExecutor)driver;
							js.executeScript("arguments[0].click();", siginbtn );
							
							Thread.sleep(2000);

		
		scrollBottomofPage();
		
		waitforElement(expressinterestbtn);
		expressinterestbtn.click();
		
		waitforElement(clickonbusinessprofiledropdown);
		javascriptclick(clickonbusinessprofiledropdown);
		
		selectDropdownOption(selectthebusinessprofileoption, businessname);
		
		// enter otp into textfields and click enter button on keyboard
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(d -> verifyotppage.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
				
		Thread.sleep(2000);
		
	}
	
	public void negotiationordergenerate()
	{
		scrollBottomofPage();
		
		waitforElement(negotiationbtnlistingdetails);
		javascriptclick(negotiationbtnlistingdetails);
		
		
		
		selectDropdownOption(businessprofiledropdownoption, null);
		
		
		
	}
}
