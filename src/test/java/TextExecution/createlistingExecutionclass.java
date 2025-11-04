package TextExecution;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Basepackage.Baseclass;
import pageobject.createCILlistingpage;

public class createlistingExecutionclass extends Baseclass {
	
	@Test
	public void createlistingpage() throws InterruptedException, AWTException
	{
		createlist = new pageobject.createCILlistingpage(driver);
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
				
				prop.getProperty("deliverymodeoption"), prop.getProperty("QuantityMTinputdata"), 
				prop.getProperty("rateperMTinputdata"), prop.getProperty("deliverytermoption"), 
				prop.getProperty("paymenttermoption"), prop.getProperty("emdinputdata"), 
				prop.getProperty("freepaymentinputfield"), prop.getProperty("freeliftingperiodoption"), 
				prop.getProperty("Startdate"), prop.getProperty("enddate"), prop.getProperty("addressbookdata"),
				prop.getProperty("otherremarkstextarea"));
				
		
	}
	

	@Test
	public void createcilsplitlistingpage() throws InterruptedException, AWTException
	{
		createlist = new pageobject.createCILlistingpage(driver);
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
				
				prop.getProperty("deliverymodeoption"), prop.getProperty("QuantityMTinputdata"), 
				prop.getProperty("rateperMTinputdata"), prop.getProperty("deliverytermoption"), 
				prop.getProperty("paymenttermoption"), prop.getProperty("emdinputdata"), 
				prop.getProperty("freepaymentinputfield"), prop.getProperty("freeliftingperiodoption"), 
				prop.getProperty("Startdate"), prop.getProperty("enddate"), prop.getProperty("addressbookdata"),
				prop.getProperty("otherremarkstextarea"));
				
		
	}

}
