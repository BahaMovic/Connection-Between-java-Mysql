
import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Minin {
	static WebDriver driver;
	static String key ;
	 	public static void main(String[] args)throws Exception{
		 File file = new File("C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
		 System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
		 WebDriver web = new FirefoxDriver();
		 Thread.sleep(1000);
		 web.get("https:\\www.facebook.com");
		
}
}