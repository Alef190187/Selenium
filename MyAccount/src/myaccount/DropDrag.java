package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDrag {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("q")).sendKeys("Love");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		/*driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
		driver.findElement(By.linkText("Droppable")).click();*/
		
		
		
		

	}

}
