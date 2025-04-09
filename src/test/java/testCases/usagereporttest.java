package testCases;

import org.testng.annotations.Test;

import pageObject.usagereport;
import testBase.baseclass;

public class usagereporttest extends baseclass {

	@Test
	public void test1() throws Exception {
		
		
	///// usage report testexecution code 
		
		
		
			usagereport ur = new usagereport(driver);
			ur.usagereport();
			logger.info("clicked on usage report button");
			ur.iptext("172.16.172.16");
			logger.info("given ip address on text box");
			ur.selectmonth("March");
			logger.info("month got selected");
			ur.go();
			logger.info("clicked on go button");
			Thread.sleep(5000);
			super.captureScreen("usagereport");
			logger.info("usage report screen shot was captured");
	
	}
		
		
	
	
}
