package Controllers;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Options {
	private WebDriver driver = null ;
	
	private ObservableList<groupLink> grouplist;
	public Options(String email , String password){
		 File file = new File("C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
		 System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
		
		 driver  = new EdgeDriver();
		 waiting(1);
		 driver.get("https:\\www.facebook.com");
		 waiting(2);
		
		 driver.findElement(By.id("email")).sendKeys(email);
		 driver.findElement(By.name("pass")).sendKeys(password);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.id("u_0_m")).click();
		 waiting(20);
	}
	
	public ObservableList<groupLink> getGroupList(){
		waiting(5);
		driver.get("https://www.facebook.com/groups/?category=membership&ref=bookmark_header");
		waiting(5);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		 this.grouplist = FXCollections.observableArrayList();
		String found = "groups";
		String NotFound = "category";
		String NotFound1 = "unread";
		for(WebElement li : list){
			if(li.getAttribute("href").toLowerCase().contains(found.toLowerCase())&& !(li.getAttribute("href").toLowerCase().contains(NotFound.toLowerCase()))&&!(li.getText().toLowerCase().contains(NotFound1.toLowerCase()))){
				grouplist.add(new groupLink(li.getText(),li.getAttribute("href")));
				System.out.println(li.getText());
			}
			
		}
		
		return grouplist;
	}
	
	public ObservableList<friendLink> getFriendList(){
		waiting(3);
		driver.get("https://www.facebook.com/profile.php?sk=friends&source_ref=pb_friends_tl");
		waiting(4);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		ObservableList<friendLink> friendlist = FXCollections.observableArrayList();
		String found = "friends_tab";
		String found1 = "img";
		int x = 2;
		for(WebElement li : list){
			if(li.getAttribute("href").toLowerCase().contains(found.toLowerCase())){
				if(x%2==1){
				friendlist.add(new friendLink(li.getText(),li.getAttribute("href")));
				System.out.println(li.getText());
				}
				x++;
			}
			
		}
		return friendlist;
	}
	public void waiting(int seconds){
		int i = seconds * 1000;
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void GroupPoster(String post){
		for(int  i= 0 ;i<grouplist.size() ; i++){
			driver.get(grouplist.get(i).getUrl());
			driver.findElement(By.tagName("textarea")).sendKeys(post);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 driver.findElement(By.cssSelector("._36bx ._2dck ._1mf7")).click();
			 waiting(10);
		}
		
	}
}