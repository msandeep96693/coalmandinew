package pageobject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath = "(//span[.='Select business profile'])[1]")
	private WebElement clickonbusinessprofiledropdown;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchtextfield;
	
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
	
	@FindBy(xpath = "//span[@aria-label='user']")
	private WebElement clickonprofileicon;
	
	@FindBy(xpath = "//span[.='Logout']")
	private WebElement logoutbtn;
	
	
	// negotiation
	
	@FindBy(xpath = "//button[.='Negotiate']")
	private WebElement listingdetailsnegotiationbtn;

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
	
	
	// split order modal page
	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> splitordermodalcheckbox;
	
	@FindBy(xpath = "//button[.='Confirm Split']")
	private WebElement splitorderbtn;
	
	// other party negotiation xpath
	@FindBy(xpath = "//button[.='Negotiations']")
	private WebElement leftnavnegotiationbtn;
	
	@FindBy(xpath = "(//div[.='Participated'])[2]")
	private WebElement participatedtabbtn;
	
	@FindBy(xpath = "//button[.='View Details']")
	private List<WebElement> participatedviewdetailsbutton;
	
	@FindBy(xpath = "//div[@class='ant-card-body']")
	private List<WebElement> participatedlistinglist;
	
	
	
	
	public void ExpressInterestOrdergenerate(String email, String pwd, String businessname ) throws InterruptedException
	{		
		
		
//		waitforElement(pagination2);
//		javascriptclick(pagination2);
		
//		for(int i = 0; i<viewdetailsbtn.size(); i++)
//		{
//			Thread.sleep(1000);
//		    javascriptclick(viewdetailsbtn.get(2));	
//			break;
//		}
		
		Thread.sleep(5000);

		switchtoanothertab();

		
		
		
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
//		clickonbusinessprofiledropdown.click();
		
		waitforElement(searchtextfield);
		searchtextfield.sendKeys(businessname);
		
		searchtextfield.sendKeys(Keys.ENTER);
		
		waitforElement(clickonsubmitbtn);
		javascriptclick(clickonsubmitbtn);
		
		
//		selectDropdownOption(selectthebusinessprofileoption, businessname);
		
		// enter otp into textfields and click enter button on keyboard
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(d -> verifyotppage.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
		
		Thread.sleep(1000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
		
	}
	
	public void negotiationordergeneratewithoutsplit(String email, String pwd, String businessname, 
			String offerQTY, String offerRATE ) throws InterruptedException
	{
		
		Thread.sleep(5000);

		switchtoanothertab();
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
		
		waitforElement(listingdetailsnegotiationbtn);
		javascriptclick(listingdetailsnegotiationbtn);
		
		waitforElement(clickonbusinessprofiledropdown);
		javascriptclick(clickonbusinessprofiledropdown);
//		clickonbusinessprofiledropdown.click();
		
		waitforElement(searchtextfield);
		searchtextfield.sendKeys(businessname);
		
		searchtextfield.sendKeys(Keys.ENTER);
		
		waitforElement(offerqtyfield);
		offerqtyfield.sendKeys(offerQTY);
		
		waitforElement(offerratefield);
		offerratefield.sendKeys(offerRATE);
		
		scrollBottomofPage();
		
		waitforElement(submitofferotpbtn);
		javascriptclick(submitofferotpbtn);
		
		Thread.sleep(4000);
		
		// enter otp into textfields and click enter button on keyboard
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
				wait.until(d -> verifyotppage.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
				
				Thread.sleep(1000);
				waitforElement(clickonprofileicon);
				javascriptclick(clickonprofileicon);
				
				waitforElement(logoutbtn);
				javascriptclick(logoutbtn);
			
	}
	
	
	public void negotiationordergeneratewithsplit(String email, String pwd, String businessname, 
			String offerQTY, String offerRATE ) throws InterruptedException
	{
		
		Thread.sleep(5000);

		switchtoanothertab();
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
		
		waitforElement(listingdetailsnegotiationbtn);
		javascriptclick(listingdetailsnegotiationbtn);
		
		// select the split order based on index
		for(int i = 0; i< splitordermodalcheckbox.size(); i++)
		{
			splitordermodalcheckbox.get(1).click();
			break;
		}
		
		waitforElement(splitorderbtn);
		javascriptclick(splitorderbtn);
		
		waitforElement(clickonbusinessprofiledropdown);
		javascriptclick(clickonbusinessprofiledropdown);
//		clickonbusinessprofiledropdown.click();
		
		waitforElement(searchtextfield);
		searchtextfield.sendKeys(businessname);
		
		searchtextfield.sendKeys(Keys.ENTER);
		
		waitforElement(offerqtyfield);
		offerqtyfield.sendKeys(offerQTY);
		
		waitforElement(offerratefield);
		offerratefield.sendKeys(offerRATE);
		
		scrollBottomofPage();
		
		waitforElement(submitofferotpbtn);
		javascriptclick(submitofferotpbtn);
		
		Thread.sleep(4000);
		
		// enter otp into textfields and click enter button on keyboard
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
				wait.until(d -> verifyotppage.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
				
				Thread.sleep(1000);
				waitforElement(clickonprofileicon);
				javascriptclick(clickonprofileicon);
				
				waitforElement(logoutbtn);
				javascriptclick(logoutbtn);
			
	}
	
	
	public void otherpartynegotiation(String email, String pwd, String businessname, 
			String offerQTY, String offerRATE ) throws InterruptedException
	{
		
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		waitforElement(leftnavnegotiationbtn);
		javascriptclick(leftnavnegotiationbtn);
		
		waitforElement(participatedtabbtn);
		javascriptclick(participatedtabbtn);
		
		clickViewButtonUsingContains("Ongoing");
		
		scrollBottomofPage();
		
		waitforElement(listingdetailsnegotiationbtn);
		javascriptclick(listingdetailsnegotiationbtn);
		
		// select the split order based on index
		for(int i = 0; i< splitordermodalcheckbox.size(); i++)
		{
			splitordermodalcheckbox.get(1).click();
			break;
		}
		
		waitforElement(splitorderbtn);
		javascriptclick(splitorderbtn);
		
		waitforElement(clickonbusinessprofiledropdown);
		javascriptclick(clickonbusinessprofiledropdown);
//		clickonbusinessprofiledropdown.click();
		
		waitforElement(searchtextfield);
		searchtextfield.sendKeys(businessname);
		
		searchtextfield.sendKeys(Keys.ENTER);
		
		waitforElement(offerqtyfield);
		offerqtyfield.sendKeys(offerQTY);
		
		waitforElement(offerratefield);
		offerratefield.sendKeys(offerRATE);
		
		scrollBottomofPage();
		
		waitforElement(submitofferotpbtn);
		javascriptclick(submitofferotpbtn);
		
		Thread.sleep(4000);
		
		// enter otp into textfields and click enter button on keyboard
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
				wait.until(d -> verifyotppage.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
				
				Thread.sleep(1000);
				waitforElement(clickonprofileicon);
				javascriptclick(clickonprofileicon);
				
				waitforElement(logoutbtn);
				javascriptclick(logoutbtn);
			
	}
	
	
	public void switchtoanothertab()
	{
		// Store current window handle
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent ID - "+ parentWindow);

		// Wait for new tab to appear
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(driver -> driver.getWindowHandles().size() > 1);

		// Switch to the newly opened tab
		for (String windowHandle : driver.getWindowHandles()) {
		    if (!windowHandle.equals(parentWindow)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		// Now you are in the new tab and can interact with elements there
		System.out.println("Switched to new tab: " + driver.getTitle());
	}
	
	public void clickViewButtonUsingContains(String statusTextToMatch) throws InterruptedException {

	    boolean found = false;

	    for (int i = 0; i < participatedlistinglist.size(); i++) {
	        
	    	Thread.sleep(2000);
	        String statusText = participatedlistinglist.get(i).getText().trim();
	        System.out.println("Row Status: " + statusText);

	        if (statusText.toLowerCase().contains(statusTextToMatch.toLowerCase())) {
	            
	            WebElement viewButton = participatedviewdetailsbutton.get(i);

	            // Scroll button into view
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewButton);
	            Thread.sleep(600);

	            // Click using JS for reliability
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewButton);
	            
	            System.out.println("✅ View button clicked for status containing: " + statusTextToMatch);
	            
	            found = true;
	            break;
	        }
	    }
}
}
