package myaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Joy");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Khan");
        driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("alef_ru@yahoo.com");
        
          List<WebElement> Linklist = driver.findElements(By.tagName("a"));
          
          System.out.println(Linklist.size());
          
          for (int i=0; i<Linklist.size(); i++) {
        	  String link = Linklist.get(i).getText();
        	  System.out.println(link);
          }
        driver.findElement(By.xpath("//*[contains(@name,'reg_email_confirmation__')]")).sendKeys("alef_ru@yahoo.com");
        driver.findElement(By.xpath("//*[contains(@id,'u_0_o')]")).sendKeys("2155941186");
        Select select = new Select(driver.findElement(By.xpath("//*[contains(@id,'month')]")));
        select.selectByVisibleText("Jan");
        
        Select select1 = new Select(driver.findElement(By.xpath("//*[contains(@id,'day')]")));
        select1.selectByVisibleText("31");
        
        Select select2 = new Select(driver.findElement(By.xpath("//*[contains(@id,'year')]")));
        select2.selectByVisibleText("2000");
        driver.findElement(By.xpath("//*[contains(@for,'u_0_9')]")).click();
        driver.findElement(By.xpath("//*[contains(@id,'u_0_u')]")).click();
        driver.quit();
        
	}

}
