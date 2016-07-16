import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends Abstract{
	public ContactPage(WebDriver driver) {
		super(driver);
	}
		
	public ContactPage FillTextDate(){
		
		driver.findElement(By.name("firstname")).sendKeys("Bahaa Eldin");
		driver.findElement(By.name("lastname")).sendKeys("Mohamed");
		driver.findElement(By.name("reg_email__")).sendKeys("01151251565");
		driver.findElement(By.name("sex")).sendKeys("2");
		driver.findElement(By.name("reg_passwd__")).sendKeys("bhaa5248289");
		return new ContactPage(driver);
	}
	public ContactResultPage SubmitForm(){
		driver.findElement(By.name("signup_button")).click();
	
		return new ContactResultPage(driver);
	}

}
