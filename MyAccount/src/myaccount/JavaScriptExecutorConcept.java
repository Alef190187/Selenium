package myaccount;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		/*TakesScreenshot ts=((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\alef1\\eclipse-workspace\\DataDrivenTest\\ScreenShoot\\fb.png"));*/
		
		
		
		WebElement loginBtn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		flash(loginBtn,driver);
		drawBorder(loginBtn,driver);
		
		//scrollPageDown(driver);
		
		WebElement singup=driver.findElement(By.xpath("//*[contains(@id,'u_0_u')]"));
		scrollIntoView(singup,driver);
		
		/*TakesScreenshot t=((TakesScreenshot)driver);
		File file = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\alef1\\eclipse-workspace\\DataDrivenTest\\ScreenShoot\\fb1.png"));*/
		
		//driver.quit();
		
		
	 
		
	}
		
		 public static void flash(WebElement element, WebDriver driver) {
		        JavascriptExecutor js = ((JavascriptExecutor) driver);
		        String bgcolor  = element.getCssValue("backgroundColor");
		        for (int i = 0; i <10; i++) {
		            changeColor("rgb(0,800,0)", element, driver);
		            changeColor(bgcolor, element, driver);
		        }
		    }
		    public static void changeColor(String color, WebElement element,  WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor)driver);
		        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

		        try {
		            Thread.sleep(20);
		        }  catch (InterruptedException e) {
		        	
		        }
		        }
		    public static void drawBorder(WebElement element, WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("arguments[0].style.border='3px solid red'", element);
		    }
		    
		    public static void scrollPageDown(WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		    }
		    
		    public static void scrollIntoView(WebElement element, WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("arguments[0].scrollIntoView(true);", element);
		    }
		    
		    
}


