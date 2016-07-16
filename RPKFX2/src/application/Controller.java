package application;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class Controller implements Initializable{
	@FXML Label lab;
	@FXML Label date;
	@FXML DatePicker dated;
	String op = "";
	Boolean start = true;
	float number1 = 0;
	Model model = new Model();

	public void NumberProcess(ActionEvent event){
		if(start){
			start = false;
			lab.setText("");
		}
		String value =((Button)event.getSource()).getText();
		lab.setText(lab.getText()+value);
		
	}
	public void OperatorProcess(ActionEvent event){
		String value =((Button)event.getSource()).getText();
		if(!value.equals("=")){
			op= value;
			number1 = Float.parseFloat(lab.getText());
			lab.setText("");
		}else{
			float number2 = Float.parseFloat(lab.getText());
			float res = model.process(number1, number2, op);
			lab.setText(String.valueOf(res));
		}
	}
	
	@FXML ComboBox<String> combo;
	@FXML ListView<String> listView;
	ObservableList<String> list = FXCollections.observableArrayList("Bahaa1","Bahaa2","Bahaa3");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		combo.setItems(list);
		listView.setItems(list);
		
	}

	public void click(ActionEvent event){
		System.out.println(combo.getValue());
		System.out.println("Hello");
		combo.getItems().addAll("Bahaa4","Bahaa5","Bahaa6");
		
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		ObservableList<String> names = listView.getSelectionModel().getSelectedItems();
		for(String name : names){
			System.out.println(name);
		}
		LocalDate d = dated.getValue();
		date.setText(d.toString());
	}
}
