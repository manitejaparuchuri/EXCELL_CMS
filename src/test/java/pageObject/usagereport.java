package pageObject;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class usagereport extends basepage {

	public usagereport(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Usage')]") WebElement usagereport_opt;
	@FindBy(xpath = "//input[@name='ip']")WebElement ip_txt;
	@FindBy(xpath = "//select[@name='month']") WebElement dd;
	@FindBy(xpath = "//input[@value='Go']") WebElement go;
	
	
	public void usagereport() {
		usagereport_opt.click();
	}
	
	public void iptext(String ip) {
		ip_txt.sendKeys(ip);
	}
	
	public void selectmonth(String month) {
		Select dropdown = new Select(dd);
		dropdown.selectByContainsVisibleText(month);
	}

	public void go() {
		go.click();
	}
	
	
	
}
