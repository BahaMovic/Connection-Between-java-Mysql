import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
	public static void waiting(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args){
	 File file = new File("C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
	 System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
	
	 WebDriver driver  = new EdgeDriver();
	 try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 driver.get("https://www.facebook.com/groups/236948463046888/");
	 driver.findElement(By.tagName("textarea")).sendKeys("https://www.youtube.com/watch?v=a8kQegI1jkg");
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 driver.findElement(By.cssSelector("._36bx ._2dck ._1mf7")).click();
}
}
