package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.fxml.Initializable;
public class Controller implements Initializable{
	myNumber myNum = new myNumber();
	@FXML Label myLab ;
	@FXML ProgressBar pb ;
	@FXML ProgressIndicator pi;
	@Override
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		myNum.setNumber(0);
		myNum.getDouble().addListener(new ChangeListener<Object>(){

			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				myLab.setText(String.valueOf(myNum.getNumber()));
				pb.progressProperty().bind(myNum.getDouble());
				pi.progressProperty().bind(myNum.getDouble());
				
			}
			
		});
		
	}
	public void Action(ActionEvent event){
		myNum.setNumber(myNum.getNumber() +0.1);
	}
	public void Action2(ActionEvent event){
		myNum.setNumber(myNum.getNumber() -0.1);
	}
	

}
