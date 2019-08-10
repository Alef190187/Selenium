package myaccount;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BestBuy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("www.bestbuy.com");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("LC20lb")).click();
		
		
		Thread.sleep(5000);
		 Set<String> handler = driver.getWindowHandles();
		 Iterator<String> it = handler.iterator();
		 String ParentWindowId=it.next();
		 System.out.println("parent wnidow id is :"+ ParentWindowId );
		 Thread.sleep(3000);
		 
		 String ChildWindowId = it.next();
		 System.out.println("The child window Id is:"+ ChildWindowId );
		 
		 driver.switchTo().window(ChildWindowId);
		 Thread.sleep(3000);
		 
		 System.out.println("The child window title is :" + driver.getTitle());
		 
		 driver.close();
		 
		 driver.switchTo().window(ParentWindowId);
		 System.out.println("Parent window title is:"+ driver.getTitle());
		 
		Alert alert = driver.switchTo().alert();
		driver.findElement(By.xpath("//*[@id=\"modal347\"]/div/div/div[1]/button/span[2]")).click();
		alert.dismiss();
		driver.close();

		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
	
	
	driver.switchTo().frame("destination_publishing_iframe_bestbuy_0_name");
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"widget-1b1abf1b-2bef-41a2-ad44-0917161f32f2\"]/div"))).build().perform();
	driver.findElement(By.xpath("//*[@id=\"modal16\"]/div/div/div[1]/button/span[2]")).click();
    
	}

}
