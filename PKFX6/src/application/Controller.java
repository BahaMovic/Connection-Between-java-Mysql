package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
public class Controller implements Initializable{
	@FXML TreeView<String> tree;
	Image icon = new Image(getClass().getResourceAsStream("/application/12145485_924922807587950_612838662_n.jpg"));
	@Override
	
	public void initialize(URL location, ResourceBundle resources) {
		
		TreeItem<String> root = new TreeItem<>("Root");
		root.setExpanded(true);
		TreeItem<String> Node1 = new TreeItem<>("Node1");
		TreeItem<String> Node2 = new TreeItem<>("Node2");
		TreeItem<String> Node3 = new TreeItem<>("Node3");
		root.getChildren().add(Node1);
		root.getChildren().add(Node2);
		root.getChildren().add(Node3);
		TreeItem<String> Node12 = new TreeItem<>("Node11");
		TreeItem<String> Node13 = new TreeItem<>("Node12");
		Node2.getChildren().addAll(Node12,Node13);
		
		tree.setRoot(root);
		
	}

	public void mouseClick(MouseEvent mouseEvent){
		if(mouseEvent.getClickCount()==2){
			TreeItem<String> item = tree.getSelectionModel().getSelectedItem();
			String value = item.getValue();
			System.out.println(value);
		}
	}
}
