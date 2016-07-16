package Controllers;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.event.EventHandler;

public class Controller_Main implements Initializable{
	@FXML TextField emailText;
	@FXML PasswordField passwordText;
	@FXML TableView<groupLink> GroupList;
	@FXML TableColumn<groupLink,String> GroupName;
	@FXML TableColumn<groupLink,String> GroupUrl;
	@FXML TableView<friendLink> FriendList;
	@FXML TableColumn<friendLink,String> FriendName;
	@FXML TableColumn<friendLink,String> FriendUrl;
	@FXML TextArea Status;
	@FXML Button groupPosterbtn;
	Options option;

	public void Open(ActionEvent e){
		System.out.println(emailText.getText());

		 this.option = new Options(emailText.getText(),passwordText.getText());
		System.out.println(emailText.getText());
		
		GroupName.setCellValueFactory(new PropertyValueFactory<>("name"));
		GroupUrl.setCellValueFactory(new PropertyValueFactory<>("url"));
		GroupList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		GroupList.setItems(option.getGroupList());
		FriendName.setCellValueFactory(new PropertyValueFactory<>("name"));
		FriendUrl.setCellValueFactory(new PropertyValueFactory<>("url"));
		FriendList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		FriendList.setItems(option.getFriendList());
		System.out.println("Done !");
	}


	public void groupPoster(ActionEvent e){
		option.GroupPoster(Status.getText());
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		Status.textProperty().addListener(new ChangeListener<String>(){
			
			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				groupPosterbtn.setDisable(false);

				System.out.println("Done !");
				
			}
			
		});
		
	}


}
