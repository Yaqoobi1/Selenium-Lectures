package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerPrac {

	public static void main(String[] args) {
		WebDriver driver;
		
		String browserName = "";
		switch (browserName){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		    break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			driver.get("https://www.facebook.com/");
		
		
		}
	}
