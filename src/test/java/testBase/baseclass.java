package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class baseclass  {

	public WebDriver driver;
	public Logger logger;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os, String br) {
		
	////loading log4j 
		logger=LogManager.getLogger(this.getClass());//Log4j
		
		switch(br.toUpperCase()) {
		case "CHROME"	: driver=new ChromeDriver();break;
		case "EDGE"		: driver = new EdgeDriver();break;
		case "FIREFOX"	: driver= new FirefoxDriver();break;
		//default			: System.out.println("select valid browser");
		//return;
		
		}
		
		//driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://vjwbilling.excellmedia.net/cms/login.php");
				
	}
//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
	
	
	/// for capturing screen shots 
	public String captureScreen(String tname) throws IOException {
		String path ="C:\\Users\\mp66995\\Desktop\\eclipse\\workspace\\EXCELL_CMS\\SCREENSHOT";

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath= path + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
	
	
	
}
