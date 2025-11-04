package pageobject;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createCILsplitlistingpage extends Basicpage {
	
	public createCILsplitlistingpage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath = "//button[.='Listing']")
	private WebElement navlistingbutton;
	
	@FindBy(xpath = "//span[contains(.,'Create Listing Item')]")  // //span[.='Create Listing Item']
	private WebElement createlistingitembutton;
	
	@FindBy(xpath = "//label[@class='ant-form-item-required']")
	private List<WebElement> fetchallthelabelname;
	
	@FindBy(xpath = "//span[@class='ant-select-selection-item']")  // //div[@class='ant-select-selector']
	private List<WebElement> clickonalldropdown;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']") //    //div[@class='ant-select-item-option-content']
	private List<WebElement> Alldropdownoptionlist;
	
	@FindBy(xpath = "//div[@class='ant-form-item-control-input-content']/input")
	private List<WebElement> Allinputfield;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")
	private WebElement fixedcarbonfield;
	
	@FindBy(xpath = "(//input[@type='number'])[2]")
	private WebElement fixedashfield;
	
	@FindBy(xpath = "(//input[@type='number'])[3]")
	private WebElement volatilematterpercentagefield;
	
	@FindBy(xpath = "(//input[@type='number'])[4]")
	private WebElement moisturepercentagefield;
	
	// fixed carbon, moisture and etc field address and EMD%, credit days
	@FindBy(xpath = "//input[@type='number']") 
	private List<WebElement> coalspecificationinputfield;
	
	// siding code, Quantity, Rate per MT, Free payment peroid input field
	@FindBy(xpath = "//input[@type='text']")
	private List<WebElement> alllogisticsinputfield;
	
	// loading point address and other remarks textarea
	@FindBy(xpath = "//textarea") 
	private WebElement textareainputfield;
	
	// Upload document
	@FindBy(xpath = "//input[@type='file']")
	private WebElement uploadfiles;
	
	@FindBy(xpath = "//button[.//span[text()='Create Listing']]")  //  //button[@type='submit']
	private WebElement createlistingbutton;
	
	@FindBy(xpath = "//div[.='My Listings']") 
	private WebElement mylistingtabname;
	
