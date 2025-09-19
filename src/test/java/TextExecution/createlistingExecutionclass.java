package TextExecution;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.createlistingpage;

public class createlistingExecutionclass extends Baseclass {
	
	@Test
	public void createlistingpage() throws InterruptedException
	{
		createlist = new pageobject.createlistingpage(driver);
		createlist.createlistingbyprivatemines(
				prop.getProperty("username"), prop.getProperty("password"), 
				prop.getProperty("businessprofile"),prop.getProperty("Businessprofileoption"), 
				prop.getProperty("coaltype"), prop.getProperty("coaltypeoption"), 
				prop.getProperty("origincoal"),prop.getProperty("origincoaloption"),
				prop.getProperty("sourceofcoal"), prop.getProperty("sourceofcoaloption"),
				prop.getProperty("gradeofcoal"),prop.getProperty("gradeofcoaloption"), 
				prop.getProperty("cilsubsidiary"),prop.getProperty("cilsubsidairyoption"), 
				prop.getProperty("mine"), prop.getProperty("mineoption"),
				prop.getProperty("Deliverymode"), prop.getProperty("deliverymodeoption"));
				
	}

}
