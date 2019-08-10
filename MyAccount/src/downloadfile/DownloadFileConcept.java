package downloadfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
	    driver.get("https://www.gmail.com/");
	    driver.findElement(By.id("identifierId")).sendKeys("Alef190187");
	    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	    driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("Au190187");
	    driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']")).click();
	    //driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//textarea[@id=':r1']")).sendKeys("mdalef190187@gmail.com");
       driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@title='T- 2.jpg']")).click();
       driver.findElement(By.xpath("//div[@class='aLF-aPX-JX aLF-aPX-Mw-I-JX aLF-aPX-aYT-JX']")).click();
       

	}

}
