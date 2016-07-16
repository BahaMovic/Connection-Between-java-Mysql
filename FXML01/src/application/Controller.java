package application;
import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
	Connection con = null;
	Statement st =null;
	@FXML TextArea text;
public void action(ActionEvent e){
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/via","BahaMovic","123123");
		st = con.createStatement();
		String name = text.getText();
		
		String query = "insert into department (name) values('"+name+"')";
		st.executeUpdate(query);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
