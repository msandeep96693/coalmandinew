package pageobject;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	// dispatch
	
	@FindBy(xpath = "//span[.='All Status']")
	private WebElement clickonallstatusdropdown;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']")
	private List<WebElement> statusdropdownoption; 
	
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td/div/span")  
	private List<WebElement> allStatusnames;
	
	// kpo address
	@FindBy(xpath = "//td[@class='ant-table-cell']/div/span")
	private List<WebElement> subcontractstatusnames;
	
	// customer address
	@FindBy(xpath = "//td[@class='ant-table-cell']/div/span")
	private List<WebElement> subcontractstatusnames1;
	
	@FindBy(xpath = "//button[.='Dispatches']")
	private WebElement dispatchsection;
	
	@FindBy(xpath = "//span[.='Add New Dispatch']")
	private WebElement addnewdispatchbtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter quantity']")
	private WebElement enterqtyfield;
	
	@FindBy(xpath = "//span[.='Select the dispatch date']")
	private WebElement clickonselectthedispatchdatefield;
	
	@FindBy(xpath = "//input[@placeholder='Enter truck/train number']")
	private WebElement entertrucktrainnumberfield;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement uploadfile;
	
	@FindBy(xpath = "//button[.='Add Dispatch']")
	private WebElement adddispatchbtn;
	
	@FindBy(xpath = "//button[.='View Details']")
	private List<WebElement> viewdetailsbtn;
	
	@FindBy(xpath = "//div[.='View Dispatch History']")
	private WebElement clickviewdispatchhistory;
	
	@FindBy(xpath = "//button[.='In Transit']")
	private List<WebElement> clickontransitdropdown;
	
	@FindBy(xpath = "//button[.='Delivered']")
	private WebElement deliveredoptions;
	
	@FindBy(xpath = "//span[.='Close']")
	private WebElement closebtn;
	
	// payments
	
	@FindBy(xpath = "(//button[.='Payments'])[2]")
	private WebElement paymentsection;
	
	@FindBy(xpath = "//span[.='Add Payment']")
	private WebElement addpaymentbtn;
	
	@FindBy(xpath = "//div[@class='relative w-full']")
	private WebElement clickondateofpaymentcalender;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement UTRnofield;
	
	@FindBy(xpath = "//input[@type='number']")
	private WebElement amountpaidfield;
	
	
	public void Orderlistsearchandstatusfilterscenario(String email, String pwd, String searchbycoalname) throws InterruptedException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		waitforElement(sellerbtn);
		javascriptclick(sellerbtn);
		
		waitforElement(continueassellerbtn);
		javascriptclick(continueassellerbtn);
		
		// left navigation listing button
		waitforElement(leftnavorderbutton);
		javascriptclick(leftnavorderbutton);
		
		Thread.sleep(1000);
		// search textfield
		searchtextfield.sendKeys(searchbycoalname);

		Thread.sleep(500);
		searchtextfield.click();
		searchtextfield.sendKeys(Keys.CONTROL, "A");
		searchtextfield.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(500);
		
		waitforElement(clickonstatusdropdown);
		clickonstatusdropdown.click();
		
		javascriptclick(statusdropdownoptions.get(2));
		
		Thread.sleep(1000);
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
	
	// dispatch
	
	public void selleradddispatch(String email, String pwd ) throws InterruptedException
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
		
		// inprogress status to add dispatch
		// index  0 - all status
		// index  1 - Pending Vendor Selection
		// index  2 - Pending Release
		// index  3 - Pending Signature
		// index  4 - Completed
		// index  5 - Cancelled
		// index  6 - In Progress
		
		waitforElement(clickonallstatusdropdown);
		clickonallstatusdropdown.click();
				
		javascriptclick(statusdropdownoption.get(3));
				

				// click on pending release / signature in a list 
//				Thread.sleep(2000);
//				WebElement status = allStatusnames.get(0);
//				javascriptclick(status);
				
				javascriptclick(viewdetailsbtn.get(0));  
				 
				Thread.sleep(1500);
				scrollBottomofPage();
				
