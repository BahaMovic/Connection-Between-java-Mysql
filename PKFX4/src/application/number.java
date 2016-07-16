package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class number {

	String number1 = "";
	String number2 = "";
	String operator ="";
	@FXML TextField text;
	public void processNumber(ActionEvent event){
		String num = String.valueOf(((Button)event.getSource()).getText());
		if(!num.equals("=")){
			number1 += num;
		}
		text.setText(number1);
	}
	public void ProcessOperator(ActionEvent event){
		
		operator = String.valueOf(((Button)event.getSource()).getText());
		text.setText("");
		number2 = number1;
		number1 ="";
	}
	public void Cal(ActionEvent event){
		switch (operator){
		case "*":
			text.setText("*");
			break;
		case "-":
			text.setText("-");
			break;
		case "/":
			text.setText("/");
			break;



		}
	}
}
