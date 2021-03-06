package application;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable{
	@FXML ComboBox<String> Combo;
	@FXML Label myLab;
	@FXML ListView<String> liastView;
	
	ObservableList<String> list = FXCollections.observableArrayList("Bahaa","Alaa","Diaa","Doha","Mohamed","Mona");
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Combo.setItems(list);
		liastView.setItems(list);
		liastView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
	}
	public void Star(ActionEvent event){
		myLab.setText(Combo.getValue());
		ObservableList<String> name;
		name = liastView.getSelectionModel().getSelectedItems();
		for(String names : name){
			System.out.println(names);
		}
		
	}

}
