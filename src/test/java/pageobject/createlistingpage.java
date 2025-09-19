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
	
	public void createlistingbyprivatemines()
	{
		
	}
}
