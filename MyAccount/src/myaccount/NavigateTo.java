package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bangladesh");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Khan");
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.manage().window().maximize();
		
		//driver.navigate().refresh();

	}

}
