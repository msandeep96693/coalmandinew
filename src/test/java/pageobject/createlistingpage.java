package pageobject;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class createlistingpage extends Basicpage {
	
	public createlistingpage(WebDriver driver)
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
	private List<WebElement> alltextareainputfield;
	
	// Upload document
	@FindBy(xpath = "//input[@type='file']")
	private WebElement attachdocument; 
	
	@FindBy(xpath = "//span[contains(.,'Create Listing')]")  // //span[.='Create Listing']
	private WebElement createlistingbutton;
	
	@FindBy(xpath = "//div[.='My Listings']") 
	private WebElement mylistingtabname;
	
//	verfiy the source coal and pensing status name in Mylisting page after create a listing
	@FindBy(xpath = "//div[contains(@class,'ant-card-head-title')]/..")
	private WebElement verifycoalnameandpendingstatusname;
	
	@FindBy(xpath = "//div[@class='relative w-full']")
	private List<WebElement> validitystartandendfield;
	
	//  //div[@class='ant-form-item-control-input-content']/input       ::-->Text field
	//  //div[@class='ant-col ant-form-item-label css-1tbu3z4']/label   ::-->Labels
	
	public void createlistingbyprivatemines(
			String email, String pwd, 
			String labelName, String optionName,
			String labelName1, String optionName1,
			String labelName2, String optionName2, 
			String labelName3, String optionName3, 
			String labelName4, String optionName4, 
			String labelName5, String optionName5, 
			String labelName6, String optionName6,
			
			// coal specification 
			String carbonpercentagelabel, String inputdata1,
			String ashcontentlabel, String inputdata2,
			String volatilelabel, String inputdata3,
			String moisturelabel, String inputdata4,
			
			String labelName7,String optionName7,
			String labelName8, String optionName8,
//			String labelName9, String optionName9,
//			String labelName10, String optionName10,
			
			
//			String railwaysidinglabel, String inputdata5,
			String quantitylabel, String inputdata6,
			String ratepricelabel, String inputdata7,
			String emdlabel, String inputdata8,
			String freepaymentperiodlabel, String inputdata9
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
		selectDropdownOption(labelName, optionName);
		
		// coal type
		selectDropdownOption(labelName1, optionName1);
		
		// origin of coal
		selectDropdownOption(labelName2, optionName2);
		
		// source of coal
		selectDropdownOption(labelName3, optionName3);
		
		// grade of coal
		selectDropdownOption(labelName4, optionName4);
		
		// cil subsidairy
		selectDropdownOption(labelName5, optionName5);
		
		// mine
		selectDropdownOption(labelName6, optionName6);
		
		// enter a fixed carbon percentage
		enterdataintoinputfield(carbonpercentagelabel, inputdata1);
		Thread.sleep(1000);
		// enter a ash content
		enterdataintoinputfield(ashcontentlabel, inputdata2);
		// enter a volatile 
		enterdataintoinputfield(volatilelabel, inputdata3);
		// enter a moisture 
		enterdataintoinputfield(moisturelabel, inputdata4);
		
		Thread.sleep(2000);
		WebElement dropdownclick = driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[8]"));
		javascriptclick(dropdownclick);
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement optionselect = driver.findElement(By.xpath("//div[.='MAX']"));
		javascriptclick(optionselect);
		
		
		// carbon max/min dropdown
//		selectDropdownOption(labelName7, optionName7);
		
//		// ash max/min dropdown
		selectDropdownOption(labelName8, optionName8);
		
//		// volatile max/min dropdown
//		selectDropdownOption(labelName9, optionName9);
//						
//		// moisture max/min dropdown
//		selectDropdownOption(labelName10, optionName10);		
		
		// carbon max/min dropdown  
//		WebElement carbonmaxmin = driver.findElement(By.xpath("(//span[@class='ant-select-arrow'])[8]/.."));
//		clickDropdownByLabel(labelName7, carbonmaxmin, optionName7);
//		selectOptionFromDropdown("MAX");
//		Thread.sleep(3000);
		
		// scroll down
//		WebElement rateprice = driver.findElement(By.xpath("//label[.='Rate per MT (INR)']"));
//		scrollUntilElementVisible(rateprice);
		
		// Delivery mode
//		WebElement deliverymodefield = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[8]"));
//		clickDropdownByLabel(labelName7, deliverymodefield, optionName7);
		
//		// enter a railway siding code
//		enterdataintoinputfield(railwaysidinglabel, inputdata5);
		
		
		//enter a quantity MT
		enterdataintoinputfield(quantitylabel, inputdata6);
	
		
		// enter a price per MT(INR)
		enterdataintoinputfield(ratepricelabel, inputdata7);
		
		
		// enter a emd 
		enterdataintoinputfield(emdlabel, inputdata8);
		
		// enter a free payment period 
		enterdataintoinputfield(freepaymentperiodlabel, inputdata9);
		
		
		
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
	            Thread.sleep(3000);
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

}
