package main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Search_Error {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Resources\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.cleartrip.com/"); 
		
		driver.findElement(By.id("FromTag")).sendKeys("kolkata");
		driver.findElement(By.id("ToTag")).sendKeys("bangalore");
		driver.findElement(By.id("DepartDate")).sendKeys("21/8/2020");
		Select s = new Select(driver.findElement(By.name("adults")));
		s.selectByVisibleText("2");
		Select b = new Select(driver.findElement(By.name("childs")));
		b.selectByVisibleText("1");
		
	    Thread.sleep(2000);

		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.xpath("(//strong[@class='resultsCount'])[1]")).getText());
		
	    Thread.sleep(10000);

		

	    //driver.close();
	    

		System.setProperty("webdriver.chrome.driver", "F:\\Resources\\chromedriver.exe");
		ChromeDriver driver1  = new ChromeDriver();
		driver1.get("https://www.cleartrip.com/"); 
		
		driver1.findElement(By.id("FromTag")).sendKeys("");
		driver1.findElement(By.id("ToTag")).sendKeys("bangalore");
		driver1.findElement(By.id("DepartDate")).sendKeys("21/8/2020");
		Select s1 = new Select(driver1.findElement(By.name("adults")));
		s1.selectByVisibleText("2");
		Select b1 = new Select(driver1.findElement(By.name("childs")));
		b1.selectByVisibleText("1");
		
	    Thread.sleep(2000);

		driver1.findElement(By.id("SearchBtn")).click();
		
		driver1.findElement(By.id("homeErrorMessage")).click();  
         
	     Alert alert = (Alert) driver1.switchTo().alert();  
	          
	     alert.accept();  
	          
	     driver.findElement(By.className("hint ugly errorLabel")).click();  
	          
	          
	     Alert confirmBox = (Alert) driver.switchTo().alert();  
	          
	     ((Alert) confirmBox).dismiss();  

		
	}

}
