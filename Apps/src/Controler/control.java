package Controler;

import Model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.*;

public class control {
	@FXML TextField name;
	@FXML TextField age;
	@FXML RadioButton male;
	@FXML RadioButton female;
	@FXML ImageView image1;
	@FXML ImageView errorage;
	
public void onSave(){
	String name = this.name.getText();
	
	
	String age = this.age.getText();
	if(age.length()>3){
		this.errorage.setVisible(true);
	}else{
		this.errorage.setVisible(false);
	}
	Person person = new Person();
	
	if(male.isSelected()){
		System.out.println("You Select Male");
	}else
		System.out.println("You Selece Female");
	person.setName(name);
	person.setAge(age);
	person.print();
	
}
public void mouseOn(){
	image1.setVisible(true);
}
public void mouseOut(){
	image1.setVisible(false);
}
}
