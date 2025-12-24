package pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class listinghomepage extends Basicpage {

	public listinghomepage(WebDriver driver) {
		super(driver);
		
	}
	
	// my listing xpath element address and Participated section 
	
	@FindBy(xpath = "//input[@type='text']") 
	private WebElement searchtextfield; 
	
	@FindBy(xpath = "//span[@title='All Status']")
	private WebElement clickonstatusdropdown;
	
	@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']/div") 
	private List<WebElement> statusdropdownoptions; 
	
	@FindBy(xpath = "//td[@class='ant-table-cell']/span") 
	private List<WebElement> listofdatabasedonstatusselection; 
 	
	@FindBy(xpath = "//div[.='Participated']")
	private WebElement participatedtab;
	
	@FindBy(xpath = "//button[.='Listing']")
	private WebElement navlistingbutton;
	
	@FindBy(xpath = "//h4[.='Seller']")
	private WebElement sellerbtn;
	
	@FindBy(xpath = "//button[.='Continue as Seller']")
	private WebElement continueassellerbtn;
	
	@FindBy(xpath = "//span[@aria-label='user']")
	private WebElement clickonprofileicon;
	
	@FindBy(xpath = "//span[.='Logout']")
	private WebElement logoutbtn;
	
	public void Mylistingsearchstatusfilterscenario(String email, String pwd, String searchbycoalname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		waitforElement(sellerbtn);
		javascriptclick(sellerbtn);
		
		waitforElement(continueassellerbtn);
		javascriptclick(continueassellerbtn);
		
		// left navigation listing button 
		waitforElement(navlistingbutton);
		javascriptclick(navlistingbutton);
		
		// search textfield 
		searchtextfield.sendKeys(searchbycoalname); 
		
		// list the data based on a search name
		for (int i = 0; i < listofdatabasedonstatusselection.size(); i++) 
		{
			String searchtext = listofdatabasedonstatusselection.get(i).getText().trim();
	        System.out.println("list count data :- "+ listofdatabasedonstatusselection.size());
	        System.out.println("Search text : - "+searchtext);
		}
		
		searchtextfield.click();
		searchtextfield.sendKeys(Keys.CONTROL, "A");
		searchtextfield.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(500);
		
		waitforElement(clickonstatusdropdown);
		clickonstatusdropdown.click();
		
		statusdropdownoptions.get(1).click();
		
		Thread.sleep(1000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
	}
	
	
	public void Participdatedsectionsearchfunctionality(String email, String pwd, String participatedsearchbycoalname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		waitforElement(sellerbtn);
		javascriptclick(sellerbtn);
		
		waitforElement(continueassellerbtn);
		javascriptclick(continueassellerbtn);
		
		// left navigation listing button 
		waitforElement(navlistingbutton);
		javascriptclick(navlistingbutton);
		
		// click on participated section
		waitforElement(participatedtab);
		javascriptclick(participatedtab);
		
		// search textfield 
		searchtextfield.sendKeys(participatedsearchbycoalname); 
		
		Thread.sleep(1000);
		// list the data based on a search name
		for (int i = 0; i < listofdatabasedonstatusselection.size(); i++) 
		{
			String searchtext = listofdatabasedonstatusselection.get(0).getText().trim();
	        System.out.println("list count data :- "+ listofdatabasedonstatusselection.size());
	        System.out.println("Search text : - "+searchtext);
		}
		
		searchtextfield.click();
		searchtextfield.sendKeys(Keys.CONTROL, "A");
		searchtextfield.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(500);
		
		waitforElement(clickonstatusdropdown);
		clickonstatusdropdown.click();
		
		javascriptclick(statusdropdownoptions.get(1));
		
		Thread.sleep(1000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
	}
	
	
	


	

	
	

}
