import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
public class game extends JFrame{
	JPanel pan;
	public game(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan = new JPanel();
		pan.setBackground(randomColor());
		add(pan);
		pan.addMouseListener(new event());
	}
	public Color randomColor(){
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int) (Math.random()*256);
		return(new Color(r,g,b));
	}
	private class event implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			pan.setBackground(randomColor());
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
public static void main(String[] ads){
	game c = new game();
	c.setSize(300,200);
	c.setVisible(true);
}
}
