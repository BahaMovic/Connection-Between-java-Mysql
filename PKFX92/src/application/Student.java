package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student {
	private final SimpleIntegerProperty ID;
	private final SimpleStringProperty name;
	private final SimpleStringProperty surname;
	private final SimpleIntegerProperty age;
	public  Student(int id, String name, String surname,int age){
		this.ID = new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.surname = new SimpleStringProperty(surname);
		this.age = new SimpleIntegerProperty(age);
		
	}
	public int getID(){
		return ID.get();
	}
	public String getName(){
		return name.get();
	}
	public String getSurName(){
		return surname.get();
	}
	public int getAge(){
		return age.get();
	}
}
