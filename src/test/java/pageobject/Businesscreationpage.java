package pageobject;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.beans.DesignMode;
import java.util.List;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

	public class Businesscreationpage extends Basicpage {

		public Businesscreationpage(WebDriver driver)
		{
			super(driver);
		}
		
		// xpath business profile 
		
//		@FindBy(xpath="/html/body/div/div/div/div[3]/div/div[2]/button/span")
		@FindBy(xpath = "//span[text()='Create Business Profile']/..")
		private WebElement btnCreateBusinessProfile;

		@FindBy(xpath="//input[@type='file']")
		private WebElement uploadProfile;
		
		@FindBy(xpath="(//input[@type='text'])[1]")
		private WebElement rememberastextField;
		
		@FindBy(xpath = "(//input[@type='text'])[2]")
		private WebElement gstnumberfield;
		
		@FindBy(xpath = "//span[.='Verify GST']") // /html/body/div[1]/div/div/div[2]/div/div/div[3]/div/form/div[3]/div/button/span
		private WebElement verifygstbutton;
		
		@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']")
		private List<WebElement> listofstate;
		
		@FindBy(xpath = "(//input[@type='search'])[2]")
		private WebElement districtdropdown;
		
		@FindBy(xpath = "//div[.='Anantapur']")  // //div[.='Anjaw']   state - Arunachal Pradesh
		private WebElement anantapuroption;
		
//		@FindBy(xpath = "(//input[@type='search'])[1]")
		@FindBy(xpath = "(//span[@class='ant-select-selection-search'])[1]")
		private WebElement statedropdown;
		
		@FindBy(xpath = "//div[.='Andhra Pradesh']")  // //div[.='Arunachal Pradesh']
		private WebElement andhrapradeshoption;
		
		
		
		
		@FindBy(xpath = "(//input[@type='text'])[5]")
		private WebElement contactnamefield;
		
		@FindBy(xpath = "(//input[@type='text'])[6]")
		private WebElement desginationfield;
		
		@FindBy(xpath = "//input[@type='email']")
		private WebElement emailfield;
		
		@FindBy(xpath = "(//input[@type='text'])[7]")
		private WebElement mobilenumberfield;
		
		
		
		@FindBy(xpath = "(//input[@type='search'])[3]")
		private WebElement onwershipdropdown;
		
		@FindBy(xpath = "//div[.='LLP']")  
		private WebElement llpoption;
		
		@FindBy(xpath = "(//input[@type='search'])[4]")
		private WebElement industrydropdown;
		
		@FindBy(xpath = "//div[.='Brick Kilns & Ceramics']")  
		private WebElement brickkilnoption;
		
		@FindBy(xpath = "(//div[@class='ant-select-selector'])[5]")  // (//input[@type='search'])[5]
		private WebElement producttotradedropdown;
		
		@FindBy(xpath = "//div[.='PET Coke']") 
		private WebElement petcokeoption;
		
		@FindBy(xpath = "//div[@title='Coking Coal (HSN - 27011910)']/div")  // //div[.='Coking Coal']
		private WebElement cokingcoaloption;
		
		@FindBy(xpath = "//div[.='Thermal Coal']")
		private WebElement thermalcoaloption;
		
		@FindBy(xpath = "//div[.='Metallurgical Coal (HSN - 27011910)']")
		private WebElement metallurgicalcoaloption;
		
		@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[2]")
		private WebElement originofcoaldropdown;
		
		@FindBy(xpath = "//div[.='Domestic']") 
		private WebElement domesticoption;  
		
		@FindBy(xpath = "//div[.='International']")
		private WebElement internationaloption;
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement saveandproceedbutton;
		
		
		// add business profile address
		
		@FindBy(xpath = "//span[.='Add Sub-Business Unit']/..")
		private WebElement addbusinessunitbutton;
		
		@FindBy(xpath = "(//input[@type='text'])[3]")
		private WebElement businessnamefielddata;
		
		@FindBy(xpath = "//div[@class='ant-form-item-control-input']/div/textarea")
		private WebElement subunitaddressfielddata;
		
		@FindBy(xpath = "//span[.='Save']/..")
		private WebElement savebutton;
		
		@FindBy(xpath = "//span[.='Proceed to KYC']/..")
		private WebElement proceedtokycbutton;

		
		// kyc page
		@FindBy(xpath = "//button[.='Proceed to KYC']")
		private WebElement proceedtokycbutton1;
		
		@FindBy(xpath = "//input[@name='authorizationLetter']")
		private WebElement authorizationletter;
		
		@FindBy(xpath = "//input[@name='gstCertificateFile']")
		private WebElement gstCertificateFile;
		
		@FindBy(xpath = "//input[@type='file']/..")
		private List<WebElement> alldocuploadfile;
		
		@FindBy(xpath = "//p[@class='mb-2 text-base text-gray-500']")
		private List<WebElement> doclabelname;
		
		public void createbbusinessprofile(
				String email, String pwd,  String gstnumber,  
				 String designation
				) throws InterruptedException, AWTException  
		{ 
			signinpage signin = new signinpage(driver);
			signin.loginpage(email, pwd);
			
			// click on the create business profile button
			waitforElement(btnCreateBusinessProfile);
			btnCreateBusinessProfile.click();
			
			// upload a business profile image
			try {
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.display='block';", uploadProfile);
				uploadProfile.sendKeys("C:\\Users\\User\\Desktop\\Background images\\Bg-2.jpg");
				} catch (ElementNotInteractableException e) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].style.display='block';", uploadProfile);
					uploadProfile.sendKeys("C:\\Users\\User\\Desktop\\Background images\\Bg-2.jpg");
				}
			
			// remember me as textfield
			waitforElement(rememberastextField);
			rememberastextField.sendKeys(setRandomBusinessName());
			
			// Enter GST number 
			waitforElement(gstnumberfield);
			gstnumberfield.sendKeys(gstnumber);
			String GSTnumber = gstnumberfield.getText();
			System.out.println("GST number :-"+ GSTnumber);
			
			// enter gst verify button
			waitforElement(verifygstbutton);
			verifygstbutton.click();
			
