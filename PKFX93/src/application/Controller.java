package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable{
	@FXML TableView<Studnet> table;
	@FXML TableColumn<Studnet,Integer> id;
	@FXML TableColumn<Studnet,String> name;
	@FXML TableColumn<Studnet,String> surname;
	@FXML TableColumn<Studnet,Integer> age;
	@FXML DatePicker datep;
	@FXML Label date;
	ObservableList<Studnet> list = FXCollections.observableArrayList(
			new Studnet(1,"Bahaa","BahaMovic",22),
			new Studnet(2,"Diaa","Doda",28),
			new Studnet(3,"Alaa","Iniesta",17)
			);
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		id.setCellValueFactory(new PropertyValueFactory<Studnet,Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Studnet,String>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<Studnet,String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<Studnet,Integer>("age"));
		table.setItems(list);
		
	}
	public void click(ActionEvent event){
		date.setText(String.valueOf(datep.getValue()));
	}

}
