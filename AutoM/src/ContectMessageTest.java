import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContectMessageTest {
	private WebDriver driver;
	@Before
	public void checkSetup(){
		driver = new FirefoxDriver();
	}
	@After
	public void checkClose(){
		driver.close();
	}
	@Test
	public void Operation(){
		HomePage homepage = new HomePage(driver);
		homepage.
		ContactPage contactpage = homepage.clickOnContact();
		
		ContactResultPage contactResultPage = contactpage.FillTextDate().SubmitForm();
		
	}

}
