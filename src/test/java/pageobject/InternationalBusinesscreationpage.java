package pageobject;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.beans.DesignMode;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.checkerframework.checker.interning.qual.FindDistinct;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	public class InternationalBusinesscreationpage extends Basicpage {

		public InternationalBusinesscreationpage(WebDriver driver)
		{
			super(driver);
		}
		
		// xpath business profile 

		@FindBy(xpath = "//span[text()='Create Business Profile']/..")
		private WebElement btnCreateBusinessProfile;

		@FindBy(xpath="//input[@type='file']")
		private WebElement uploadProfile;
		
		@FindBy(xpath="(//input[@type='text'])[1]")
		private WebElement rememberastextField;
		
		@FindBy(xpath = "(//input[@type='text'])[2]")
		private WebElement businessnamefield;
		
		@FindBy(xpath = "//textarea")
		private WebElement registeredaddresstextarea;
		
		@FindBy(xpath = "(//input[@type='text'])[3]")
		private WebElement zipcodefield;
		
		@FindBy(xpath = "//input[@placeholder='Enter D&B number']")
		private WebElement DBnumberfield;
		
		
		
		@FindBy(xpath = "//span[.='Verify GST']") 
		private WebElement verifygstbutton;
		
		@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']")
		private List<WebElement> listofstate;
		
		@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']")
		private List<WebElement> listofdistrict;
		
		@FindBy(xpath = "(//span[@class='ant-select-selection-search'])[2]")
		private WebElement districtdropdown;
		
		@FindBy(xpath = "//div[.='Anantapur']")  
		private WebElement anantapuroption;
		
 		@FindBy(xpath = "(//span[@class='ant-select-selection-search'])[1]")
		private WebElement statedropdown;   
		
		@FindBy(xpath = "//div[.='Andhra Pradesh']") 
		private WebElement andhrapradeshoption;
		
		
		
		
		@FindBy(xpath = "(//input[@type='text'])[4]")
		private WebElement contactnamefield;
		
		@FindBy(xpath = "(//input[@type='email'])[1]")
		private WebElement contactemailIDfield;
		
		@FindBy(xpath = "(//input[@type='text'])[5]")
		private WebElement desginationfield;
	
		
		@FindBy(xpath = "(//input[@type='text'])[6]")
		private WebElement mobilenumberfield;
		
		// Indian correspondence components  ( When Is business owner checkbox disabled )
		
		@FindBy(xpath = "(//input[@type='text'])[7]")
		private WebElement indiancontactpersonname;
		
		@FindBy(xpath = "(//input[@type='text'])[8]")
		private WebElement indianpersondesignation;
		
		@FindBy(xpath = "(//input[@type='email'])[2]")
		private WebElement indianpersonemailID;
		
		@FindBy(xpath = "(//input[@type='text'])[9]")
		private WebElement indianpersonmobilenumber;
		
		// Indian correspondence components  ( When Is business owner check box enabled )
		@FindBy(xpath = "(//input[@type='text'])[4]")
		private WebElement indiancontactpersonnamefield;
		
		@FindBy(xpath = "(//input[@type='text'])[5]")
		private WebElement indianpersondesignationfield;
		
		@FindBy(xpath = "//input[@type='email']")
		private WebElement indianpersonemailfield;
		
		@FindBy(xpath = "(//input[@type='text'])[6]")
		private WebElement indianpersonmobilenumberfield;
		
		
		
		@FindBy(xpath = "(//input[@type='search'])[1]")
		private WebElement onwershipdropdown;
		
		@FindBy(xpath = "//div[.='LLP']")  
		private WebElement llpoption;
		
		@FindBy(xpath = "(//input[@type='search'])[2]")
		private WebElement industrydropdown;
		
		@FindBy(xpath = "//div[.='Brick Kilns & Ceramics']")  
		private WebElement brickkilnoption;
		
		@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")  // (//input[@type='search'])[5]
		private WebElement producttotradedropdown;
		
		@FindBy(xpath = "//div[@class='ant-select-item-option-content']")
		private List<WebElement> alldropdownoption;
		
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
		
//		@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[3]")
//		private WebElement sourceofcoaldropdown;
		
		@FindBy(xpath = "(//input[@type='search'])[5]")
		private WebElement sourceofcoaldropdown;
		
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
		
		@FindBy(xpath = "//input[@type='file']")
		private List<WebElement> uploadFiles1;
		
		@FindBy(xpath = "//span[@class='font-medium text-base']")
		private List<WebElement> labelList;
		
		@FindBy(xpath = "//button[@type='submit']")    // //span[.='Submit']/..
		private List<WebElement> submitButtons;
		
		@FindBy(xpath = "(//input[@type='text'])[3]")
		private WebElement TANnumbertextfield;
		
		@FindBy(xpath = "(//input[@type='text'])[4]")
		private WebElement LUTnumbertextfield;
		
		@FindBy(xpath = "(//span[.='Yes']/..)[1]")
		private WebElement LUTradioyesbutton;
		
		@FindBy(xpath = "(//input[@type='text'])[5]")
		private WebElement Ifsccodetextfield;
		
		@FindBy(xpath = "//button[.='Verify IFSC']")
		private WebElement verifyifscbtn;
		
		@FindBy(xpath = "//input[@type='password']")
		private WebElement accountnotextfield;
		
		@FindBy(xpath = "(//input[@type='number'])[1]")
		private WebElement confirmaccountnotextfield;
			
		@FindBy(xpath = "(//span[.='Yes']/..)[2]")
		private WebElement udyamyesradiobutton;
		
		@FindBy(xpath = "(//input[@type='text'])[8]")
		private WebElement udyamnotextfield;
		
		@FindBy(xpath = "(//span[@aria-label='calendar']/../..)[1]")
		private WebElement clickonudyamdatefield;
		
		@FindBy(xpath = "(//button[@type='button'])[4]")
		private WebElement previousbutton;
		
		@FindBy(xpath = "//div[@class='react-calendar__month-view__days']/button/abbr")
		private List<WebElement> listofdates;
		
		@FindBy(xpath = "(//span[.='Yes']/..)[3]")
		private WebElement iecyesradiobutton;
		
		@FindBy(xpath = "(//input[@type='text'])[9]")
		private WebElement iecnotextfield;
		
		@FindBy(xpath = "(//span[@aria-label='calendar']/../..)[2]")
		private WebElement clickoniecdatefield;
		
		@FindBy(xpath = "(//input[@type='number'])[2]")
		private WebElement DnBnotextfield;
		
		@FindBy(xpath = "//button[.='Save & Proceed']")
		private WebElement saveproceedbuton;
		
		@FindBy(xpath = "//span[.='Confirm info correctness']")
		private WebElement confirminfocorrectnesscheckbox;
		
		@FindBy(xpath = "//span[.='Accept terms']")
		private WebElement accepttermscheckbox;
		
		@FindBy(xpath = "//button[.='Submit for Verification']")
		private WebElement submitforverification;

		@FindBy(xpath = "//span[.='Is Same as Business Owner ?']")
		private WebElement Issameasbusinessownercheckbox;
		
		
		
		// kyc page
		
		@FindBy(xpath = "(//input[@type='file'])[1]")
		private WebElement authorizationuploadfile;
		
		@FindBy(xpath = "(//input[@type='file'])[2]")
		private WebElement pancarduploadfile;
		
		// setting xpath address
		@FindBy(xpath = "//span[@aria-label='user']") 
		private WebElement profileicon;
		
		@FindBy(xpath = "//button[.='Logout']")
		private WebElement logoutbtn;
		
		@FindBy(xpath = "//span[.='Settings']/..")
		private WebElement settingbtn;
		
		@FindBy(xpath = "//div[@data-node-key='business_profiles']")
		private WebElement businessprofiletab;
		
		@FindBy(xpath = "//button[.='Add Business Profile']")
		private WebElement addbusinessprofilebtn;
		
		
		public void Internationalcreatebusinessprofile(
				String Rolename, String mobilenumber, String createpassword, 
				 String confirmpassword, String Registeredaddress,  String Zipcodenumber,
				 String DnBnumber, String designation, String Indiandesignation
				) throws InterruptedException, AWTException  
		{ 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
//			signinpage signin = new signinpage(driver);
//			signin.loginpage("sandeep+international2@rokkun.io", "Sandeep@123");   // String email, String pwd, 
			
			createinternationalaccountpage account = new createinternationalaccountpage(driver);
			account.createbusinessaccount(Rolename, mobilenumber, createpassword, confirmpassword);
			
			// click on the create business profile button
			waitforElement(btnCreateBusinessProfile);
			btnCreateBusinessProfile.click();
//			
//			waitforElement(profileicon);
//			javascriptclick(profileicon);
//			
//			waitforElement(settingbtn);
//			javascriptclick(settingbtn);
//			
//			waitforElement(businessprofiletab);
//			javascriptclick(businessprofiletab);
//			
//			waitforElement(addbusinessprofilebtn);
//			javascriptclick(addbusinessprofilebtn);
//			
			// upload a business profile image
			try {
				Thread.sleep(2000);
//				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.display='block';", uploadProfile);
				uploadProfile.sendKeys("/home/active34/Downloads/photos /QA club photos/Club 7.png");
				} catch (ElementNotInteractableException e) {
//					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].style.display='block';", uploadProfile);
					uploadProfile.sendKeys("/home/active34/Downloads/photos /QA club photos/Club 7.png");
				}  // /home/active34/Downloads/photos /QA club photos/business logo.jpeg
			// C:\Users\User\Desktop\Background images\Bg-1.jpg
			
			// remember me as textfield
			waitforElement(rememberastextField);      
			rememberastextField.sendKeys(setRandomBusinessName());
			
			waitforElement(businessnamefield);
			businessnamefield.sendKeys(setRandomBusinessNameInternational());
			
			waitforElement(registeredaddresstextarea);
			registeredaddresstextarea.sendKeys(Registeredaddress);
			
			waitforElement(zipcodefield);
			zipcodefield.sendKeys(Zipcodenumber);
			
			waitforElement(DBnumberfield);
			DBnumberfield.sendKeys(setRandomnineNumber());

			
			// ownership 
			waitforElement(onwershipdropdown);
			onwershipdropdown.click();
			
			Thread.sleep(1000);
			selectDropdownOption(alldropdownoption, "LLP");
			
			// industry
			waitforElement(industrydropdown);
			industrydropdown.click();
			
			Thread.sleep(1000);
			selectDropdownOption(alldropdownoption, "Brick Kilns");	
			
			// product to trade
			waitforElement(producttotradedropdown);
			producttotradedropdown.click();
			
			Thread.sleep(1000);
			selectDropdownOption(alldropdownoption, "Metallurgical");
			Thread.sleep(1000);
			selectDropdownOption(alldropdownoption, "Thermal");
			
		
			Robot rob=new Robot();
			rob.keyPress(KeyEvent.VK_ESCAPE);
			rob.keyRelease(KeyEvent.VK_ESCAPE);
						
			Hiddenelement(originofcoaldropdown);
			
			// origin of coal
			
			waitforElement(originofcoaldropdown);
			originofcoaldropdown.click();
			
//			Thread.sleep(1000);
//			selectDropdownOption(alldropdownoption, "Domestic");
			Thread.sleep(1000);
			selectDropdownOption(alldropdownoption, "International");
			
			Robot rob1=new Robot();
			rob1.keyPress(KeyEvent.VK_ESCAPE);
			rob1.keyRelease(KeyEvent.VK_ESCAPE);
			
			waitforElement(sourceofcoaldropdown);
			javascriptclick(sourceofcoaldropdown);
			
			Thread.sleep(1000);
			sourceofcoaldropdown.sendKeys("Russian");
			Thread.sleep(2000);
			
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ENTER).perform();
			
			sourceofcoaldropdown.sendKeys("South");
			Thread.sleep(2000);
		
			actions.sendKeys(Keys.ENTER).perform();
			
			// Is same as business owner 
//			waitforElement(Issameasbusinessownercheckbox);
//			javascriptclick(Issameasbusinessownercheckbox);
			
			// contact info data 
			// -----------------------------------
			// enter contact name 
			waitforElement(contactnamefield);
			contactnamefield.sendKeys(setRandomName());
			
			// enter designation 
			waitforElement(desginationfield);
			desginationfield.sendKeys(designation);
			
			// enter email 
			waitforElement(contactemailIDfield);
			contactemailIDfield.sendKeys(setRandomEmail());
			
			// enter contact number
			waitforElement(mobilenumberfield);
			mobilenumberfield.sendKeys(setRandomMobileNumber());
			
			// Indian Correspondence Office Details
			waitforElement(indiancontactpersonname);
			indiancontactpersonname.sendKeys(setRandomName());
			
			waitforElement(indianpersondesignation);
			indianpersondesignation.sendKeys(Indiandesignation);
			
			waitforElement(indianpersonemailID);
			indianpersonemailID.sendKeys(setRandomEmail());
			
			waitforElement(indianpersonmobilenumber);
			indianpersonmobilenumber.sendKeys(setRandomMobileNumber());
			
			// click on save & proceed button
			waitforElement(saveandproceedbutton);
			saveandproceedbutton.click();
			
			scrollBottomofPage();
			
			// verify review page
			String Reviewurl = driver.getCurrentUrl();
			System.out.println(Reviewurl);
			
			Thread.sleep(2000);
			
			 js.executeScript("arguments[0].scrollIntoView({block: 'center'});", proceedtokycbutton);
			// click on proceed to kyc button
			waitforElement(proceedtokycbutton);
			javascriptclick(proceedtokycbutton);
			
			// -----------------------------------------------------
			
			// KYC document
			// D & B
			
			Thread.sleep(1000);
			kycdocuploadandsubmit("D&B", uploadFiles, submitButtons);
			
			scrollBottomofPage();
			
			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", saveproceedbuton);
			waitforElement(saveproceedbuton);
			javascriptclick(saveproceedbuton);
			
			scrollBottomofPage();
			
			// Review page - Two check box
			waitforElement(confirminfocorrectnesscheckbox);
			javascriptclick(confirminfocorrectnesscheckbox);
			
			waitforElement(accepttermscheckbox);
			javascriptclick(accepttermscheckbox);
			
			Thread.sleep(2000);
//			// submit for verification 
			waitforElement(submitforverification);
			javascriptclick(submitforverification);
			
			Thread.sleep(1000);
			
			
		
	}

		
		public void kycdocuploadandsubmit(String labelnames, List<WebElement> uploadFiles, List<WebElement> submitButtons) throws InterruptedException 
		{
			
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 
			 for (int i = 0; i < labelList.size(); i++) {
		        String labelText = labelList.get(i).getText().trim();
		        System.out.println("Found label: " + labelText);

		        if (labelText.contains(labelnames)) {
		        	
		            WebElement uploadInput = uploadFiles.get(i);
		            WebElement submitButton = submitButtons.get(i);	

		            // Make upload input visible (if hidden)
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            js.executeScript("arguments[0].style.display='block';", uploadInput);
		            
		            //Wait until input is clickable before upload
//		            wait.until(ExpectedConditions.elementToBeClickable(uploadInput));
		            
		            Thread.sleep(3000);
// /home/active34/Downloads/photos /QA club photos/Club 7.png
		          //  C:\\Users\\User\\Desktop\\Background images\\Bg-1.jpg
		            // Upload the file
		            uploadInput.sendKeys("/home/active34/Downloads/photos /QA club photos/Club 7.png");
		            System.out.println("✅ File uploaded for label: " + labelnames);
		            
		            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", submitButton);
		            
		            // Click the corresponding submit button
		            js.executeScript("arguments[0].click();", submitButton);
		            
//		            Thread.sleep(3000);
		            System.out.println("✅ Submit button clicked for label: " + labelnames);

		            // ✅ Confirmation handling - Toast/Popup message
		            try {
//		            	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		                WebElement confirmationMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
		                    By.xpath("//div[@class='ant-notification-notice-message']")
		                ));
		                System.out.println("✅ Confirmation: " + confirmationMsg.getText());
		            } catch (org.openqa.selenium.TimeoutException e) {
		                System.out.println("⚠ No confirmation message appeared — continuing...");
		            } 
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
		        String dateText = date.getText().trim(); 
		        if (dateText.equals(dateno)) {
		            date.click();
		            System.out.println("✅ Date selected: " + dateno);
		            break;
		        }
		    }
		}
	
}
