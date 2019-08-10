package myaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleCanlender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
	    driver.get("https://www.expedia.com/");
	    
	    
	    
	    driver.findElement(By.xpath("//input[(@id='package-origin-hp-package')]")).sendKeys("Philadelphia, PA (PHL-Philadelphia Intl.)");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[(@id='package-destination-hp-package')]")).sendKeys("Dhaka, Bangladesh (DAC-Shahjalal Intl.)");
        Thread.sleep(3000);
	    WebElement data =driver.findElement(By.id("package-departing-hp-package"));
	    String dateValue="04/18/2019";
	    CalenderHandleByJS(driver, data, dateValue);
	    
	    WebElement data1 =driver.findElement(By.id("package-returning-hp-package"));
	    String dateVal="07/27/2019";
	    CalenderHandleByJS(driver, data1, dateVal);
	    Thread.sleep(3000);
	    
	    
	  //driver.quit();  

	}
	
	
	
	public static void CalenderHandleByJS(WebDriver driver, WebElement element, String dataValue) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dataValue+"');", element);
		
	}

}
