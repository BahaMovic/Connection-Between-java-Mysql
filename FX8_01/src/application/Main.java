package application;
	
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Main extends Application {
	private final static String Password = "Admin";
	private final static BooleanProperty Granted_Access = new SimpleBooleanProperty(false);
	private final static int Max_Attempt = 3;
	private final IntegerProperty Attempt = new SimpleIntegerProperty(0);
	@Override
	
	public void start(Stage primaryStage) {
		try {
			User user = new User();
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			Color color = Color.rgb(0, 0, 0,0.55);
			Rectangle background = new Rectangle(400,400);
			background.setX(0);
			background.setY(0);
			background.setArcHeight(15);
			background.setArcWidth(15);
			background.setFill(Color.rgb(255, 0, 0,0.55));
			background.setStroke(color);
			background.setStrokeWidth(5);
			
			Text username = new Text();
			username.setFill(Color.BLACK);
			username.setSmooth(true);
			username.textProperty().bind(user.getNameProperty());
			
			
			Group root = new Group();
			root.getChildren().addAll(background,username);
			
			Scene scene = new Scene(root,400,400,Color.rgb(0, 0, 0,.3));
			
		
		
			
			primaryStage.setScene(scene);
		
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
