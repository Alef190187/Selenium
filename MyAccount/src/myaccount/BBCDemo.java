package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCDemo {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.bbc.com");
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       
       driver.findElement(By.linkText("Home")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//a[@class='media__link' and @rev='hero2|headline']")).click();
       driver.navigate().to("https://www.google.com");
       Thread.sleep(3000);
       driver.navigate().back();
       driver.navigate().back();
       
       driver.findElement(By.xpath("//*[@id=\"orb-search-q\"]")).sendKeys("Bangladesh");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"orb-search-q\"]")).sendKeys(Keys.ENTER);
       driver.navigate().back();

       
	}

	
}
