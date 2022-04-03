package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPracticePrac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		System.out.println(myAccount.isDisplayed());
		myAccount.click();
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
		WebElement yesButton = driver.findElement(By.xpath("//input[@value='1' and @name='newsletter']"));
		WebElement noButton = driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']"));
		WebElement privacy = driver.findElement(By.xpath("//input[@name='agree']"));
		WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
		
		firstName.sendKeys("Samir");
		lastName.sendKeys("Tatar");
		email.sendKeys("hdttdj@gmail.com");
		telephone.sendKeys("5245665848");
		password.sendKeys("458565948");
		confirmPassword.sendKeys("458565948");

		if(yesButton.isDisplayed()) {
			yesButton.click();
		}
		Thread.sleep(5000);
		
		if (privacy.isDisplayed()) {
			privacy.click();
		}
		
		Thread.sleep(5000);
		
		continueButton.click();
		
		WebElement confirmationText = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']"));
		String success = confirmationText.getText();
		String expectedText = "Your Account Has Been Created!";
		
		if(success.equals(expectedText)) {
			System.out.println("Test Status: "+"Test Passed");
		}else
		{
			System.out.println("Test Status:"+"Test Failed");
		}
		
		

	}

}
