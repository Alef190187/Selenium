package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BuyLaptop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Select select = new Select(driver.findElement(By.id("month")));
		//select.selectByVisibleText("Jan");
		
		driver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("alef_ru@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"emailSubmissionId\"]/div/div[2]/div/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hf_accountMenuLink\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"account-menu-app\"]/div/div[2]/div/div/a/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@id,'fld-e')]")).sendKeys("Mdalef190187@gmail.com");
		driver.findElement(By.xpath("//*[contains(@id,'fld-p1')]")).sendKeys("Au2155941186");
		driver.findElement(By.xpath("/html/body/div[1]/section/main/div[1]/div[1]/div/div/form/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@id,'gh-search-input')]")).sendKeys("laptop");
		
		driver.findElement(By.xpath("//*[contains(@id,'gh-search-input')]")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"shop-search-sku-banner-1\"]/div/div/div[2]/ol/li[1]/div/div[2]/div/div[1]/h3/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"pdp-add-to-cart-button\"]/div[4]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"pdp-add-to-cart-button\"]/div[4]/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/a/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"cartApp\"]/div/div[1]/div/div/span/div/div[3]/div/div[1]/div[1]/div/button")).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
