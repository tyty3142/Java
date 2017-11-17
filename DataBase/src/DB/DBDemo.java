package DB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DBDemo();
	}
	
	DBConnect db;
	
	public void selectMembers(){
		String sql = "SELECT * FROM Membership";
		ResultSet rs = db.select(sql);
		
		if(rs !=null){
			try {
				while(rs.next()){
					String id = rs.getString("ID");
					String name = rs.getString("Name");
					
					System.out.println("ID: " + id);
					System.out.println("Name: " + name);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("It's Not Working Yea Dingus!");
		}
	}
	
	public DBDemo(){
		db = new DBConnect();
		
		if(db.isConnected()==null){
			System.out.println("Ya fucked Up!");
			System.exit(0);
		}
		
		selectMembers();
		insertMember();
	}

	public void insertMember(){
		String sql = "INSERT INTO Membership (ID, Name, Phone, State, Company, DOB, Membership, Email)" + 
				"VALUES('1235105197816', 'Gasai Uno', '(618) 453-6454', 'IL', 'SIU', '1495-10-10', '1995-10-01', 'JohnDoe@gmail.com'";
		
		int numRows = db.update(sql);
		
		if(numRows == 0){
			System.out.println("You're a Disappointment");
		}
		else{
			System.out.println(numRows + "Rows inserted!");
		}
	}
	
}
