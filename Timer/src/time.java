import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class time extends JFrame{
	Timer tim ;
	JButton start, stop,con;
	JLabel lab;
	JTextField tx;
	int x;
	public time(){
		setSize(400,200);
		setLayout(new GridLayout(2,3,5,5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		start = new JButton("Start");
		add(start);
		 
		stop = new JButton("Stop");
		add(stop);
		
		con = new JButton("Continue");
		add(con);
		
		tx = new JTextField(5);
		add(tx);
		lab = new JLabel("Witting");
		add(lab);
	
		con.addActionListener(new event());
		start.addActionListener(new event());
		stop.addActionListener(new event());
		
	}private class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(start)){
				x = Integer.parseInt(tx.getText());
				Timerclas ii = new Timerclas(x);
				tim = new Timer(1000,ii);
				tim.start();
			}
		}
		
	}private class Timerclas implements ActionListener{
		int x;
		public Timerclas(int i){
			x=i;
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			x--;
			if(x>=1){
				lab.setText("Time Left : "+x);
				
			}else{
				lab.setText("Done....   !");
				tim.stop();
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
	
		
	
	public static void main(String[] args){
		time x = new time();
		x.setVisible(true);
	}

}
