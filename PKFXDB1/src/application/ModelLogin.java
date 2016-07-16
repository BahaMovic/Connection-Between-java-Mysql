package application;
import java.sql.*;
public class ModelLogin {
	Connection conn;
	public ModelLogin(){
		conn = SqliteConnection.Connector();
		if(conn==null){
			System.exit(0);
		}
	}
	public Boolean isConnected(){
		try {
			return !conn.isClosed();
		} catch (SQLException e) {
		return false;
		}
	}

}
