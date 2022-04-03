package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownPrac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/index.php?route=product/category&path=20");
		WebElement sortby = driver.findElement(By.id("input-sort"));
		Thread.sleep(5000);
		Select select = new Select(sortby);
		select.selectByVisibleText("Price (High > Low)");
		//select.selectByIndex(3);
    	//select.selectByValue("")
	}

}
