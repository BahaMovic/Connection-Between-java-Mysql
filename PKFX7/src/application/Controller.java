package application;

import java.io.File;
import java.util.List;

import javax.swing.filechooser.FileFilter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class Controller {
	@FXML ListView list;
	public void Action1(ActionEvent event){
		FileChooser fc = new FileChooser();
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF File","*.pdf"));
		File file = fc.showOpenDialog(null);
		
		if(file != null){
			list.getItems().add(file.getAbsolutePath());
		}
	}
	public void Action2(){
		
			FileChooser fc = new FileChooser();
			
			List<File> file = fc.showOpenMultipleDialog(null);
			for(int x= 0 ; x<file.size() ; x++){
				list.getItems().add(file.get(x).getName());
			}
			
	}

}
