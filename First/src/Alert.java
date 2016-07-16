import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Alert {
	Stage windows;
	public void display(String a , String b){
		windows = new Stage();
		windows.initModality(Modality.APPLICATION_MODAL);
		Label lab = new Label(a+" "+b);
		StackPane root = new StackPane();
		root.getChildren().add(lab);
		Scene scene = new Scene(root,200,200);
		windows.setScene(scene);
		windows.show();
	}

}
