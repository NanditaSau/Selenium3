package main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Resources\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()); 

        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
	    Thread.sleep(2000);

        System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());  

        
        driver.close(); // it will close the current page


	}

}

