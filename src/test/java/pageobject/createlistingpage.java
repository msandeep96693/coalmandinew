package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']") //  //div[@class='rc-virtual-list-holder-inner']/div   
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
			String labelName7, String optionName7 ) throws InterruptedException
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
		
		// delivery mode
		selectDropdownOption(labelName7, optionName7);
		
	}
	// select option from dropdown in create listing
	public void selectOptionFromDropdown(String optionName) {
	    

	    for (WebElement option : Alldropdownoptionlist) 
	    {
	        String text = option.getText().trim();
	        try {
	        	if (text.contains(optionName)) 
	        	{
		            System.out.println("Selecting option :- " + text);
		            waitforElement(option);  // <-- your existing custom wait method
		            option.click();
		            return; // Exit after selecting
		        }
			} catch (Exception e) {
				System.out.println("Text :-"+ text);
				if (text.contains(optionName)) 
				{
					System.out.println("Selecting option :- " + text);
		            waitforElement(option);  // <-- your existing custom wait method
		            option.click();
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

	
}
