import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Game extends JFrame{
	int roun = 1, rand1 , rand2, rand3 ,rand4;
	JLabel first , second , third , fourth , or , windo;
	JButton High,Low;
	JMenuBar bar;
	JMenu men;
	JMenuItem item1,item2;
	public Game(){
		setSize(400,200);
		setLayout(new GridLayout(3,1));
		rand1 = (int)(Math.random()*20 +1);
		Font font = new Font("serial",Font.BOLD,18);
		setFont(font);
		bar = new JMenuBar();
		men = new JMenu("File");
		item1 = new JMenuItem("Rest");
		item2 = new JMenuItem("Exit");
		bar.add(men);
		men.add(item1);
		men.add(item2);
		setJMenuBar(bar);
		
		High = new JButton("High");
		Low = new JButton("Low");
		
		High.addActionListener(new event());
		Low.addActionListener(new event());
	Container p = this.getContentPane();
	JPanel pane = new JPanel();
	p.add(p);
	
	}private class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
		
	}
	public static void main(String[] args){
		
	}
	

}