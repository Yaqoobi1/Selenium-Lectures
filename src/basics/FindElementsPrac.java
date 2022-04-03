package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPrac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://tek-school.com/retail");
        
     // to find all links and print href attribute value
        List<WebElement> weblinks = driver.findElements(By.className("dropdown-toggle"));
	    System.out.println(weblinks.size() + " This is the size for weblinks list");
	    for(WebElement links : weblinks) {
	    	System.out.println(links.getAttribute("href")); // this will return value of attribute you define
	    	if(links.getText().equals("My Account")) {
	    		links.click();
	    		break;
	    		
	    		
	    		
	    	}
	    }
	  //  driver.close();

	}

}
