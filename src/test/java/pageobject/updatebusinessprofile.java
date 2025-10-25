package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class updatebusinessprofile {
	
	WebDriver driver;
	signinpage page;

	@Test
	public void updatebusinessprofilesettingpage() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://coalmandi.rokkun.dev");
		page = new signinpage(driver);
		page.signinpage("sandeep+demodomestic@rokkun.io", "Sandeep@123");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@aria-label='user']")).click();
		// /html/body/div/div/div[2]/header/div/div[2]/div[2]/span[2]
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Settings']/..")).click();
		// /html/body/div/div/div[2]/header/div/div[2]/div[3]/button[1]
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-node-key='business_profiles']")).click();
		// /html/body/div/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[2]
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[.='Continue Editing'])[1]/..")).click();
		
		Thread.sleep(1000);
		WebElement kyc = driver.findElement(By.xpath("//span[.='Proceed to KYC']/.."));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", kyc);
		driver.findElement(By.xpath("//span[.='Proceed to KYC']/..")).click();
		
		Thread.sleep(1000);
		WebElement authletter = driver.findElement(By.xpath("//span[.='Authorization Letter']"));
		JavascriptExecutor jsa = (JavascriptExecutor) driver;
		jsa.executeScript("arguments[0].scrollIntoView(true);", authletter);
		
		Thread.sleep(2000);
		// WebElement uploadfile = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div[3]/div[1]/form/div/div[2]/div[1]/div/div/input"));
		
		
//		WebElement uploadfile = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
//		
//		JavascriptExecutor jss = (JavascriptExecutor) driver;
//		jss.executeScript("arguments[0].style.display='block';", uploadfile);
//		uploadfile.sendKeys("C:\\Users\\User\\Desktop\\Background images\\Bg-3.jpg");
		
		//kyclabelname("Authorization Letter", uploadFiles, submitButtons);
		
		//span[.='Submit']/..
		/*
		Authorization Letter
		PAN Card
		GST Certificate
		TAN Certificate
		LUT Certificate
		Bank Details
		Udyam Certificate (MSME)
		IEC Certificate
		D&B
		*/
	} 
	

	

}
