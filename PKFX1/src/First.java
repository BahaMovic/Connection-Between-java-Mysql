import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class First extends Application{
Button btn1,btn2;
TextField text;

public void start(Stage primaryStage) throws Exception{
	btn1= new Button("1");
	btn2 = new Button("2");
	text= new TextField();
	btn1.setOnAction(e -> text.setText("1"));
	btn2.setOnAction(e -> text.setText("2"));
	
	VBox vb = new VBox();
	vb.getChildren().addAll(btn1,btn2,text);
	Scene scene = new Scene(vb,200,200);
	primaryStage.setScene(scene);
	primaryStage.show();
}

	public static void main(String[] args){
		launch(args);
	}

}
