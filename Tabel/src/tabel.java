import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class tabel extends JFrame{
	JTable tb ;
	public tabel(){
		setSize(700,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DefaultTableModel mode = new DefaultTableModel();
		
		ArrayList<String> you = new ArrayList<>();
		you.add("Name");
		you.add("ID");
		you.add("Level");
		Object[][] data ={
				{"Bahaa",22,2},
				{"Alaa",17,3},
				{"Diaa",29,4}
		};
	
		tb = new JTable(data,you.toArray());
		tb.setPreferredScrollableViewportSize(new Dimension(600,100));
		
		
		JScrollPane paan = new JScrollPane(tb);
		add(paan);
	
	}
	public static void main(String[] adda){
		tabel x = new tabel();
		x.setVisible(true);
	}

}
