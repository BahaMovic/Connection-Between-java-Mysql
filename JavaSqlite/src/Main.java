import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Main {
	static Connection con = null;
	static PreparedStatement pet;
	static ResultSet rs;
	static Statement st = null;
	public static void function(){
		try{
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\BahaMovic\\Desktop\\Sqlite\\Student.sqlite");
			
			if(!con.isClosed()){
				JOptionPane.showMessageDialog(null,"Connection is opened");
			}else{
				JOptionPane.showMessageDialog(null, "Connection is Closed");
			}
			}catch(Exception e){
				System.out.println("Hello "+e);
			}
	}
	public static void quary(){
		String quary = "select * from Students";
		try {
			
			
			
			pet = con.prepareStatement(quary);
			System.out.println(pet);
			rs = pet.executeQuery();
			
			while(rs.next()){
				
				System.out.println(rs.getString("name")+" "+rs.getString("ID")+" "+rs.getString("major"));
			
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void Import(String name ,String major , String program ){
		String quary = "insert into Students(name , major , program) values('"+name+"','"+major+"','"+program+"')";
		try {
			con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\BahaMovic\\Desktop\\Sqlite\\Student.sqlite");
			st = con.createStatement();
			st.executeUpdate(quary);
			JOptionPane.showMessageDialog(null,"This Function is Added");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"This Function isn't Added");
			e.printStackTrace();
		}
	}
	public static void search(String world)throws Exception{
	
		String query = "select * from Students where name like '%"+world+"%'";
		st = con.createStatement();
		rs = st.executeQuery(query);
		while(rs.next()){
			System.out.println(rs.getString("name")+"  "+rs.getString("major")+" "+rs.getString("program"));
		}
	
	}
	public static void Delete(int ID){
		String query = "Delete from Students where ID = '"+ID+"'";
		try {
			st = con.createStatement();
			int item =st.executeUpdate(query);
			if(item == 1){
				JOptionPane.showMessageDialog(null, "Deleted Number "+ID);
			}else{
				JOptionPane.showMessageDialog(null, "Can't Deleted "+ID);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public static void Update(int ID , String name){
		String query = "update Students set name ='"+name+"' where ID='"+ID+"'";
		try {
			st = con.createStatement();
			int item = st.executeUpdate(query);
			
			if(item ==1 ){
				JOptionPane.showMessageDialog(null, "Updated");
				
			}else{
				JOptionPane.showMessageDialog(null, "Doesn't Find !");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
public static void main(String[] args){

	function();
	try {
		search("name");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	quary();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your Item You Want To Update ");
	int x = scan.nextInt();
	System.out.println("Enter the name You Want To Update");
	String name = scan.next();
	Update(x,name);
	
}
}
