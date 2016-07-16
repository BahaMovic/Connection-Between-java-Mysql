import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class game extends JFrame{
	JLabel lb1 , lb2 , lb3 , lb4 , Erorr;
	JTextField tx1 , tx2, tx3 , tx4;
	JButton btn;
	int times , delay, width , high ;
	
	
	public game(){
		setSize(400,200);
		setLayout(new FlowLayout(FlowLayout.LEADING));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lb1 = new JLabel("Enter your Moving number ");
		add(lb1);
		
		tx1 = new JTextField(5);
		add(tx1);
		
		lb2 = new JLabel("Enter your Delay Time");
		add(lb2);
		
		tx2 = new JTextField(5);
		add(tx2);
		
		lb3 = new JLabel("Enter your Width");
		add(lb3);
		
		tx3 = new JTextField(5);
		add(tx3);
		
		lb4 = new JLabel("Enter your high");
		add(lb4);
		
		
		tx4  = new JTextField(5);
		add(tx4);
		
		btn = new JButton("Start");
		btn.addActionListener(new event());
		add(btn);
		
		Erorr = new JLabel("");
		add(Erorr);
	
	} 
	private class event implements ActionListener{

		@Override
		
		public void actionPerformed(ActionEvent e) {
			try{
				times = Integer.parseInt(tx1.getText());
			delay = Integer.parseInt(tx2.getText());
			width = Integer.parseInt(tx3.getText());
			high = Integer.parseInt(tx4.getText());
			
			if(times<= 0 || delay<=0 || width <=0|| high <= 0){
				Erorr.setText("Enter posative Numbers please");
			}else{
				try{
					Robot  rob = new Robot();
					for(int i = 0; i<times ; i++){
						rob.mouseMove((int) (Math.random()*width), (int) (Math.random()*high));
						rob.delay(delay);
					}
					
				}catch(Exception e1){
				
				}
			}
		}catch(Exception ewr){
			
		}
		}
	
		
	}
public static void main(String[] s){
	game x = new game();
	x.setVisible(true);
	
}
}
