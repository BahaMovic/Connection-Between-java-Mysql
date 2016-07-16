package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
	@FXML  Label myLab ;
	int rand;
	public void control(ActionEvent event){
	Random ran = new Random();
	rand = ran.nextInt(50)+10;
	myLab.setText(String.valueOf(rand));
		
	}

}
