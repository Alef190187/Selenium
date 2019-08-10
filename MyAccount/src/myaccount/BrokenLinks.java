package myaccount;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		
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
	      System.out.println("size of full links and images---->" +linkslist.size());
	      
	      List<WebElement>activelinks = new ArrayList<WebElement>();

	      for(int i=0; i<linkslist.size(); i++) {
	    	  System.out.println(linkslist.get(i).getAttribute("href"));
	    	  if(linkslist.get(i).getAttribute("href") != null ) {
	    		  activelinks.add(linkslist.get(i));
	    	  }
	      }
	      
	      System.out.println("size of the active links and images===>"+activelinks.size());
	      /*System.out.println(linkslist.size());
	      for(int i=0; i<linkslist.size(); i++) {
	    	  String link = linkslist.get(i).getText();
	    	  System.out.println(link);
	    	  }*/
	       
	     for(int j=0; j<activelinks.size(); j++) {
	    	 //HttpURLConnection.setFollowRedirects(false);
	    	 HttpURLConnection connection = (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
	         connection.connect();
	        
	         String response = connection.getResponseMessage();
	          connection.disconnect();
	          System.out.println(activelinks.get(j).getAttribute("href") +"====>"+response);
	          
	}
	     
	     
	     
	     driver.quit();

	}
}
