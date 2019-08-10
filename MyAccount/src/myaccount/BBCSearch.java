package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
       
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bbc.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sport")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Culture")).click();
				
	}

}
