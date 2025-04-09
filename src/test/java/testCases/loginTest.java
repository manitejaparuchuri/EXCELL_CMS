package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.loginPage;
import pageObject.usagereport;
import testBase.baseclass;

public class loginTest extends baseclass{
	
	@Test
	public void logintest() throws Exception {
		logger.info("test login starting");
		loginPage lp = new loginPage(driver);
		lp.username("maniteja");
		logger.info("username entered");
		lp.password("excell4039");
		logger.info("password entered");
		Thread.sleep(2000);
		super.captureScreen("logindetails");
		logger.info("login page screen shot");
		lp.submit();
		logger.info("clicked on submit button on login page");
		
//		usagereporttest ut = new usagereporttest();
//		ut.test1();
//		
//		enquiretest eq= new enquiretest();
//		eq.enquiretest1();
		
		///// usage report testexecution code 
		
//		usagereport ur = new usagereport(driver);
//		ur.usagereport();
//		ur.iptext("172.16.172.16");
//		ur.selectmonth("March");
//		ur.go();
//		Thread.sleep(5000);
//		super.captureScreen("usagereport");
			
	}
	
	

}
