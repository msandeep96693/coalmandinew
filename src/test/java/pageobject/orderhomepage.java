package pageobject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td")
	private List<WebElement> orderlistdata;
	
	@FindBy(xpath = "//button[.='Select Vendors']")
	private WebElement selectvendorbutton;
	
	@FindBy(xpath = "//div[@class='space-y-4']/div/div")
	private List<WebElement> selectlistofvendors;
	
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement selectvendorsbtn;
	
	@FindBy(xpath = "//button[.='View Details']")
	private List<WebElement> participatedviewdetailsbutton;
	
	@FindBy(xpath = "(//button[.='Split Order'])[1]")
	private WebElement splitorderbtn1;
	
	@FindBy(xpath = "(//button[.='Split Order'])[2]")
	private WebElement splitorderbtn2;
	
	@FindBy(xpath = "(//input[@type='number'])[2]")
	private WebElement numberofsplitfield;
	
	@FindBy(xpath = "(//input[@type='number'])[3]")
	private WebElement splitqty1field;
	
	@FindBy(xpath = "(//input[@type='number'])[4]")
	private WebElement splitqty2field;
	
	@FindBy(xpath = "(//button[contains(., 'Select')])[1]")
	private WebElement selectIIAbutton1;
	
	@FindBy(xpath = "(//button[contains(., 'Select')])[2]")
	private WebElement selectIIAbutton2;
	
	
	@FindBy(xpath = "//button[.='Submit']")
	private WebElement submitbtn;
	
	@FindBy(xpath = "//span[@aria-label='user']")
	private WebElement clickonprofileicon;
	
	@FindBy(xpath = "//span[.='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath = "//h4[.='Seller']")
	private WebElement sellerbtn;
	
	@FindBy(xpath = "//button[.='Continue as Seller']")
	private WebElement continueassellerbtn;
	
	@FindBy(xpath = "//span[.='Vendor Selection Pending']")
	private List<WebElement> vendorselectionstatus;
	
	@FindBy(xpath = "//span[.='Pending Release']")
	private List<WebElement> pendingreleasestatus;
	
	
	
	
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
			String listdata = orderlistdata.get(1).getText();
			System.out.println(" list data :- "+listdata);
		}
		
		
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);

		
	}
	
	public void Buyersplitorderandselectvendor(String email, String pwd, String actionstatusname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		
		// click on nav listing  button
		waitforElement(leftnavorderbutton);
		javascriptclick(leftnavorderbutton);
		
//		clickViewDetailsByStatus(actionstatusname);  // Vendor Selection Pending
//		Thread.sleep(2000);
		clickViewDetailsForVendorSelectionPending();
		
//		clickviewdetailsbuttonsContains("View");
		
		waitforElement(splitorderbtn1);
		splitorderbtn1.click();
		
		waitforElement(splitorderbtn2);
		splitorderbtn2.click();
		
		waitforElement(numberofsplitfield);
		numberofsplitfield.sendKeys("2");
		
		waitforElement(splitqty1field);
		splitqty1field.sendKeys("100");
		
		waitforElement(splitqty2field);
		splitqty2field.sendKeys("100");
		
		waitforElement(submitbtn);
		javascriptclick(submitbtn);
		
		waitforElement(selectIIAbutton1);
		selectIIAbutton1.click();
		
		selectFirstThreeCheckboxes(selectlistofvendors);
		Thread.sleep(200);
		
		waitforElement(selectIIAbutton2);
		javascriptclick(selectIIAbutton2);
		
		Thread.sleep(3000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
		
	}
	
	public void Ownerorderselectvendor(String email, String pwd, String actionstatusname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		waitforElement(sellerbtn);
		javascriptclick(sellerbtn);
		
		waitforElement(continueassellerbtn);
		javascriptclick(continueassellerbtn);
		
		// click on nav listing  button
		waitforElement(leftnavorderbutton);
		javascriptclick(leftnavorderbutton);
		
		clickViewDetailsForVendorSelectionPending();
		
		waitforElement(selectIIAbutton1);
		selectIIAbutton1.click();
		
		selectFirstThreeCheckboxes(selectlistofvendors);
		Thread.sleep(200);
		
		waitforElement(selectIIAbutton2);
		javascriptclick(selectIIAbutton2);
		
		Thread.sleep(3000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
		
	}
	
	// pending dispatch
	
	// pending payment
	
	

	public void clickViewDetailsForVendorSelectionPending() {

	    for (WebElement status : vendorselectionstatus) {

	        if (status.getText().trim().equalsIgnoreCase("Vendor Selection Pending")) {

	            // Go to the same row/card where status exists
	            WebElement container = status.findElement(
	                By.xpath("./ancestor::tr | ./ancestor::div[contains(@class,'row')] | ./ancestor::div[contains(@class,'card')]")
	            );

	            // Find View Details button inside same container
	            WebElement viewDetailsBtn = container.findElement(
	                By.xpath(".//button[normalize-space()='View Details']")
	            );

	            ((JavascriptExecutor) driver)
	                    .executeScript("arguments[0].scrollIntoView(true);", viewDetailsBtn);

	            ((JavascriptExecutor) driver)
	                    .executeScript("arguments[0].click();", viewDetailsBtn);

	            System.out.println("✅ View Details clicked for Vendor Selection Pending");
	            return;
	        }
	    }

	    throw new RuntimeException("❌ Vendor Selection Pending status not found");
	}
	
	public void clickViewDetailsForpendingreleasestatus() {

	    for (WebElement status : vendorselectionstatus) {

	        if (status.getText().trim().equalsIgnoreCase("Vendor Selection Pending")) {

	            // Go to the same row/card where status exists
	            WebElement container = status.findElement(
	                By.xpath("./ancestor::tr | ./ancestor::div[contains(@class,'row')] | ./ancestor::div[contains(@class,'card')]")
	            );

	            // Find View Details button inside same container
	            WebElement viewDetailsBtn = container.findElement(
	                By.xpath(".//button[normalize-space()='View Details']")
	            );

	            ((JavascriptExecutor) driver)
	                    .executeScript("arguments[0].scrollIntoView(true);", viewDetailsBtn);

	            ((JavascriptExecutor) driver)
	                    .executeScript("arguments[0].click();", viewDetailsBtn);

	            System.out.println("✅ View Details clicked for Vendor Selection Pending");
	            return;
	        }
	    }

	    throw new RuntimeException("❌ Vendor Selection Pending status not found");
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
	
	public void clickviewdetailsbuttonsContains(String statusTextToMatch) throws InterruptedException {

	    boolean found = false;

	    for (int i = 0; i < viewdetailsbutton.size(); i++) {
	        
	    	Thread.sleep(2000);
	        String statusText = viewdetailsbutton.get(0).getText().trim();
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
