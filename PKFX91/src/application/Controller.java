package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
@FXML CheckBox cb1;
@FXML CheckBox cb2;
@FXML CheckBox cb3;
@FXML CheckBox cb4;
@FXML Label list;
@FXML Label mcount;
@FXML Label lab;
@FXML RadioButton rad1;
@FXML RadioButton rad2;
	public void Close(ActionEvent event){
		Platform.exit();
		System.exit(0);
		
	}
	public void Action(ActionEvent event){
		String message = "";
		int count = 0;
		if(cb1.isSelected()){
			message += cb1.getText()+"\n";
			count++;
		}if(cb2.isSelected()){
			message += cb2.getText()+"\n";
			count++;
		}if(cb3.isSelected()){
			message += cb3.getText()+"\n";
			count++;
		}if(cb4.isSelected()){
			message += cb4.getText()+"\n";
			count++;
		}
		list.setText(message);
		mcount.setText("Count List "+count);
	}
	public void Action1(ActionEvent event){
		
	if(rad1.isSelected()){
		lab.setText(rad1.getText());
	}else if(rad2.isSelected()){
		lab.setText(rad2.getText());
	}
}
}
