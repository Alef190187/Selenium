import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.get("https://jqueryui.com/droppable/");
	        //find out number of frames.
	        List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
	        System.out.println("total frames is ===> "+totalFrames.size() );
	        
	        for(int j=0; j<totalFrames.size(); j++) {
	        	String frames =totalFrames.get(j).getText();
	        	System.out.println(frames);
	        }
	        //find out number and name of the links.
	        List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
	        
	        System.out.println(totalLinks.size());
	        for( int i=0; i<totalLinks.size(); i++) {
	        	String links =totalLinks.get(i).getText();
	        	System.out.println(links);
	        }
	        
	        //switch to the frame.
	        driver.switchTo().frame(0);
	        
	        Actions action = new Actions(driver);
	        //action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
	        //.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
	        //.release()
	        //.build()
	        //.perform();
	        //drag and drop methods.
	       WebElement src= driver.findElement(By.xpath("//div[@id='draggable']"));
	       WebElement tar = driver.findElement(By.xpath("//div[@id='droppable']"));
	       action.dragAndDrop(src, tar).perform();//pass the source and target parameters.
	       
	       action.moveToElement(tar).contextClick().perform();//right click.
	       driver.switchTo().defaultContent();//back to the main window.
	        Thread.sleep(3000);
	        //driver.navigate().refresh();
	        
	        action.moveToElement(driver.findElement(By.xpath("//li[@class='dropdown']//a[text()='Support']"))).build().perform();
	        driver.findElement(By.linkText("Stack Overflow")).click();
	        driver.close();
	        

	}

}
