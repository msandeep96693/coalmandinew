package pageobject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath = "//button[.='View Details']")
	private List<WebElement> viewdetailsbutton;
	
	@FindBy(xpath = "//div[@class='ant-card-body']")
	private List<WebElement> orderlistdata;
	
	@FindBy(xpath = "//button[.='Select Vendors']")
	private WebElement selectvendorbutton;
	
	@FindBy(xpath = "//div[@class='space-y-4']/div/div")
	private List<WebElement> selectlistofvendors;
	
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement selectvendorsbtn;
	
	@FindBy(xpath = "//span[@aria-label='user']")
	private WebElement clickonprofileicon;
	
	@FindBy(xpath = "//span[.='Logout']")
	private WebElement logoutbtn;
	
	
	public void Orderlistsearchscenario(String email, String pwd, String searchbycoalname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		// left navigation listing button
		waitforElement(leftnavorderbutton);
		javascriptclick(leftnavorderbutton);
		
		Thread.sleep(2000);
		// search textfield
		waitforElement(searchtextfield);
		searchtextfield.sendKeys(searchbycoalname);
		
		Thread.sleep(1000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
		
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
		
		Thread.sleep(1000);
		for(int i = 0; i<orderlistdata.size(); i++)
		{
			String listdata = orderlistdata.get(0).getText();
			System.out.println(" list data :- "+listdata);
		}
		
		
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);

		
	}
	
	public void orderselectvendor(String email, String pwd, String actionstatusname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		// click on nav listing  button
		waitforElement(leftnavorderbutton);
		javascriptclick(leftnavorderbutton);
		
		clickViewButtonUsingContains(actionstatusname);  // Vendor Selection Pending
		Thread.sleep(2000);
		
		scrollBottomofPage();
		
		waitforElement(selectvendorbutton);
		selectvendorbutton.click();
		
		selectFirstThreeCheckboxes(selectlistofvendors);
		Thread.sleep(200);
		
		waitforElement(selectvendorbutton);
		javascriptclick(selectvendorsbtn);
		
		Thread.sleep(3000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
		
	}
	

	public void clickViewButtonUsingContains(String statusTextToMatch) throws InterruptedException {

	    boolean found = false;

	    for (int i = 0; i < orderlistdata.size(); i++) {
	        
	        String statusText = orderlistdata.get(i).getText().trim();
	        System.out.println("Row Status: " + statusText);

	        if (statusText.toLowerCase().contains(statusTextToMatch.toLowerCase())) {
	            
	            WebElement viewButton = viewdetailsbutton.get(i);

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

	    if (!found) {
	        System.out.println("❌ No row found with status containing: " + statusTextToMatch);
	    }
	}

	public void selectFirstThreeCheckboxes(List<WebElement> listofvendors) {

	    int count = Math.min(3, listofvendors.size()); // ✅ Prevents IndexOutOfBounds

	    for (int i = 0; i < count; i++) {
	        WebElement checkbox = listofvendors.get(i);

	        if (!checkbox.isSelected()) {
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
	            System.out.println("✅ Checkbox selected at index: " + i);
	        } else {
	            System.out.println("⚠ Checkbox already selected at index: " + i);
	        }
	    }
	}


	
}
