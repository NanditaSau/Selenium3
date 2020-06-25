package main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondA {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Resources\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html"); 
		
		driver.findElement( By.linkText("2")).click();
		
		System.out.println("7th row 5th value : "+driver.findElement( By.xpath("//table//tr[7]/td[6]")).getText());

		driver.quit();


	}

}