//				// click on in-progress in a list
//				WebElement status2 = subcontractstatusnames.get(0);
//				javascriptclick(status2);
				javascriptclick(viewdetailsbtn.get(0));
				
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dispatchsection);
				
				waitforElement(dispatchsection);
				javascriptclick(dispatchsection);
//				dispatchsection.click();
				
				waitforElement(addnewdispatchbtn);
				javascriptclick(addnewdispatchbtn);
//				addnewdispatchbtn.click();
				
				waitforElement(enterqtyfield);
				enterqtyfield.sendKeys("10");
				
				waitforElement(clickonselectthedispatchdatefield);
				clickonselectthedispatchdatefield.click();
				
				// Click the calendar to open (update locator if needed)
		       WebElement clickdate = driver.findElement(By.xpath("//span[.='Select the dispatch date']/.."));
		       waitforElement(clickdate);
		       javascriptclick(clickdate);
				Thread.sleep(2000);
				
				selectDate("25-12-2025");
				
				waitforElement(entertrucktrainnumberfield);
				entertrucktrainnumberfield.sendKeys("kafas34,KD34643");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.display='block';", uploadfile);
				uploadfile.sendKeys("/home/active34/Downloads/photos /QA club photos/Club 7.png");
				
				Thread.sleep(3000);
				waitforElement(adddispatchbtn);
				adddispatchbtn.click();
				
				Thread.sleep(3000);
				waitforElement(clickonprofileicon);
				javascriptclick(clickonprofileicon);
				
				waitforElement(logoutbtn);
				javascriptclick(logoutbtn);
			
		
	}
	
	public void sellerupdatedispatchhistory(String email, String pwd ) throws InterruptedException
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
		
		// inprogress status to add dispatch
		// index  0 - all status
		// index  1 - Pending Vendor Selection
		// index  2 - Pending Release
		// index  3 - Pending Signature
		// index  4 - Completed
		// index  5 - Cancelled
		// index  6 - In Progress
		
		waitforElement(clickonallstatusdropdown);
		clickonallstatusdropdown.click();
				
		javascriptclick(statusdropdownoption.get(3));
				

				// click on pending release / signature in a list 
				
				javascriptclick(viewdetailsbtn.get(0));  
				 
				Thread.sleep(1500);
				scrollBottomofPage();
				
//				// click on in-progress in a list
				javascriptclick(viewdetailsbtn.get(0));
				
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dispatchsection);
				
				waitforElement(dispatchsection);
				javascriptclick(dispatchsection);

				Thread.sleep(1500);
				waitforElement(clickviewdispatchhistory);
				javascriptclick(clickviewdispatchhistory);
				Thread.sleep(1000);
				
				moveAllTransitToDelivered();
				
				waitforElement(closebtn);
				javascriptclick(closebtn);
				
				Thread.sleep(3000);
				waitforElement(clickonprofileicon);
				javascriptclick(clickonprofileicon);
				
				waitforElement(logoutbtn);
				javascriptclick(logoutbtn);
			
			}
	
	
	// pending payment
	public void selleraddpayment(String email, String pwd ) throws InterruptedException
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
		
		// inprogress status to add dispatch
		// index  0 - all status
		// index  1 - Pending Vendor Selection
		// index  2 - Pending Release
		// index  3 - Pending Signature
		// index  4 - Completed
		// index  5 - Cancelled
		// index  6 - In Progress
		
		waitforElement(clickonallstatusdropdown);
		clickonallstatusdropdown.click();
				
		javascriptclick(statusdropdownoption.get(3));
				

				// click on pending release / signature in a list 
				
				javascriptclick(viewdetailsbtn.get(0));  
				 
				Thread.sleep(1500);
				scrollBottomofPage();
				
