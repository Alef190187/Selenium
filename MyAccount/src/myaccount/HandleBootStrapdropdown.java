package myaccount;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootStrapdropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
	    driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
	    
	    driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	    List<WebElement>list = driver.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuButton']//a"));
        
	    System.out.println(list.size());
	    
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(list.get(i).getText());
	    	if(list.get(i).getText().contains("Another action")) {
	    		list.get(i).click();
	    		//break;
	    	}
	    	
	    }
	    
	    //driver.close();
	}

}
