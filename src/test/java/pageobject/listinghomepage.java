package pageobject;

import java.util.List;

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
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']") 
	private List<WebElement> statusdropdownoptions;
	
	@FindBy(xpath = "//div[@class='ant-card-extra']")
	private List<WebElement> listofdatabasedonstatusselection;
 	
	@FindBy(xpath = "//div[.='Participated']")
	private WebElement participatedtab;
	
	@FindBy(xpath = "//button[.='Listing']")
	private WebElement navlistingbutton;
	
	public void Mylistingsearchscenario(String email, String pwd, String searchbycoalname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
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
		
		Thread.sleep(2000);
	}
	
	
	public void Mylistingfetchstatus(String email, String pwd, String optionname ) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		// click on nav listing  button
		waitforElement(navlistingbutton);
		javascriptclick(navlistingbutton);
		
		Thread.sleep(6000);
		
		// click on all status dropdown
		waitforElement(clickonstatusdropdown);
//		javascriptclick(clickonstatusdropdown);
		clickonstatusdropdown.click();
		
		// select the option based on a name
		selectDropdownOption(statusdropdownoptions, optionname);

		// Based on option selection, list of data are displayed
		for (int i = 0; i < listofdatabasedonstatusselection.size(); i++) 
		{
			String searchtext = listofdatabasedonstatusselection.get(i).getText().trim();
	        System.out.println("list count data :- "+ listofdatabasedonstatusselection.size());
	        System.out.println("Search text : - "+searchtext);
		}
		
		//Thread.sleep(1000);
		
	}
	
	public void Participdatedsectionsearchfunctionality(String email, String pwd, String searchbycoalname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		// click on nav listing  button
		waitforElement(navlistingbutton);
		javascriptclick(navlistingbutton);
		
		// click on participated section
		waitforElement(participatedtab);
		javascriptclick(participatedtab);
		
		// search textfield
		searchtextfield.sendKeys(searchbycoalname);
		
		// participated list the data based on a search name
		for (int i = 0; i < listofdatabasedonstatusselection.size(); i++) 
		{
			String searchtext = listofdatabasedonstatusselection.get(i).getText().trim();
	        System.out.println("list count data :- "+ listofdatabasedonstatusselection.size());
	        System.out.println("Search text : - "+searchtext);
		}
		
		Thread.sleep(2000);
	}
	
	
	public void Participatedsectionfetchstatus(String email, String pwd, String optionname ) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		// click on nav listing  button
		waitforElement(navlistingbutton);
		javascriptclick(navlistingbutton);
		
		// click on participated section
		waitforElement(participatedtab);
		javascriptclick(participatedtab);
		
		Thread.sleep(4000);
		
		// click on all status dropdown
		waitforElement(clickonstatusdropdown);
		clickonstatusdropdown.click();
		
		// select the option based on a name 
		selectDropdownOption(statusdropdownoptions, optionname);

		// Based on option selection, list of data are displayed
		for (int i = 0; i < listofdatabasedonstatusselection.size(); i++) 
		{
			String searchtext = listofdatabasedonstatusselection.get(i).getText().trim();
	        System.out.println("list count data :- "+ listofdatabasedonstatusselection.size());
	        System.out.println("Search text : - "+searchtext);
		}
		
		Thread.sleep(2000);
	}


	

	
	

}
