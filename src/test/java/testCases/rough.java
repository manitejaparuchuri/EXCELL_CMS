package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ExcelUtility;

public class rough {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path ="C:\\Users\\mp66995\\Desktop\\excell.xlsx";
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://maniteja:excell4039@vjwbilling.excellmedia.net/");

		ExcelUtility ex = new ExcelUtility(path);
		int rowcount= ex.getRowCount("Sheet2");
		int colcount = ex.getCellCount("Sheet2", 1);
		System.out.println(rowcount);
		System.out.println(colcount);
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				String data=ex.getCellData("Sheet2", i, j);
				System.out.println(data);
				driver.findElement(By.xpath("//input[@name='search_cust']")).sendKeys(data);
				driver.findElement(By.xpath("//input[@value='Search customers']")).click();
				Thread.sleep(2000);
			}
		}
		
		
		
		
		
		
	}

}
