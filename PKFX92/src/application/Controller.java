package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable{
	@FXML TableView<Student> table;
	@FXML TableColumn<Student,Integer> id;
	@FXML TableColumn<Student,String> name;
	@FXML TableColumn<Student,String> surname;
	@FXML TableColumn<Student,Integer> age;
	ObservableList<Student> list = FXCollections.observableArrayList(
			new Student (1,"Bahaa","BahaMovic",22),
			new Student (2,"Alaa","Iniesta",18),
			new Student (3,"Doha","Hanoma",26)
			);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		this.id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<Student,String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<Student,Integer>("age"));
		table.setItems(list);
		
	}

}
