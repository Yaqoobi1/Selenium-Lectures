package basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommandPrac {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
   driver.get("https://mail.google.com/");
   Thread.sleep(5000);
   System.out.println("Website Title: " + driver.getTitle());
   driver.navigate().to("https://www.amazon.com");
   Thread.sleep(5000);
//    System.out.println("Website Title: "+ driver.getTitle());
//    driver.navigate().refresh();
//    driver.navigate().back();
//    Thread.sleep(5000);
//    driver.navigate().to("https://www.facebook.com/");
//    Thread.sleep(5000);
//    driver.navigate().refresh();
//    Thread.sleep(5000);
    driver.navigate().forward();
//    System.out.println("Website Title: "+ driver.getTitle());
//    Thread.sleep(5000);
//    driver.navigate().to("https://mail.google.com/");
    Thread.sleep(5000);
    driver.quit();
//    driver.close();
    
    
   
   

	}

}
