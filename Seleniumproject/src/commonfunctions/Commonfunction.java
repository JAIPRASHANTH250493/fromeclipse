package commonfunctions;

import java.io.FileInputStream;
 import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commonfunction {
 
	public static Properties pro=null;
	public static WebDriver driver=null;
	public Properties loadfile() throws IOException {
		
		FileInputStream stream=new FileInputStream("config.properties");
		
		
		 pro=new Properties();
		
		pro.load(stream);
		
		return pro;
	}
	
	
	@BeforeSuite
	public void launchbrowser() throws IOException {
		
		loadfile();
		String broswer=pro.getProperty("browser");
		 String url=pro.getProperty("url");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\Desktop\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	@AfterSuite
	public void closebrowser() {
		
	}
}
