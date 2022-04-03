package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        // Open Test Environment 
		driver.get("http://tek-school.com/retail");
		// move mouse over Laptops & NoteBooks
		Actions action = new Actions(driver);
		WebElement laptopsAndNoteBooks = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
		action.moveToElement(laptopsAndNoteBooks).build().perform();
		Thread.sleep(5000);
		//double click on Show All Laptops & Notebooks element
		WebElement showAllLaptopAndNotebooks  = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		action.doubleClick(showAllLaptopAndNotebooks).build().perform();
		//Sort by price (low> high) on short by dropdown
		WebElement sortBy = driver.findElement(By.id("input-sort"));
		Select select = new Select(sortBy);
        select.selectByVisibleText("Price (Low > High)");
        // navigate to https://ksrtc.in/oprs-web/
        driver.navigate().to("https://ksrtc.in/oprs-web/ ");
        //click on app Store element
        WebElement appStore = driver.findElement(By.xpath("//p[text()='App Store']"));
        appStore.click();
        //switch driver to child window 
        Set <String> winhandl =driver.getWindowHandles();
        Iterator<String> iterator = winhandl.iterator();
		String parentWindow = iterator.next();
    	String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
		//print title and close window
		System.out.println(driver.getTitle()+ " This is Child window title");
		driver.close();
		//switch to Parentwindow
		driver.switchTo().window(parentWindow);
		 // click on search
		WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		search.click();
		Thread.sleep(5000);
		//Then accept alert
		driver.switchTo().alert().accept();
		
		
		driver.close();
	}
}