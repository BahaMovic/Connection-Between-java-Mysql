import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class ApplicationClass {
	WebDriver driver;
@Before
public void Start(){
	driver = new FirefoxDriver();
	driver.navigate().to("https://www.youtube.com/");
}
@After
public void End(){
	
}

@Test
public void Operation1(){
	
	driver.findElement(By.name("search_query")).sendKeys("Marilyn Manson");
	driver.findElement(By.id("search-btn")).click();
	
	
}

}
