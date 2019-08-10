package myaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class PopUpControl {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The Text is:" + alert.getText());
		alert.accept();
		
		//String text = alert.getText();
		
		/*if (text.equals("Please enter a valid user name")){
			System.out.println("The mess is correct");
		}
		else {
			System.out.println("The mess is not correct");
		}*/
		//driver.quit();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		

	}

}
