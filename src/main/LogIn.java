package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
	
		
			System.setProperty("webdriver.chrome.driver", "F:\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/login"); 

			By by = By.id("username");
			
			WebElement elem = driver.findElement(by);
			

			elem.sendKeys("tomsmith");
			
			By by1 = By.id("password");
			
			WebElement elem1 = driver.findElement(by1);
			

			elem1.sendKeys("SuperSecretPassword!");
			
			driver.findElement(By.className("radius")).click();
			
			System.out.println(driver.getTitle());
			
			driver.findElement(By.linkText("Logout")).click();

			driver.close(); // it will close the current page
		//	driver.quit(); // it will close all the opened pages


			}

}