//				// click on in-progress in a list
				javascriptclick(viewdetailsbtn.get(0));
				
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", paymentsection);
				
				waitforElement(paymentsection);
				javascriptclick(paymentsection);
				
				waitforElement(addpaymentbtn);
				javascriptclick(addpaymentbtn);
								
				 WebElement clickdate = driver.findElement(By.xpath("//div[@class='relative w-full']"));
			     javascriptclick(clickdate);
				
				selectdateofpayment("15-12-2025");
				
				waitforElement(UTRnofield);
				UTRnofield.sendKeys(setRandomMobileNumber());
				
				waitforElement(amountpaidfield);
				amountpaidfield.sendKeys("1000");
				
				waitforElement(submitbtn);
				javascriptclick(submitbtn);
				
				Thread.sleep(3000);
				waitforElement(clickonprofileicon);
				javascriptclick(clickonprofileicon);
				
				waitforElement(logoutbtn);
				javascriptclick(logoutbtn);
				
	}
	
	

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

	public void selectDate(String date) {
	    try {
	        // Convert dd-MM-yyyy to date object
	        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate selectedDate = LocalDate.parse(date, inputFormat);

	        // Convert to aria-label format e.g. "4 November 2025"
	        DateTimeFormatter ariaFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
	        String ariaLabelDate = selectedDate.format(ariaFormat);

	        System.out.println("Selecting date: " + ariaLabelDate);

	        // Click the calendar to open (update locator if needed)
	        driver.findElement(By.xpath("//span[.='Select the dispatch date']")).click();
	     
//	        Thread.sleep(3000);
	        // ✅ Dynamic XPath based on aria-label
	        WebElement dateElement = driver.findElement(By.xpath("//abbr[@aria-label='" + ariaLabelDate + "']/.."));

	        // Scroll into view (safe clicking)
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dateElement);
	        dateElement.click();

	        System.out.println("✅ Date selected: " + date);

	    } catch (Exception e) {
	        System.out.println("❌ Failed to select date: " + date);
	        e.printStackTrace();
	    }
	}
	
	public void selectdateofpayment(String date) {
	    try {
	        // Convert dd-MM-yyyy to date object
	        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate selectedDate = LocalDate.parse(date, inputFormat);

	        // Convert to aria-label format e.g. "4 November 2025"
	        DateTimeFormatter ariaFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
	        String ariaLabelDate = selectedDate.format(ariaFormat);

	        System.out.println("Selecting date: " + ariaLabelDate);

	        // Click the calendar to open (update locator if needed)
	        driver.findElement(By.xpath("//div[@class='relative w-full']")).click();
	     
//	        Thread.sleep(3000);
	        // ✅ Dynamic XPath based on aria-label
	        WebElement dateElement = driver.findElement(By.xpath("//abbr[@aria-label='" + ariaLabelDate + "']/.."));

	        // Scroll into view (safe clicking)
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dateElement);
	        dateElement.click();

	        System.out.println("✅ Date selected: " + date);

	    } catch (Exception e) {
	        System.out.println("❌ Failed to select date: " + date);
	        e.printStackTrace();
	    }
	}


		

		public void moveAllTransitToDelivered() {

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    JavascriptExecutor js = (JavascriptExecutor) driver;

		    By transitBy = By.xpath("//button[normalize-space()='In Transit']");

		    while (true) {

		        List<WebElement> transitButtons = driver.findElements(transitBy);

		        if (transitButtons.isEmpty()) {
		            System.out.println("✅ All Transit updated to Delivered");
		            break;
		        }

		        // 👉 Always take first Transit
		        WebElement transitBtn = transitButtons.get(0);

		        js.executeScript(
		            "arguments[0].scrollIntoView({behavior:'smooth', block:'center'});",
		            transitBtn
		        );

		        wait.until(ExpectedConditions.elementToBeClickable(transitBtn)).click();

		        // 🔑 VERY IMPORTANT:
		        // Find Delivered ONLY inside the same card
		        WebElement parentCard = transitBtn.findElement(
		                By.xpath("./parent::div/parent::div")
		        );

		        WebElement deliveredBtn = wait.until(
		                ExpectedConditions.elementToBeClickable(
		                        parentCard.findElement(
		                                By.xpath(".//button[normalize-space()='Delivered']")
		                        )
		                )
		        );

		        deliveredBtn.click();

		        // ✅ Wait until this button is no longer Transit
		        wait.until(ExpectedConditions.not(
		                ExpectedConditions.textToBePresentInElement(transitBtn, "In Transit")
		        ));
		    }
		}

	

	
}
