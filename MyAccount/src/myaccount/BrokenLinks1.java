package myaccount;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1 {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.bbc.com"); 
		driver.get("https://facebook.com");
		List<WebElement>linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of links ===>"+linkslist.size());



		for(int i=0; i<linkslist.size(); i++) {

			String url = linkslist.get(i).getAttribute("href");

			URL links = new URL(url);
			HttpURLConnection connection =(HttpURLConnection)links.openConnection();
			Thread.sleep(1000);
			connection.connect();
			int rescode = connection.getResponseCode();
			if(rescode>=400) {
				System.out.println(url+ "===" +" is broken link");
			}
			else {
				System.out.println(url+ "===" +" is valid link");
	    	  }
	      }

	}

}
