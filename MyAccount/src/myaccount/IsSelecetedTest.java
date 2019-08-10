package myaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelecetedTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
	    driver.get("https://register.freecrm.com/register/");
	    driver.findElement(By.xpath("//input[@id='terms']")).click();
	    boolean b = driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
	    System.out.println(b);
	    boolean b1 = driver.findElement(By.xpath("//button[@name='action']")).isEnabled();
	    System.out.println(b1);
	    
	    boolean b2 = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	    System.out.println(b2);

	}

}
