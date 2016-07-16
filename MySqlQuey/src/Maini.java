import java.sql.*;
import java.util.Scanner;
public class Maini {
	static Connection con = null;
	static Statement st = null;
	static ResultSet rs= null;
	public static void ShowAll(){

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/via","BahaMovic","123123");
			String query = "select * from department";
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString("name"));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Insert(String name){

		String query = "insert into department (name) values('"+name+"')";
		try {
			st = con.createStatement();
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void Update(int id , String name){
		String query = "update department set name = '"+name+"' where id = '"+id+"'";
		try{
			st = con.createStatement();
			st.executeUpdate(query);
		}catch(Exception e){
			
		}
	}
	public static void Delete(int id){
		String query = "delete from department where id = '"+id+"'";
		try {
			st = con.createStatement();
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void CountDepartments(){
		int count = 0;
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from department");
			while(rs.next()){
				count += rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
		
	}
	public static void Search(String world){
		
		String query = "Select name,id from department where name like '%"+world+"%'";
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString("name")+" "+rs.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void SearchById(int item){
		String query = "select name from department where id > '"+item+"'";
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		ShowAll();
		CountDepartments();
		Search("Android");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		SearchById(i);
		
		
	}

}
