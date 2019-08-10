package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccount {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("gmail account");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[4]/div/div/div[1]/a/h3")).click();
	Thread.sleep(2000);
	
	
	     }

	//driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[5]/ul[1]/li[3]/a")).click();
	//driver.manage().window().maximize();

	
	

	}


