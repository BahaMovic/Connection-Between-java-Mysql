import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{
	Button btn;
	Stage window ;
	Scene scene1,scene2;
	TableView<product> table;
	public static void main(String[] args){
		launch(args);
	}
	TextField nametxt , pricetxt,counttxt;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		TableColumn<product,String> name = new TableColumn<>("Name");
		name.setMinWidth(200);
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn<product,Double> price = new TableColumn<>("Price");
		price.setMinWidth(100);
		price.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		TableColumn<product,Integer> count = new TableColumn<>("Count");
		count.setMinWidth(100);
		count.setCellValueFactory(new PropertyValueFactory<>("count"));
		nametxt = new TextField();
		nametxt.setPromptText("Name");
		
		pricetxt = new TextField();
		pricetxt.setPromptText("Price");
		
		counttxt = new TextField();
		counttxt.setPromptText("Count");
		
		Button btn = new Button("Add");
		btn.setOnAction(e-> AddItem());
		table = new TableView<>();
		table.setItems(getProducts());
		table.getColumns().addAll(name,price,count);
		

		HBox root1 = new HBox();
		root1.setPadding(new Insets(10,10,10,10));
		root1.getChildren().addAll(nametxt,pricetxt,counttxt,btn);
		
		VBox root = new VBox();
		root.getChildren().addAll(table,root1);
		Scene scene = new Scene(root,500,300);
		window.setScene(scene);
		window.show();
	}
	public void AddItem(){
		String name = nametxt.getText();
		Double price= Double.parseDouble(pricetxt.getText());
		int count = Integer.parseInt(counttxt.getText());
		product n = new product(name,price,count);
		table.getItems().add(n);
	}


	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()==btn){
			System.out.println("OOOoooooooo I Love it when you touch me there");
		}
		
	}
	public ObservableList<product> getProducts(){
		ObservableList<product> products = FXCollections.observableArrayList();
		products.addAll(new product("Pepsi",2.5,32),
						new product("Book",1.5,23),
						new product("Note",3.0,12));
		return products;
	}
	public void DeleteItem(){
		ObservableList<product> products , Removed;
		products = table.getItems();
		Removed = table.getSelectionModel().getSelectedItems();
		
		Removed.forEach(products::remove);
	}

}
