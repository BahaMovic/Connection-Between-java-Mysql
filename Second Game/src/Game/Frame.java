package Game;


import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Frame extends JFrame {
	Ball ball , ball1 , ball2 , ball3 , ball4 , ball5 ,ball6 , ball7 , ball8;
	Screen screen;
Cursor mouse;
URL url;
AudioClip sound;
int amount;
Timer timeout;
JLabel lab ,lab1;
JButton btn;
	public Frame() throws Exception {

		super("BahaGame");
		url = Ball.class.getResource("wilhelm_scream.au");
		sound = Applet.newAudioClip(url);
		setLayout(null);
		setSize(500,500);
		
		amount = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		mouse = new Cursor(Cursor.CROSSHAIR_CURSOR);
		setCursor(mouse);
		
		
		BufferedImage image = ImageIO.read(Frame.class.getClassLoader().getResourceAsStream("Game/Eye_gif.gif"));
		BufferedImage image1 = ImageIO.read(Frame.class.getClassLoader().getResourceAsStream("Game/metal.png"));

		ball = new Ball(image,-50,-50,300,50);
		 ball1 = new Ball(image,-50,-50,310,260);
		 ball2 = new Ball(image,-50,-50,360,100);
		 ball3 = new Ball(image1,-50,-50,230,250);
		 ball4 = new Ball(image1,-50,-50,140,100);
		 ball5 = new Ball(image1,-50,-50,220,130);
		 ball6 = new Ball(image1,-50,-50,100,200);
		 ball7 = new Ball(image1,-50,-50,110,260);
		 ball8 = new Ball(image1,-50,-50,90,170);
		
		
		screen = new Screen(ball);
		
		this.setForeground(Color.white);	
		lab = new JLabel("Score 0");

		lab.setBounds(20,20,100,20);
		add(lab);
		this.setFocusable(true);
		screen.setBounds(0,0,500,500);
		
		add(screen);
		addMouseListener(new mouselistener(ball,amount , ball1 , ball2));
		long befor = System.currentTimeMillis();
		
		while(true){
			
			long after = System.currentTimeMillis();
			
			float time = (float)(after - befor)/1000;
			
			befor = after;
			ball.update(time);
			ball1.update(time);
			ball2.update(time);
			ball3.update(time);
			ball4.update(time);
			ball5.update(time);
			ball6.update(time);
			ball8.update(time);
			ball7.update(time);
			screen.repaint();
			Thread.sleep(20);
			
		}

	
}

			
		
	



public class Screen extends JLabel{
	Ball ball;

	public Screen(Ball ball ){
	this.ball = ball;
	
	
	}
	public void paintComponent(Graphics g){
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 500, 500);
		g.drawImage(ball.getImage(), (int)ball.getX(),(int)ball.getY(), null);
		g.drawImage(ball1.getImage(), (int)ball1.getX(),(int)ball1.getY(), null);
		g.drawImage(ball2.getImage(), (int)ball2.getX(),(int)ball2.getY(), null);
		g.drawImage(ball3.getImage(), (int)ball3.getX(),(int)ball3.getY(), null);
		g.drawImage(ball4.getImage(), (int)ball4.getX(),(int)ball4.getY(), null);
		g.drawImage(ball5.getImage(), (int)ball5.getX(),(int)ball5.getY(), null);
		g.drawImage(ball6.getImage(), (int)ball6.getX(),(int)ball6.getY(), null);
		g.drawImage(ball7.getImage(), (int)ball7.getX(),(int)ball7.getY(), null);
		g.drawImage(ball8.getImage(), (int)ball8.getX(),(int)ball8.getY(), null);
		
	}
	
	}public class mouselistener implements MouseListener{

		Ball ball , ball1 , ball2;
		URL url;
		AudioClip sound2;
		int amount ;
		public mouselistener(Ball ball , int amount ,Ball ball1 , Ball ball2){
			this.amount = amount;
			url = mouselistener.class.getResource("body.au");
			sound2 = Applet.newAudioClip(url);
			this.ball = ball;
			this.ball1 = ball1;
			this.ball2 = ball2;
		}
		
		public void mouseClicked(MouseEvent e) {
		
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
		
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
		
		}

		@Override
		public void mousePressed(MouseEvent e) {
			

			double mousex = e.getX();
			double ballx= ball.getX() + ball.getImage().getHeight();
		
			double tim = ballx - mousex;
			System.out.println(tim);
		
			if(tim>0 && tim<35){
				sound2.play();
				ball.speed_x *= 1.02;
				ball.speed_y *= 1.02;
				ball.setX(-50);
				ball.setY(-50);
				amount++;
				lab.setText("Score "+amount);
				lab.setBackground(Color.WHITE);
			}

			double mousex1 = e.getX();
			double ballx1= ball1.getX() + ball1.getImage().getHeight();
		
			double tim1 = ballx1 - mousex1;
			System.out.println(tim1);
		
			if(tim1>0 && tim1<35){
				sound2.play();
				ball1.speed_x *= 1.02;
				ball1.speed_y *= 1.02;
				ball1.setX(-50);
				ball1.setY(-50);
				amount++;
				lab.setText("Score "+amount);
				lab.setBackground(Color.WHITE);
			}

			double mousex2 = e.getX();
			double ballx2= ball2.getX() + ball2.getImage().getHeight();
		
			double tim2 = ballx2 - mousex2;
			System.out.println(tim2);
		
			if(tim2>0 && tim2<35){
				sound2.play();
				ball2.speed_x *= 1.02;
				ball2.speed_y *= 1.02;
				ball2.setX(-50);
				ball2.setY(-50);
				amount++;
				lab.setText("Score "+amount);
				lab.setBackground(Color.WHITE);
			}
			double mousex3 = e.getX();
			double ballx3= ball3.getX() + ball3.getImage().getHeight();
		
			double tim3 = ballx3 - mousex3;
			System.out.println(tim3);
		
			if(tim3>0 && tim3<35){
				sound2.play();
				JOptionPane.showMessageDialog(null, "Your Score is  "+amount);
				amount = 0;
				lab.setText("Score "+amount);
				
			}
			double mousex4 = e.getX();
			double ballx4= ball4.getX() + ball4.getImage().getHeight();
		
			double tim4 = ballx4 - mousex4;
			System.out.println(tim4);
		
			if(tim4>0 && tim4<35){
				sound2.play();
				JOptionPane.showMessageDialog(null, "Your Score is  "+amount);
				amount = 0;
				lab.setText("Score "+amount);
				
			}
			double mousex5 = e.getX();
			double ballx5= ball5.getX() + ball5.getImage().getHeight();
		
			double tim5 = ballx5 - mousex5;
			System.out.println(tim5);
		
			if(tim5>0 && tim5<35){
				sound2.play();
				JOptionPane.showMessageDialog(null, "Your Score is  "+amount);
				amount = 0;
				lab.setText("Score "+amount);
				
			}
			double mousex6 = e.getX();
			double ballx6= ball6.getX() + ball6.getImage().getHeight();
		
			double tim6 = ballx6 - mousex6;
			System.out.println(tim6);
		
			if(tim6>0 && tim6<35){
				sound2.play();
				
			JOptionPane pane = new JOptionPane();
			pane.setBounds(20,20,300,200);
			pane.showMessageDialog(null, "Your Score is  "+amount);
			
				amount = 0;
				lab.setText("Score "+amount);
				
			}
			
			double mousex7 = e.getX();
			double ballx7= ball7.getX() + ball7.getImage().getHeight();
		
			double tim7 = ballx7 - mousex7;
			System.out.println(tim7);
		
			if(tim3>0 && tim3<35){
				sound2.play();
				JOptionPane.showMessageDialog(null, "Your Score is  "+amount);
				amount = 0;
				lab.setText("Score "+amount);
				
			}
			
			double mousex8 = e.getX();
			double ballx8= ball8.getX() + ball8.getImage().getHeight();
		
			double tim8 = ballx8 - mousex8;
			System.out.println(tim8);
		
			if(tim3>0 && tim3<35){
				sound2.play();
				JOptionPane.showMessageDialog(null, "Your Score is  "+amount);
				amount = 0;
				lab.setText("Score "+amount);
				
			}

			
		}
		public mouselistener(){
			
		}
		

		@Override
		public void mouseReleased(MouseEvent e) {
		}
		
	}



	
}
