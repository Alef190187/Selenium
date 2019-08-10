package myaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
	
		driver.findElement(By.id("identifierId")).sendKeys("mdalef190187");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Au190187");;
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='gb_Ea gb_Tc gb_pg gb_f gb_xf']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.navigate().back();

	}

}
