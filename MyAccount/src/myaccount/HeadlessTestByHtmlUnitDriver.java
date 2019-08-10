package myaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class HeadlessTestByHtmlUnitDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		//WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		System.out.println("Tha page title is ==>"+ driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		System.out.println("The page title is===>" + driver.getTitle());
		driver.quit();
		
	}

}
