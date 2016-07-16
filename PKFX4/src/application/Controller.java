package application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class Controller {
	@FXML Label myLab;
	@FXML TextField user;
	@FXML TextField pass;
	
 public void control(ActionEvent event)throws Exception{
	 if(user.getText().equals("user") && pass.getText().equals("pass")){
		 Stage stage = new Stage();
		 Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		 Scene scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
		 
	 }else{
		 myLab.setText("Faild");
	 }

}
}
