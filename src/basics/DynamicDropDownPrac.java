package basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicDropDownPrac {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/");
		WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		Thread.sleep(5000);
		from.clear();
		Thread.sleep(5000);
		from.sendKeys("GYL");
		//I did my self the below codes
		WebElement depart = driver.findElement(By.xpath("//body[@id='aa-lang-en']"));
	depart.sendKeys("10/17/2021");
	WebElement back = driver.findElement(By.xpath("//input[@id='aa-returningFrom']"));
	back.sendKeys("10/30/2021");
	WebElement search = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
	search.click();
	
	
			

		
		
		
		
		
		
		
		
		
		
		
	}

}
