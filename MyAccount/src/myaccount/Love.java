package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Love {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a").click();
		Thread.sleep(4000);
		driver.findElementByXPath("/html/body/nav/div/a[2]").click();
		driver.findElementByXPath("//*[@id=\"identifierId\"]").sendKeys("Alef190187@gmail.com");
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@id=\"identifierNext\"]/content/span").click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Au190187");
		driver.findElementByXPath("//*[@id=\"passwordNext\"]/content/span").click();
		driver.quit();
		
		
		
	}

}
