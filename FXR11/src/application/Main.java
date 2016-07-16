package application;
	
import java.awt.Color;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.SVGPath;


public class Main extends Application {
	int count =0;
	@Override
	
	public void start(Stage primaryStage) {
		try {
			
			
			GridPane gridpane = new GridPane();
			Label lab1 = new Label("Name : ");
			TextField text1 = new TextField();
			Button btn = new Button("ADD");
			Label lab3 = new Label();
			TextField text2 = new TextField();
			Label lab2 = new Label("ID :");
			
			btn.setOnAction(e ->{
				count ++;
				lab3.setText(String.valueOf(count));
			}
			);
			
			gridpane.setPadding(new Insets(20));
			gridpane.setMargin(text1, new Insets(10));
			gridpane.setMargin(text2, new Insets(10));
			gridpane.setMargin(lab1, new Insets(10));
			gridpane.setMargin(lab2, new Insets(10));
			GridPane.setHalignment(btn, HPos.RIGHT);
			gridpane.add(btn, 50, 0);
			
			GridPane.setHalignment(lab3, HPos.RIGHT);
			gridpane.add(lab3, 100, 0);
			GridPane.setHalignment(lab1, HPos.LEFT);
			gridpane.add(lab1, 0, 0);
			
			GridPane.setHalignment(text1, HPos.CENTER);
			gridpane.add(text1,30, 0);
			
			GridPane.setHalignment(lab2, HPos.RIGHT);
			gridpane.add(lab2, 0, 30);
			
			GridPane.setHalignment(text2, HPos.CENTER);
			StringProperty sy ;
			sy = new SimpleStringProperty("Hello");
			
			if(sy.isNotNull() != null){
			lab2.setText(sy.get());
			}
			gridpane.add(text2, 30, 30);
			
			BorderPane root = new BorderPane();
			
			FlowPane header = new FlowPane();
			String BIcon ="-fx-background-color:lightblue;"+
							"-fx-background-redius:0%";
			header.setStyle(BIcon);
			header.setPrefHeight(50);
			SVGPath icon = new SVGPath();
			icon.setContent("M2.379,14.729 5.208,11.899 12.958,19.648 25.877,6.733 28.707,9.56112.958,25.308z");
			header.getChildren().add(icon);
			root.setTop(header);
			root.setCenter(gridpane);
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
