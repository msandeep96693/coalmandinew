package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class listinghomepage extends Basicpage {

	listinghomepage(WebDriver driver) {
		super(driver);
		
	}
	
	// my listing xpath element address
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchtextfield;
	
	@FindBy(xpath = "//span[.='All Status']" )
	private WebElement clickonstatusdropdown;
	
	@FindBy(xpath = "//div[@class='rc-virtual-list-holder-inner']/div")
	private List<WebElement> statusdropdownoptions;
	
	// participated xpath element address 
	
	

}
