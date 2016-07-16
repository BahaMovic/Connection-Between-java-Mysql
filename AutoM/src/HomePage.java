import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Abstract{
	public HomePage(WebDriver driver) {
		super(driver);
	
	}

	public ContactPage clickOnContact(){
		driver.findElement(By.linkText("Create New Account")).click();
		return new ContactPage(driver);
	}

}
