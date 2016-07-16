package application;
import java.sql.*;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	Connection con = null;
	ResultSet rs = null;
	Statement st = null;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			Menu menu = new Menu("File");
			menu.getItems().add(new MenuItem("New"));
			menu.getItems().add(new MenuItem("Save"));
			menu.getItems().add(new MenuItem("Exit"));
			
			MenuBar menubar = new MenuBar();
			menubar.getMenus().add(menu);
			
			
			root.setTop(menubar);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
