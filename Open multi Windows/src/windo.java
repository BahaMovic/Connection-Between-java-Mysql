import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class windo extends JFrame{
	
	JMenuBar m ;
	JMenu m1;
	JMenuItem m3;
	public windo(){
		setSize(400,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m = new JMenuBar();
		m1 = new JMenu("File");
		m3 = new JMenuItem("Help");
		m.add(m1);
		m1.add(m3);
		
		add(m);
		m3.addActionListener(new event());
	}private class event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(m3)){
				
				Help x = new Help(windo.this);
				x.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				x.setVisible(true);
			}
		}
		
	}
	
	public static void main(String[] args){
		windo a = new windo();
		a.setVisible(true);
	}

}
