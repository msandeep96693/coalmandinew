package TextExecution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.createlistingpage;

public class createlistingExecutionclass extends Baseclass {
	
	@Test
	public void createlistingpage() throws InterruptedException, AWTException
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
				
				// coal specification
				prop.getProperty("carbonpercentage"), prop.getProperty("carbonpercentageinputdata"),
				prop.getProperty("ashcontentpercentage"), prop.getProperty("ashcontentinputdata"),
				prop.getProperty("volatilepercentage"), prop.getProperty("volatileinputdata"),
				prop.getProperty("totalmoisturepercentage"), prop.getProperty("moistureinputdata"),
				
			
				
//				prop.getProperty("carbonmaxminlabel"), prop.getProperty("carbonmaxminoption"),
//				prop.getProperty("ashcontentlabel"), prop.getProperty("ashcontentoption"),
//				prop.getProperty("volatilelabel"),prop.getProperty("volatileoption"),
//				prop.getProperty("moisturelabel"), prop.getProperty("moistureoption"),
				
//				
				
//				prop.getProperty("Deliverymode"), 
				prop.getProperty("deliverymodeoption"),
				prop.getProperty("railwaysidingcode"), prop.getProperty("sidingcodeinputdata"),
				prop.getProperty("QuantityMT"), prop.getProperty("QuantityMTinputdata"),
				prop.getProperty("RateperMT"), prop.getProperty("rateperMTinputdata"),
				prop.getProperty("emdlabel"), prop.getProperty("emdinputdata"),
				prop.getProperty("freepaymentperiodlabel") 

				);
				
	}

}
