package prog;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class MainClas  extends JFrame  {
	JCheckBox x , y;
	JLabel x1 , y1;
	public MainClas(){
		setSize(300,100);
		setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x = new JCheckBox("Check me 1");
		add(x);
		
		y = new JCheckBox("Check me 2");
		add(y);
		
		x1 = new JLabel("");
		add(x1);
		
		y1 = new JLabel("");
		add(y1);
		
		x.addItemListener(new event());
		y.addItemListener(new event());
	}
	private class event implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if(x.isSelected()&& y.isSelected()){
				x1.setText("1 is selected");
				y1.setText("2 is selected");
			}
			if(x.isSelected()){
				x1.setText("1 is selected");
				y1.setText("");
			}else if(y.isSelected()){
				x1.setText("");
				y1.setText("2 is selected");
			}else {
				x1.setText("");
				y1.setText("");
			}
			
		}
		
	}

	public static void main(String[] args) {
		new MainClas().setVisible(true);
		

}
	
}