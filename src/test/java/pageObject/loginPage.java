package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basepage {

	public loginPage(WebDriver driver) {
		super(driver);
		
	}

	
	
	@FindBy(id = "user")WebElement username_txt;
	@FindBy(id = "password") WebElement password_txt;
	@FindBy(name = "sumbit") WebElement submit_btn;
	@FindBy(xpath = "//div[contains(text(),'Incorrect Username/Password')]") WebElement invalidlogin;
	@FindBy(xpath = "//h2[normalize-space()='Welcome M Maniteja']") WebElement welcomemesg;
	
	
	public void username(String username) {
		username_txt.sendKeys(username);
		
	}
	
	public void password(String password) {
		password_txt.sendKeys(password);
	}
	
	public void submit() {
		submit_btn.click();
	}
	
	
	public String welcome() {
		String mesg=welcomemesg.getText();
		return mesg;
	}
	
	public String error() {
		String err= invalidlogin.getText();
		return err;
	}
	
}
