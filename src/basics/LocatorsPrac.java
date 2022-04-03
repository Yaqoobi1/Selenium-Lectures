package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPrac {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.get("https://www.amazon.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	    WebElement email = driver.findElement(By.name("email"));
	    WebElement password = driver.findElement(By.id("pass")); 
	    WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
	    if(email.isDisplayed() == true) {
	    email.sendKeys("dlk@gmail.com");
	    Thread.sleep(3000);
	    email.clear();
	    email.sendKeys("tyaqoobi@gmail.com");
	    Thread.sleep(3000);
	    password.sendKeys("kjdljfdk");
	    Thread.sleep(3000);
	    login.click();
	    boolean logincheck = login.isEnabled();
	    System.out.println("login Checked");
//	    login.submit();
	    login.click();
	    }else {
	    	driver.close();
//	    	driver.quit();
	    }
	  
	
		
	}

}
