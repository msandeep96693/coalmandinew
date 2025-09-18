package pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basepackage.Baseclass;


public class signinpage  extends Basicpage  {
	
	public signinpage(WebDriver driver)
	{
		super(driver);
	}
	
	// Address - xpath 
	
	
	@FindBy(xpath = "(//input[@type='text'])[1]") 
	private WebElement emailfield;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passwordfield;
	
	@FindBy(xpath = "(//span[text()='Log in'])[1]/..") 
	private WebElement siginbtn;
	
	@FindBy(xpath = "(//button[@type='button'])[1]") 
	private WebElement LoginwithOTPbutton;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement verifyloginbtn;
	
	@FindBy(xpath = "(((//h2[.='Enter OTP'])[2]/../following-sibling::div)[1]/form/div)[1]/div/div/div/div/div/div/input") 
	private List<WebElement> listofOTPnumberfield;
	
	@FindBy(xpath = "(//ul[@role='menu'])[1]/li") 
	private List<WebElement> leftnavigationfeaturename;
	
	@FindBy(xpath = "//div[.='Login successful']") 
	private WebElement loginconfirmationmessage; 
	
	@FindBy(xpath = "//div[@class='ant-notification-notice-message']")
	private WebElement invalidpasswordresponsemessage;
	
	@FindBy(xpath = "//div[@class='ant-notification-notice-message']")
	private WebElement emailnotregisteredresponsemessage;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/div[3]/form/div[1]/div/div/div/div/div/div/input")
	private List<WebElement> listofinputfield;
	
//	@FindBy(xpath = "//span[@aria-label='user']") 
//	private WebElement clickonprofile;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/header/div/div[2]/div[2]/span[2]") 
	private WebElement clickonprofile;
	
	@FindBy(xpath = "//span[contains(.,'Logout')]")    // //span[.='Logout']
	private WebElement clickonlogoutbtn;
	
	
	public void signinpage(String email, String pwd) throws InterruptedException
	{
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
			
	}
	
	public void signinwithotp(String email1)
	{
		// enter a email
		waitforElement(emailfield);
		emailfield.sendKeys(email1);
		
		// click on login with OTP
		waitforElement(LoginwithOTPbutton);
		javascriptclick(LoginwithOTPbutton);
		
		// wait a page for entering a OTP into the fields and click on verify login button 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(d -> listofinputfield.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
		 
		 // click on profile
		 waitforElement(clickonprofile);
		 javascriptclick(clickonprofile);
		 
		 // click on logout button
		 waitforElement(clickonlogoutbtn);
		 javascriptclick(clickonlogoutbtn);
	}
	
	public void signinwithinvalidpassword(String email, String invalidpassword)
	{
		// enter a mail
		waitforElement(emailfield);
		emailfield.sendKeys(email);
		
		// enter invalid password
		waitforElement(passwordfield);
		passwordfield.sendKeys(invalidpassword);
		
		// click on sign in button
		javascriptclick(siginbtn);
	}
	
	public void signinwithinvalidemailID(String invalidemail, String password)
	{
		// enter a mail
		waitforElement(emailfield);
		emailfield.sendKeys(invalidemail);
		
		// enter invalid password
		waitforElement(passwordfield);
		passwordfield.sendKeys(password);
		
		// click on sign in button
		javascriptclick(siginbtn);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.getCurrentUrl()); 
	}
	
 }
	
	


