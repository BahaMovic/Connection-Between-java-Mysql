import java.awt.FlowLayout;

import javax.swing.*;

public class maingraphic{
public static void main(String[] args){
	JFrame f = new JFrame("Graphics");
	f.setSize(600, 400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	graphs p = new graphs();
	f.add(p);
	f.setVisible(true);
}
}
