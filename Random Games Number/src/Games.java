
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Games extends JFrame{
	static int x , y;
	static JButton btn1, btn2;
	static JLabel lab1 , lab2, lab3;
	static JTextField tx;
	public Games(){
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		lab1 = new JLabel("Enter your number from 1 -5");
		add(lab1);
		
		tx = new JTextField(5);
		add(tx);
		
		btn1 = new JButton("ok");
		add(btn1);
		btn2 = new JButton("Cancel");
		add(btn2);
		
		lab2 = new JLabel("");
		add(lab2);
		
		lab3 = new JLabel("");
		add(lab3);
		
		
		btn1.addActionListener(new event());
		btn2.addActionListener(new event());
		
	}
	private class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(btn1)){
				try{
					lab3.setText("");
					x = (int)(Math.random()*5 +1);
				y = Integer.parseInt(tx.getText());
				tx.setText("");
				if(x == y){
					lab2.setText("You are Winner");
				}else if (x != y){
					lab2.setText("you Lose The Number is "+x);
				}}catch(Exception r){
					lab2.setText("");
				erorr x = new erorr(Games.this);
				x.setVisible(true);
			}
			}else if(e.getSource().equals(btn2)){
				lab2.setText("");
				erorr x = new erorr(Games.this);
				x.setVisible(true);
				x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
			
		}
		
	}
	public static void main(String[] args){
		Games x = new Games();
		x.setVisible(true);
		
	}

}