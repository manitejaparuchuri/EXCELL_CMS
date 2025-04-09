package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.enqpage;
import testBase.baseclass;

public class enquiretest extends baseclass{

	@Test
	public void enquiretest1() throws Exception {
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://vjwbilling.excellmedia.net/cms/login.php");
//		loginTest lt = new loginTest();
//		lt.logintest();
		enqpage enq = new enqpage(driver);
		enq.enq_bt();
		//logger.info("clicked on enq button");
		enq.manage_enq_btt();
		Thread.sleep(3000);
		super.captureScreen("enq");
		
	}
}
