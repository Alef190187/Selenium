package myaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementsControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("document.getElementById('email').value='alef_ru@yahoo.com'");//enter test in edit box
        js.executeScript("document.getElementById('pass').value='joy190187'");//enter text in edit box.
        js.executeScript("document.getElementById('u_0_2').click()");//click on login btn.
        Thread.sleep(4000);
        js.executeScript("window.history.back()"); //go back
        Thread.sleep(4000);
        js.executeScript("window.history.forward()");//go forward.
        String text = js.executeScript("return document.title").toString();//get title.
        System.out.println(text);
        String tx = js.executeScript("return document.getElementById('u_0_u').innerHTML").toString();//get text of a link.
        System.out.println(tx);
        js.executeScript("document.getElementById('u_0_c').scrollIntoView()");//scrolldown to view.
        //js.executeScript("window.scrollBy(0,300)");// scrolldown page by pixel.
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //scrolldown page up to buttom.
        
        //js.executeScript("history.go(0)");//refresh the page.

       
        //System.out.println("Click on loginbtn");
        
        //driver.findElement(By.cssSelector("#u_0_c")).sendKeys("Alif");
        
        
	}

}
