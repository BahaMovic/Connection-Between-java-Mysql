package application;
import javafx.beans.property.*;
public class User {
	private final static String user_name = "Bahaa";
	private ReadOnlyStringWrapper User_Name_Prop ;
	private static String Pass = "pass";
	private StringProperty UserPass;
	
	public User(){
		User_Name_Prop = new ReadOnlyStringWrapper(this,user_name,System.getProperty("username"));
		UserPass = new SimpleStringProperty(this,Pass,"");
	}
	
	public String getName(){
		return User_Name_Prop.get();
	}
	public ReadOnlyStringWrapper getNameProperty(){
		return User_Name_Prop;
	}
	public String getPass(){
		return UserPass.get();
	}
	public StringProperty getPassProperty(){
		return UserPass;
	}
	public void setPassword(String Pass){
		UserPass.set(Pass);
	}
}
