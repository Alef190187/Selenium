package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseControl {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe", "webdriver.chrome.driver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("https://www.qatarairways.com");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("LC20lb")).click();
		driver.manage().deleteAllCookies();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Discover"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Europe")).click();
		driver.findElement(By.xpath("//*[@id=\"tab1-3\"]/div/ul/li[2]/a/span")).click();
		//driver.quit();
		
		
		 
		
		
	}

}
