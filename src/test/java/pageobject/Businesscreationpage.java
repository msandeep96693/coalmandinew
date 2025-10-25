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
		
		@FindBy(xpath = "//input[@type='file']")
		private List<WebElement> uploadFiles;
		
		@FindBy(xpath = "//span[@class='font-medium text-base']")
		private List<WebElement> labelList;
		
		@FindBy(xpath = "//span[.='Submit']/..")
		private List<WebElement> submitButtons;
		
		@FindBy(xpath = "(//input[@type='text'])[3]")
		private WebElement TANnumbertextfield;
		
		@FindBy(xpath = "(//input[@type='text'])[4]")
		private WebElement LUTnumbertextfield;
		
		@FindBy(xpath = "(//input[@type='text'])[5]")
		private WebElement banknametextfield;
		
		@FindBy(xpath = "//input[@type='password']")
		private WebElement accountnotextfield;
		
		@FindBy(xpath = "(//input[@type='number'])[1]")
		private WebElement confirmaccountnotextfield;
		
		@FindBy(xpath = "(//input[@type='text'])[6]")
		private WebElement ifsccodetextfield;
		
		@FindBy(xpath = "(//input[@type='text'])[7]")
		private WebElement branchnametextfield;
		
		@FindBy(xpath = "(//input[@type='text'])[8]")
		private WebElement udyamnotextfield;
		
		@FindBy(xpath = "(//span[@aria-label='calendar']/../..)[1]")
		private WebElement clickonudyamdatefield;
		
		@FindBy(xpath = "(//button[@type='button'])[4]")
		private WebElement previousbutton;
		
		@FindBy(xpath = "//div[@class='react-calendar__month-view__days']/button/abbr")
		private List<WebElement> listofdates;
		
		@FindBy(xpath = "(//input[@value='yes'])[3]")
		private WebElement iecyesradiobutton;
		
		@FindBy(xpath = "(//input[@type='text'])[9]")
		private WebElement iecnotextfield;
		
		@FindBy(xpath = "(//span[@aria-label='calendar']/../..)[2]")
		private WebElement clickoniecdatefield;
		
		@FindBy(xpath = "(//input[@type='number'])[2]")
		private WebElement DnBnotextfield;
		
		
		
		
		
		public void createbbusinessprofile(
				String email, String pwd,  String gstnumber,  
				 String designation,String accountno, String confirmaccountno, String udyamno, String udyamdateno,
				String iecdateno, String DnBno
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
			// authorization 
			
			kycdocuploadandsubmit("Authorization Letter", uploadFiles, submitButtons);
			
			// PAN Card
			kycdocuploadandsubmit("PAN Card", uploadFiles, submitButtons);
			
			// GST Certificate 
			kycdocuploadandsubmit("GST Certificate", uploadFiles, submitButtons);
			
			// TAN certificate
			waitforElement(TANnumbertextfield);
			TANnumbertextfield.sendKeys(setRandomMobileNumber());
			
			kycdocuploadandsubmit("TAN Certificate", uploadFiles, submitButtons);
			
			// LUT Certificate
			waitforElement(LUTnumbertextfield);
			LUTnumbertextfield.sendKeys(setRandomMobileNumber());
			
			kycdocuploadandsubmit("LUT Certificate", uploadFiles, submitButtons);
			
			// Bank Details
			waitforElement(banknametextfield);
			banknametextfield.clear();
			banknametextfield.sendKeys(setRandomBusinessName());
			
			waitforElement(accountnotextfield);
			accountnotextfield.clear();
			accountnotextfield.sendKeys(accountno);
			
			waitforElement(confirmaccountnotextfield);
			confirmaccountnotextfield.clear();
			confirmaccountnotextfield.sendKeys(confirmaccountno);
			
			waitforElement(ifsccodetextfield);
			ifsccodetextfield.sendKeys(setRandomBusinessName());
			
			waitforElement(branchnametextfield);
			branchnametextfield.sendKeys(setRandomBusinessName());
			
			kycdocuploadandsubmit("Bank Details", uploadFiles, submitButtons);
			
			// udyam certificate 
			waitforElement(udyamnotextfield);
			udyamnotextfield.sendKeys(udyamno);
			
			// date picker pending
			waitforElement(clickonudyamdatefield);
			javascriptclick(clickonudyamdatefield);
			
			datepicker(udyamdateno);
			
			
			kycdocuploadandsubmit("Udyam Certificate (MSME)", uploadFiles, submitButtons);
			
			
			// IEC certificate
			
			waitforElement(iecyesradiobutton);
			javascriptclick(iecyesradiobutton);
			
			waitforElement(iecnotextfield);
			iecnotextfield.sendKeys(setRandomMobileNumber());
			
			// date picker iec 
			waitforElement(clickoniecdatefield);
			javascriptclick(clickoniecdatefield);
			
			datepicker(iecdateno);
			
			kycdocuploadandsubmit("IEC Certificate", uploadFiles, submitButtons);
			
			// D & B 
			
			waitforElement(DnBnotextfield);
			DnBnotextfield.sendKeys(DnBno);
			
			kycdocuploadandsubmit("D&B", uploadFiles, submitButtons);
			
			
	}
		
		public void kycdocuploadandsubmit(String labelnames, List<WebElement> uploadFiles, List<WebElement> submitButtons) 
		{
			 for (int i = 0; i < labelList.size(); i++) {
		        String labelText = labelList.get(i).getText().trim();
		        System.out.println("Found label: " + labelText);

		        if (labelText.contains(labelnames)) {
		            WebElement uploadInput = uploadFiles.get(i);
		            WebElement submitButton = submitButtons.get(i);

		            // Make upload input visible (if hidden)
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            js.executeScript("arguments[0].style.display='block';", uploadInput);

		            // Upload the file
		            uploadInput.sendKeys("C:\\Users\\User\\Desktop\\Background images\\Bg-3.jpg");
		            System.out.println("✅ File uploaded for label: " + labelnames);

		            // Click the corresponding submit button
		            js.executeScript("arguments[0].click();", submitButton);
		            System.out.println("✅ Submit button clicked for label: " + labelnames);

		            break;
		        }
		    }
		}
		
		public void datepicker(String dateno) throws InterruptedException
		{
			javascriptclick(previousbutton);
			Thread.sleep(500);
			javascriptclick(previousbutton);
			Thread.sleep(500);
			
			
			for (WebElement date : listofdates) {
		        String dateText = date.getText().trim(); // or date.getAttribute("aria-label") if text is empty
		        if (dateText.equals(dateno)) {
		            date.click();
		            System.out.println("✅ Date selected: " + dateno);
		            break;
		        }
		    }
		}
	
}
