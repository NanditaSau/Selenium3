package main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Resources\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get(" https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.findElement(By.xpath("(//*[@class='page_link'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//table[@class='table table-hover']//tr[7]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class='table table-hover']//tr[1]/th[6]")).getText());
		//System.out.println(driver.findElement(By.xpath("//table[@class='table table-hover']//tr[2]/td[6]")).getText());
	

	}

}
