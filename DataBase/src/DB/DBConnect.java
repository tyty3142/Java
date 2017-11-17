package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	//Credentials
	private final String DBName = "ist312";
	private final String DBUser	= "ist312";
	private final String DBPass = "tr1235";
	
	//Driver
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://asoares.casa.siu.edu/" + DBName;
	
	private Connection conn = null;

	public DBConnect() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		conn = DriverManager.getConnection(DB_URL, DBUser, DBPass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}// end of Constructor
	
	public Connection isConnected(){
		return conn;
	}
	
	public ResultSet select(String sql){
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public int update(String sql){ //insert, delete or update
		int numRows = 0;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			numRows = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numRows;
	}
	
}// end class
