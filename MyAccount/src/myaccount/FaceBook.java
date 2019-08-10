package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe", "webdriver.chrome.driver");
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("window-size=1400,800");
		option.addArguments("headless");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Tha page title is ==>"+ driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("facebook");
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
		System.out.println("the page title is ==>" +driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("Akash");
		driver.findElement(By.name("lastname")).sendKeys("Batash");
		driver.findElement(By.name("reg_email__")).sendKeys("2155941186");
		driver.findElement(By.name("reg_passwd__")).sendKeys("215-594-1186");
	
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jan");
		
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByVisibleText("31");
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_s\"]/span[2]/label")).click();
		System.out.println("The current url is ===>"+ driver.getCurrentUrl());
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
