import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class erorr extends JDialog{
JButton btn;
JLabel lab;
public erorr(JFrame frame){
	super(frame , "Help",true);
	setSize(100,100);
	setLayout(new FlowLayout());
	
	lab = new JLabel("please Enter Integer Number");
	add(lab);
	btn = new JButton("Close");
	add(btn);
	
	btn.addActionListener(new event());
}
private class event implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
		
	}
	
}
}
