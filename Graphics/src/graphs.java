import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;
public class graphs extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
		
		this.setBackground(Color.white);
		
		g.setColor(Color.red);
		g.fillRect(200, 100, 100, 100);
		
		g.setColor(new Color(120,123,121));
		g.fillRect(200, 300, 100, 100);
		
		g.setColor(Color.BLUE);
		g.drawString("I Love Java", 41, 21);
	}

}
