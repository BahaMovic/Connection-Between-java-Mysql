package application;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
public class Controller implements Initializable{
	@FXML TextField text;
	@FXML Slider slider;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		text.setText(String.valueOf(slider.getValue()));
		text.textProperty().bindBidirectional(slider.valueProperty(),NumberFormat.getNumberInstance());
		
	}

}
