package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilePrac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://xndev.com/display-image/");
		WebElement uploadFile = driver.findElement(By.xpath("//input[@Type='file']"));
		uploadFile.sendKeys("C:\\Users\\Yaqoobi\\OneDrive\\Desktop\\Java\\Workspace\\SelenuimPractice\\outcome\\firstNameSSpng");
		Thread.sleep(5000);
		driver.close();
	}

}
