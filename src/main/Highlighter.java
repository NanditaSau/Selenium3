  
package main;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Highlighter {

	public static void main(String[] args) throws InterruptedException {

		@SuppressWarnings("unused")
		WebDriver driver = null;
		String browser = "chrome";
		String mainDir = System.getProperty("user.dir");
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", mainDir+"\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", mainDir+"\\Resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		
	}

}