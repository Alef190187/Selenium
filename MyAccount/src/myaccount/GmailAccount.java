package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Gmail New Account");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div/div/div[1]/a/h3")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
        driver.findElement(By.id("firstName")).sendKeys("Alif");
        Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("Uddin");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("uddinalif67@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("Passwd")).sendKeys("Abcd*123");
        Thread.sleep(2000);
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Abcd*123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/content/span")).click();
       
      // driver.close();
		
	}

}
