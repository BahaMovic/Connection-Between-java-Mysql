package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Studnet {
	private SimpleStringProperty name;
	private SimpleIntegerProperty id;
	private SimpleStringProperty surName;
	private SimpleIntegerProperty age;
	public Studnet(int ID , String Name,String Surname,int Age){
		name = new SimpleStringProperty(Name);
		id = new SimpleIntegerProperty(ID);
		surName = new SimpleStringProperty(Surname);
		age = new SimpleIntegerProperty(Age);
	}
	public String getName(){
		return name.get();
	}
	public Integer getID(){
		return id.get();
	}
	public String getSurName(){
		return surName.get();
	}
	public Integer getAge(){
		return age.get();
	}

}
