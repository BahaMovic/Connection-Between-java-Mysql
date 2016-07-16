import org.openqa.selenium.WebDriver;

public class Abstract {
protected WebDriver driver;
public Abstract(WebDriver driver){
	this.driver = driver;
}

public WebDriver getWebDriver(){
	return driver;
}
public HomePage getHomePage(){
	driver.navigate().to("https://m.facebook.com/");
	return new HomePage(driver);
}
}
