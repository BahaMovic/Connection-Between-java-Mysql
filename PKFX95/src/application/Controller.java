package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;

public class Controller {
	@FXML LineChart<String,Integer> line;
	public void Action(ActionEvent event){
		line.getData().clear();
		XYChart.Series<String, Integer> serias = new XYChart.Series<String,Integer>();
		serias.getData().add(new Data<String,Integer>("Bahaa",12));
		serias.getData().add(new Data<String,Integer>("Alaa",100));
		serias.getData().add(new Data<String,Integer>("Diaa",22));
		serias.getData().add(new Data<String,Integer>("Doha",122));
		XYChart.Series<String, Integer> serias1 = new XYChart.Series<String,Integer>();
		serias1.getData().add(new Data<String,Integer>("Bahaa",121));
		serias1.getData().add(new Data<String,Integer>("Alaa",233));
		serias1.getData().add(new Data<String,Integer>("Diaa",131));
		serias1.getData().add(new Data<String,Integer>("Doha",121));
		
		line.getData().addAll(serias,serias1);
		
	}

}
