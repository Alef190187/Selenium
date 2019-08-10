package myaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Linklist1 {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		WebElement target = driver.findElement(By.cssSelector("#email"));
		Actions action = new Actions(driver);
		
		action.contextClick(target).build().perform();
		
		
      List<WebElement>list = driver.findElements(By.tagName("a"));
      System.out.println(list.size());
      for(int i=0; i<list.size(); i++) {
    	  String link=list.get(i).getText();
    	  System.out.println(link);
      }
	}

}
