import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Readdata_fromFile {
    static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\alef1\\eclipse-workspace\\MyAccount\\src\\Confiq.properties");
        prop.load(fis);
        
       String name = prop.getProperty("name");
       System.out.println(name);
       String url=prop.getProperty("URL");
       System.out.println(url);
       String browseName= prop.getProperty("browser");
       System.out.println(browseName);
       
       if(browseName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
       }
       else if(browseName.equals("FF")) {
    	  
    	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\geckodriver.exe");
           driver= new FirefoxDriver();
       }
       else if(browseName.equals("IE")) {
    	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\internetexplorerdriver.exe");
           driver= new InternetExplorerDriver();   
       }
        driver.get(url);
        
        driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
        driver.findElement(By.xpath(prop.getProperty("lastname_xptah"))).sendKeys(prop.getProperty("lastname"));
        driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
        Select select = new Select(driver.findElement(By.xpath(prop.getProperty("month_xpath"))));
        select.selectByVisibleText(prop.getProperty("month"));
        Select select1 = new Select(driver.findElement(By.xpath(prop.getProperty("day_xpath"))));
        select1.selectByVisibleText(prop.getProperty("day"));
        Select select2 = new Select(driver.findElement(By.xpath(prop.getProperty("year_xpath"))));
        select2.selectByVisibleText(prop.getProperty("year"));
        driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
        driver.close();
        
       
	}

}
