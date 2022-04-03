package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorPrac {

	public static void main(String[] args) {
	}
		// TODO Auto-generated method stub
		public static void clickWithJS(WebElement element,WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",element);
		}
		public static void sendValueWithJS(WebElement element, String value, WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('" + element + "').value='" + value + "'");
		}
		public static void selectDateByJS(WebElement element, String date, WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);
		}
		public static void scrollPageDownWithJS(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		}

		


		
	

	}


