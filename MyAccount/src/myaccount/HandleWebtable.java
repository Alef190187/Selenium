package myaccount;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
        List<WebElement>list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
        System.out.println(list.size());
        //for clicking all the elements.
        /*for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i).getText());
        	list.get(i).click();
        	boolean b = list.get(i).isSelected();
        	System.out.println(b);
        	
        }*/
        
        //for clicking on specific lebel.
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().contains("MySQL")) {
        	list.get(i).click();
        	boolean b1 = list.get(i).isSelected();
        	System.out.println(b1);
        	break;
        	
    												 
        }
        	

        }
        //driver.close();
}
}
