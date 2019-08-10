package downloadfile;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		//set downloadfilepath.
		String downloadFilePath="C:\\Users\\alef1\\eclipse-workspace\\MyAccount\\src\\downloadfile\\DownloadFolder";
		//use HashMap method.
		HashMap<String, Object> chromePref = new  HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("download.default_directory", downloadFilePath);//passing filepath.
		ChromeOptions options = new ChromeOptions();//chromeoptions object.
		options.setExperimentalOption("prefs", chromePref);
		driver = new ChromeDriver(options);


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("Alef190187");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("Au190187");
		driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']")).click();
		//driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//textarea[@id=':r1']")).sendKeys("mdalef190187@gmail.com");
		driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='T- 2.jpg']")).click();
		driver.findElement(By.xpath("//div[@class='aLF-aPX-JX aLF-aPX-Mw-I-JX aLF-aPX-aYT-JX']")).click();
		//validate the downloaded file in the respective folder.
		File filelocation = new File("C:\\Users\\alef1\\eclipse-workspace\\MyAccount\\src\\downloadfile\\DownloadFolder");

		File [] totalfiles = filelocation.listFiles();//useing fileArray.
		//ctrl+shift after for
		for(File file:totalfiles) {
			String fl =file.getName();
			System.out.println(fl);
			if(file.getName().equals("T- 2.jpg")) {
				System.out.println("file is downloaded");
				break;
			}
		}

		// driver.get("http://ogt.success-ode-state-oh-us.info/PracticeTest/audio/english.htm");
		// driver.findElement(By.xpath("//*[@id=\"ctl00_body\"]/div/div[2]/div/div[1]/div[1]/a")).click();
		Thread.sleep(3000);

		driver.close();
	}

}
