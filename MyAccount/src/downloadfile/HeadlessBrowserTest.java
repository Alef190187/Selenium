package downloadfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		
//	    ChromeOptions option = new ChromeOptions();
//	    option.addArguments("window-size=1400,800");
//	    option.addArguments("headless");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("Page title is==>" + driver.getTitle());
	    driver.get("https://www.gmail.com/");
	    System.out.println("The current URL is ==>" + driver.getCurrentUrl());
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("Alef190187");
	    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	    driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("Au190187");
	    driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']")).click();
	    System.out.println("Page title is after==>  " + driver.getTitle());
	    //driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	    //Thread.sleep(3000);
	    //driver.close();

	}

}
