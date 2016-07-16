import javax.swing.*;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class click extends JFrame{
	JLabel lab1 , lab2 ,lab3 ;
	JButton start, click;
	JTextField tx;
	JMenuBar m ;
	JMenu m1;
	JMenuItem m3 , m4;
	
	int x , count = 0; 
	Timer time;
	public click(){
		setSize(400,200);
		setLayout(new GridLayout(3,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Clicks Game");
	
		
		m = new JMenuBar();
		m1 = new JMenu("File");
		m3 = new JMenuItem("rest");
		m4 = new JMenuItem("Exit");
		m.add(m1);
		
		m1.add(m3);
		m1.add(m4);
		
		m3.addActionListener(new event());
		m4.addActionListener(new event());
		
		setJMenuBar(m);
		
		
		lab1 = new JLabel("Enter Integer Number Here");
		add(lab1);
		
		tx = new JTextField(5);
		add(tx);
		
		start = new JButton("Start");
		add(start);
		
		click = new JButton("Click");
		add(click);
		
		lab2 = new JLabel("Time Left");
		add(lab2);
		
		lab3 = new JLabel("");
		add(lab3);
		
		start.addActionListener(new event());
		click.addActionListener(new event());
		click.setEnabled(false);
		
	}private class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(start)){
				x = Integer.parseInt(tx.getText());
				task t = new task(x);
				time = new Timer(1000,t);
				time.start();
			}else if(e.getSource().equals(click)){
				count++;
				lab3.setText(count +"Clicks");
			}else if(e.getSource().equals(m3)){
				lab2.setText("Time Left");
				lab3.setText("");
				tx.setText("");
			}else if (e.getSource().equals(m4)){
				System.exit(0);
			}
			
		}
		
	}
	private class task implements ActionListener{
		int X;
		public task(int y){
			X = y;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			X--;
			if(X>=1){
				start.setEnabled(false);
				click.setEnabled(true);
				lab2.setText("Time Left : "+ X);
				
			}else{
				start.setEnabled(true);
				click.setEnabled(false);
				time.stop();
				count = 0;
			}
			
		}
		
	}
	public static void main(String[] args){
		click x= new click();
		x.setVisible(true);
	}

}
