package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyBest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("alef_ru@yahoo.com");
	driver.findElement(By.xpath("//*[@id=\"emailSubmissionId\"]/div/div[2]/div/input")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"hf_accountMenuLink\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"account-menu-app\"]/div/div[4]/div/div/a/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstName")).sendKeys("Alif");
	driver.findElement(By.name("lastName")).sendKeys("Chudhury");
	driver.findElement(By.id("fld-e")).sendKeys("Mdalef190187@gmail.com");
	driver.findElement(By.xpath("//*[contains(@id,'fld-p1')]")).sendKeys("Au2155941186");
	driver.findElement(By.xpath("//*[contains(@id,'fld-p2')]")).sendKeys("Au2155941186");
	driver.findElement(By.xpath("//*[contains(@id,'fld-phone')]")).sendKeys("1215-594-1186");
	driver.findElement(By.xpath("/html/body/div[1]/section/main/div[1]/div[1]/div/div/form/div[7]/label/input")).click();
	driver.findElement(By.className("btn-text")).click();
	
	driver.close();
	}

}