//			scrollUntilElementVisible(statedropdown);
//			
//			Thread.sleep(5000);
//			
//			// select the state dropdown
//			
//			Actions act = new Actions(driver);
////			act.doubleClick(statedropdown).perform();
//			act.moveToElement(statedropdown).click().perform();
//			
//			Thread.sleep(2000);
//			
//			
//			
//			for (WebElement option : listofstate) {
//			    String stateName = option.getText().trim();
//			    Thread.sleep(1000);
//			    System.out.println("State name :-" + stateName);
//			    if (stateName.equalsIgnoreCase("Gujarat")) {
//			        option.click();
//			        break; // stop after selecting
//			    }
//			}
//			
//			// district selection
//			Actions act1 = new Actions(driver);
////			act.doubleClick(statedropdown).perform();
//			act1.moveToElement(districtdropdown).click().perform();
//			
//			Thread.sleep(2000);
//			
//			
//			
//			for (WebElement option : listofstate) {
//			    String stateName = option.getText().trim();
//			    Thread.sleep(1000);
//			    System.out.println("District name :-" + stateName);
//			    if (stateName.equalsIgnoreCase("Dang")) {
//			        option.click();
//			        break; // stop after selecting
//			    }
//			}
			
			
//			try {
//				Thread.sleep(1000);
//				waitforElement(statedropdown);
//				javascriptclick(statedropdown);
//			} catch (ElementClickInterceptedException e) {
//				Thread.sleep(1000);
//				
//				waitforElement(statedropdown);
//				javascriptclick(statedropdown);
//			}
//			
//			
//			
//			try {
//				Thread.sleep(1000);
//			
//				waitforElement(andhrapradeshoption);
//				javascriptclick(andhrapradeshoption);
//			} catch (ElementClickInterceptedException e) {
//				Thread.sleep(1000);
//		
//				waitforElement(andhrapradeshoption);
//				javascriptclick(andhrapradeshoption);
//			}
//			
//			
//			// select the district dropdown
//			waitforElement(districtdropdown);
//			districtdropdown.click();
//			
//			waitforElement(anantapuroption);
//			anantapuroption.click();
			
			// ownership 
			waitforElement(onwershipdropdown);
			onwershipdropdown.click();
			
			waitforElement(llpoption);
			llpoption.click();
			
			// industry
			waitforElement(industrydropdown);
			industrydropdown.click();
			
			waitforElement(brickkilnoption);
			brickkilnoption.click();
			
			// product to trade
			waitforElement(producttotradedropdown);
			producttotradedropdown.click();
			
			waitforElement(cokingcoaloption);
			System.out.println(cokingcoaloption.getText());
			cokingcoaloption.click();
			
			waitforElement(metallurgicalcoaloption);
			System.out.println(metallurgicalcoaloption.getText());
			metallurgicalcoaloption.click();
			
			Robot rob=new Robot();
			rob.keyPress(KeyEvent.VK_ESCAPE);
			rob.keyRelease(KeyEvent.VK_ESCAPE);
			
			scrollUntilElementVisible(producttotradedropdown);
			Thread.sleep(1000);
			
			Hiddenelement(originofcoaldropdown);
			
			// origin of coal
			
			waitforElement(originofcoaldropdown);
//			javascriptclick(originofcoaldropdown);
			originofcoaldropdown.click();
			
			waitforElement(domesticoption);
			javascriptclick(domesticoption);
			
			waitforElement(internationaloption);
			javascriptclick(internationaloption);
			
			Robot rob1=new Robot();
			rob1.keyPress(KeyEvent.VK_ESCAPE);
			rob1.keyRelease(KeyEvent.VK_ESCAPE);
			
			// contact info data
			// -----------------------------------
			// enter contact name 
			waitforElement(contactnamefield);
			contactnamefield.sendKeys(setRandomName());
			
			// enter designation 
			waitforElement(desginationfield);
			desginationfield.sendKeys(designation);
			
			// enter email 
			waitforElement(emailfield);
			emailfield.sendKeys(setRandomEmail());
			
			// enter contact number
			waitforElement(mobilenumberfield);
			mobilenumberfield.sendKeys(setRandomMobileNumber());
			
			// click on save & proceed button
			waitforElement(saveandproceedbutton);
			saveandproceedbutton.click();
			
			// verify review page
			String Reviewurl = driver.getCurrentUrl();
			System.out.println(Reviewurl);
			
			// click on proceed to kyc button
			waitforElement(proceedtokycbutton);
			javascriptclick(proceedtokycbutton);
			
			// -----------------------------------------------------
			
			// KYC document
			// authorization doc upload
			Thread.sleep(2000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].style.display='block';", authorizationletter);
			authorizationletter.sendKeys("C:\\Users\\User\\Desktop\\Background images\\Bg-2.jpg");
			
			Thread.sleep(2000);
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].style.display='block';", gstCertificateFile);
			gstCertificateFile.sendKeys("C:\\Users\\User\\Desktop\\Background images\\Bg-2.jpg");
			
			
			Thread.sleep(3000);
			
	}
	
}
