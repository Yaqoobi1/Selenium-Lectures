package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) {
	  System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tekschool.us/");
		System.out.println("Website Title: " + driver.getTitle());
		driver.navigate().to("https://www.google.com/");
		System.out.println("Website Title: " + driver.getTitle());
		driver.navigate().back();
		driver.close();			
	
		
		
		
		
		
		
		
		
		

	}

}
