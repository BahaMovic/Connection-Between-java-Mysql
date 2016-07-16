import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.util.*;
public class slider extends JFrame{
	JSlider r , g , b ;
	int x =0, y=0, z=0;
	JLabel l1 ,l2 ,l3;
	JPanel pan = new JPanel();
	public slider(){
		setSize(400,200);
		setLayout(new GridLayout(4,3));
		
		pan.setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1 = new JLabel("");
		r = new JSlider(JSlider.HORIZONTAL,0,255,0);
		l2 = new JLabel("");
		g = new JSlider(JSlider.HORIZONTAL,0,255,0);
		l3 = new JLabel("");
		b = new JSlider(JSlider.HORIZONTAL,0,255,0);
		
		r.setMajorTickSpacing(5);
		g.setMajorTickSpacing(5);
		b.setMajorTickSpacing(5);
		add(r);
		add(g);
		add(b);
		add(l1);
		add(l2);
		add(l3);
		add(pan);
		r.addChangeListener(new event());
		g.addChangeListener(new event());
		b.addChangeListener(new event());
		
	}private class event implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
		x = r.getValue();
		l1.setText(" "+x);
		y = g.getValue();
		l2.setText(" "+y);
		z = b.getValue();
		l3.setText(" "+z);
		pan.setBackground(new Color(x,y,z));
			
		}
		
	}
	
	
	public static void main(String[] args){
		 slider xz = new slider();
		xz.setVisible(true);
		
	}

}
