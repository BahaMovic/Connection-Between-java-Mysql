import javax.swing.*;
import java.awt.*;

public class Help extends JDialog{
	
	JTextArea tx;
	public Help(JFrame frame){
		super(frame , "Help", true);
		setSize(400,300);
		setLayout(new FlowLayout());
		
		tx = new JTextArea("Msạạ good of \nyou dears in God, you've been punching I'll publish online \ncourses in the evening, but I found a bunch of credits. On my way to one \ngeographic lmaooo, so get the \nopportunity to have engaged them all to you, happy new year happy on \nAll who saw the post smile emoticon Dont forget to \nshare a post and God bless you, too, dont mnshn friends ",13,20);
		add(tx);
	}

}
