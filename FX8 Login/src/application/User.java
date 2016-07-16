package application;
import javafx.beans.property.*;
public class User {
private static final String password_pro = "password";
private static final String user_Pro ="username";
public static ReadOnlyStringWrapper user;
private StringProperty password;
public User(){
	user = new ReadOnlyStringWrapper(this,user_Pro,System.getProperty("username"));
	password = new SimpleStringProperty(this,password_pro,System.getProperty("username"));
}
public final String getName(){
	return user_Pro;
}
public ReadOnlyStringProperty getNameProperty(){
	return user.getReadOnlyProperty();
}

public String getPassword(){
	return password_pro;
}
public StringProperty getPasswordProperty(){
	return password;
}
}
