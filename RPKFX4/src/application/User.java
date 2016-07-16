package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class User {
	 SimpleIntegerProperty id;
	 SimpleStringProperty name;
	 SimpleStringProperty department;
	 SimpleStringProperty surname;
	 SimpleIntegerProperty age;
	
	public User(int id , String name , String department, String surname , int age){
		this.id.set(id);
		this.name.set(name);
		this.department.set(department);
		this.surname.set(surname);
		this.age.set(age);
	}

}
