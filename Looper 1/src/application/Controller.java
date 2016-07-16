package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Controller implements Initializable{

    @FXML
    private JFXHamburger button;

    @FXML
    private JFXDrawer drawer;
    private VBox box ;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			box = FXMLLoader.load(getClass().getResource("MenuBar.fxml"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		drawer.setSidePane(box);
		HamburgerBackArrowBasicTransition Hamburger = new HamburgerBackArrowBasicTransition(button);
		Hamburger.setRate(-1);
		button.addEventHandler(MouseEvent.MOUSE_PRESSED, (e)->{
			Hamburger.setRate(Hamburger.getRate()*-1);
			Hamburger.play();
			if(drawer.isShown()){
				drawer.close();
			}else{
				drawer.open();
			}
		});
		
	}

}