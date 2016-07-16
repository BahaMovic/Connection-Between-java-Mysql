import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame{
	TextPanel tx;
	FormPanel fp;
	ToolBar tb;
	public MainFrame(){
		super("I Love Java");
		setLayout(new BorderLayout());
		
		tx = new TextPanel();
		fp = new FormPanel();
		tb = new ToolBar();
		tb.setStringEmitted(new StringEmitted(){

			@Override
			public void textEmitted(String text) {
				tx.appendText(text);
				
			}
			
		});
		fp.setFormListener(new FormListener(){
			public void formEventDepartment(FormEvents e){
				String name = e.getName();
				String department = e.getDepartment();
				tx.appendText(name+" : "+department+"\n");
				
			}
		});
		add(fp,BorderLayout.WEST);
		add(tb , BorderLayout.NORTH);
		add(tx, BorderLayout.CENTER);
		
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	

}