//	verfiy the source coal and pensing status name in Mylisting page after create a listing
	@FindBy(xpath = "//div[contains(@class,'ant-card-head-title')]/..")
	private WebElement verifycoalnameandpendingstatusname;
	
	@FindBy(xpath = "//div[@class='relative w-full']")
	private List<WebElement> validitystartandendfield;
	
	@FindBy(xpath = "(//div[@class='relative w-full'])[1]")
	private WebElement startdatefield;
	
	// For private mines 
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[12]")
	private WebElement clickondeliverydropdown1;
	// For CIL 
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[8]")
	private WebElement clickondeliverydropdown2;
	
	
	
	// -----------------------
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']")
	private List<WebElement> deliveryoptions;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement qtyfield;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement ratefield;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement freepaymentfield;
	
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[9]")
	private WebElement clickdeliverytermsdropdown;
	
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[10]")
	private WebElement clickpaymenttermsdropdown;
	
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[11]")
	private WebElement clickfreeliftingperiodtermsdropdown;
	
	@FindBy(xpath = "//input[@type='number']")
	private WebElement emdfield;
	
	@FindBy(xpath = "//span[.='Select shipping address']")
	private WebElement clickonshippingaddressfield;
	
	@FindBy(xpath = "//div[@class='ant-card-body']")
	private List<WebElement> listingcreateddata;
	
	@FindBy(xpath = "//span[@aria-label='user']")
	private WebElement clickonprofileicon;
	
	@FindBy(xpath = "//span[.='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath = "//div[@class='ant-form-item-control-input']/div/div/input")
	private List<WebElement> verifyotppage;
	
	@FindBy(xpath = "//button[.='Submit']")
	private WebElement submitbutton;
	
	// Split qty 
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement yesradiobutton;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")
	private WebElement splittotalqtyfield;
	
	@FindBy(xpath = "(//input[@type='number'])[2]")
	private WebElement numberofsplitfield;
	
	@FindBy(xpath = "(//input[@type='number'])[3]")
	private WebElement splitemdfield;
	
	
	
	//  //div[@class='ant-form-item-control-input-content']/input       ::-->Text field
	//  //div[@class='ant-col ant-form-item-label css-1tbu3z4']/label   ::-->Labels
	
	public void createlistingbyprivatemines(
			String email, String pwd, 
			String businessprofile, String optionName,
			String coaltype, String optionName1,
			String originalcoaltype, String optionName2, 
			String sourceofcoal, String optionName3, 
			String gradeofcoal, String optionName4, 
			String cilsubsidairy, String optionName5, 
			String mine, String optionName6,
			
			// coal specification 
			String carbonpercentagelabel, String inputdata1,
			String ashcontentlabel, String inputdata2,
			String volatilelabel, String inputdata3,
			String moisturelabel, String inputdata4,
			
			// delivery railway siding code
			String deliverymodeoption, String QuantityMTinputdata,
			String rateperMTinputdata, String deliverytermoption,
			String paymenttermoption, String emdinputdata,
			String freepaymentinputfield, String freeliftingperiodoption,
			String Startdate, String enddate, String addressbookdata, 
			String otherremarkstextarea
		
			
			) throws InterruptedException, AWTException
	{
		signinpage signin = new signinpage(driver);
		signin.loginpage(email, pwd);
		
		// click on listing in left nav bar
		waitforElement(navlistingbutton);
		javascriptclick(navlistingbutton);
		
		// click on create listing button
		waitforElement(createlistingitembutton);
		javascriptclick(createlistingitembutton);
		
		// business profile
		selectDropdownOption(businessprofile, optionName);
		
		// coal type
		selectDropdownOption(coaltype, optionName1);
		
		// origin of coal
		selectDropdownOption(originalcoaltype, optionName2);
		
		// source of coal
		selectDropdownOption(sourceofcoal, optionName3);
		
		// grade of coal
		selectDropdownOption(gradeofcoal, optionName4);
		
		// cil subsidairy
		selectDropdownOption(cilsubsidairy, optionName5);
		
		// mine
		selectDropdownOption(mine, optionName6);
		
//		// enter a fixed carbon percentage
//		enterdataintoinputfield(carbonpercentagelabel, inputdata1);
//		Thread.sleep(1000);
//		// enter a ash content
//		enterdataintoinputfield(ashcontentlabel, inputdata2);
//		// enter a volatile 
//		enterdataintoinputfield(volatilelabel, inputdata3);
//		// enter a moisture 
//		
//		Thread.sleep(1000);
//		enterdataintoinputfield(moisturelabel, inputdata4);
		
		// Deliery mode
//		javascriptclick(clickondeliverydropdown2);
		clickondeliverydropdown2.click();
		
		selectOptionFromDropdown(deliverymodeoption);
		
		
		// qtyfield
		waitforElement(qtyfield);
		qtyfield.sendKeys(QuantityMTinputdata);
		
		// rate per MT
		waitforElement(ratefield);
		ratefield.sendKeys(rateperMTinputdata);
		
		// delivery terms
		clickdeliverytermsdropdown.click();
		
		selectOptionFromDropdown(deliverytermoption);
		
		// payment terms
		clickpaymenttermsdropdown.click();
		
		selectOptionFromDropdown(paymenttermoption);
		
		// emd %
		waitforElement(emdfield);
		emdfield.sendKeys(emdinputdata);
		
	    waitforElement(freepaymentfield);
	    freepaymentfield.sendKeys(freepaymentinputfield);
		
		clickfreeliftingperiodtermsdropdown.click();
		
		selectOptionFromDropdown("3");
		
		// start date		
		selectDate(Startdate);
		
		// end date
		EndDate(enddate);
		
		clickonshippingaddressfield.click();
		
		selectOptionFromDropdown(addressbookdata);
		
		waitforElement(textareainputfield);
		textareainputfield.sendKeys(otherremarkstextarea);
		
		scrollBottomofPage();
		
//		// upload a business profile image
		uploadFilesMultipleTimes("/home/active34/Downloads/photos /QA club photos/Club 4.png");
		Thread.sleep(1000);
		uploadFilesMultipleTimes("/home/active34/Downloads/photos /QA club photos/Club 3.png");
		Thread.sleep(1000);
		uploadFilesMultipleTimes("/home/active34/Downloads/photos /QA club photos/Club 2.jpeg");
		
		Thread.sleep(1000);
		waitforElement(createlistingbutton);
		javascriptclick(createlistingbutton);
		
		// wait for OTP
		// enter otp into textfields and click enter button on keyboard
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(d -> verifyotppage.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
		
		waitforElement(submitbutton);
		javascriptclick(submitbutton);
		
		Thread.sleep(1000);
		
		for(int i = 0; i < listingcreateddata.size(); i++)
		{
			Thread.sleep(1500);
			String listdata = listingcreateddata.get(0).getText();
			System.out.println("Listing data :- "+ listdata);
			break;
		}
		
		Thread.sleep(1000);
		waitforElement(clickonprofileicon);
		javascriptclick(clickonprofileicon);
		
		waitforElement(logoutbtn);
		javascriptclick(logoutbtn);
		
		
	}
	
	
	// select option from dropdown in create listing
	public void selectOptionFromDropdown(String optionName) {
	    

	    for (WebElement option : Alldropdownoptionlist) 
	    {
	        String text = option.getText().trim();
	        
	        try {
	        	if (text.equalsIgnoreCase(optionName) || text.contains(optionName)) 
	        	{
		            System.out.println("Selecting option :- " + text);
		            waitforElement(option);  // <-- your existing custom wait method
		            //option.click();
		            javascriptclick(option);
		            return; // Exit after selecting
		        }
			} catch (Exception e) {
				System.out.println("Text :-"+ text);
				if (text.equalsIgnoreCase(optionName) || text.contains(optionName)) 
				{
					System.out.println("Selecting option :- " + text);
		            waitforElement(option);  // <-- your existing custom wait method
//		            option.click();
		            javascriptclick(option);
		            return; // Exit after selecting
		        }
			}
	     }
	    throw new RuntimeException("Option '" + optionName + "' not found in dropdown!");
	}
	
	public void selectDropdownOption(String labelName, String optionName) throws InterruptedException {
	    for (int i = 0; i < fetchallthelabelname.size(); i++) {
	        String currentLabel = fetchallthelabelname.get(i).getText().trim();
	        System.out.println("label count :- "+ fetchallthelabelname.size());
	        System.out.println("Fetch label name :- " + currentLabel);

	        if (currentLabel.equalsIgnoreCase(labelName)) {
	            // Click corresponding dropdown
	            System.out.println("verify label name 1 :- " + currentLabel);
	            Thread.sleep(1500);
	            clickonalldropdown.get(i).click();
	            Thread.sleep(1000);
	            System.out.println("click dropdown total size :- "+clickonalldropdown.size());
	            System.out.println("verify label name 2 :- " + currentLabel);

	            // Select option
	            selectOptionFromDropdown(optionName);
	            return; // stop after handling the match
	        }
	    }
	
	
	}
	
	public void enterdataintoinputfield(String labelName, String inputdata) throws InterruptedException {
	    for (int i = 0; i < fetchallthelabelname.size(); i++) {
	        String currentLabel = fetchallthelabelname.get(i).getText().trim();
	        System.out.println("Fetch label name :- " + currentLabel);

	        if (currentLabel.equalsIgnoreCase(labelName)) {
	            Actions action = new Actions(driver);
	            action.doubleClick(fetchallthelabelname.get(i))
	                  .sendKeys(Keys.TAB)
	                  .sendKeys(inputdata)   // sending dynamic input
	                  .perform();

	            System.out.println("Entered data in field: " + currentLabel);
	            return; // exit once found & handled
	        }
	    }
	    System.out.println("Label not found: " + labelName);
	}

	public void clickDropdownByLabel(String labelName, WebElement dropdownElement, String optionName) {

	    for (WebElement label : fetchallthelabelname) {
	        String currentLabel = label.getText().trim();
	        System.out.println("Fetch label name :- " + currentLabel);

	        if (currentLabel.equalsIgnoreCase(labelName)) {
//	        	waituntilelementvisibleandclickable(dropdownElement);
	        	javascriptclick(dropdownElement);
//	        	dropdownElement.click();
	            System.out.println("Clicked dropdown for: " + currentLabel);
	            
	            selectOptionFromDropdown(optionName);
	            return;
	        }
	    }

	    System.out.println("Dropdown not found for label: " + labelName);
	}

	
	public void selectDate(String date) {
	    try {
	        // Convert dd-MM-yyyy to date object
	        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate selectedDate = LocalDate.parse(date, inputFormat);

	        // Convert to aria-label format e.g. "4 November 2025"
	        DateTimeFormatter ariaFormat = DateTimeFormatter.ofPattern("d MMMM yyyy");
	        String ariaLabelDate = selectedDate.format(ariaFormat);

	        System.out.println("Selecting date: " + ariaLabelDate);

	        // Click the calendar to open (update locator if needed)
	        driver.findElement(By.xpath("(//div[@class='relative w-full'])[1]")).click();

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
	
	public void EndDate(String date) {
	    try {
	        // Convert dd-MM-yyyy to date object
	        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate selectedDate = LocalDate.parse(date, inputFormat);

	        // Convert to aria-label format e.g. "4 November 2025"
	        DateTimeFormatter ariaFormat = DateTimeFormatter.ofPattern("d MMMM yyyy");
	        String ariaLabelDate = selectedDate.format(ariaFormat);

	        System.out.println("Selecting date: " + ariaLabelDate);

	        // Click the calendar to open (update locator if needed)
	        driver.findElement(By.xpath("(//div[@class='relative w-full'])[2]")).click();

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
	
	public void uploadFilesMultipleTimes(String filePath) {

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].style.display='block';", uploadfiles);
	    
	        try {
	        	
	            uploadfiles.sendKeys(filePath);
	            System.out.println("Uploaded: " + filePath);
	        } catch (ElementNotInteractableException e) {
	            js.executeScript("arguments[0].style.display='block';", uploadfiles);
	            uploadfiles.sendKeys(filePath);
	            System.out.println("Retry Uploaded: " + filePath);
	        }
	    }
	}


