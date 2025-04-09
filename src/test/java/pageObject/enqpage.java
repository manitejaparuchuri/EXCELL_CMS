package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class enqpage extends basepage{

	public enqpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[@class='nav-top-item current']") WebElement enq_opt;
	@FindBy(xpath = "//a[normalize-space()='Manage Enquiries']") WebElement manage_enq;
	
	public void enq_bt() {
		enq_opt.click();
	}
	
	public void manage_enq_btt() {
		manage_enq.click();
	}

}
