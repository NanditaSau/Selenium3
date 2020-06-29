package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Resources\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop"); 
		
		WebElement From = driver.findElement(By.id("column-a"));  
	  
    	WebElement To = driver.findElement(By.id("column-b"));  
	
			
	  		
		   
		Actions act = new Actions(driver);  
		act.dragAndDrop(From,To).build().perform();  
		

		
        driver.close(); // it will close the current page

	}

}
