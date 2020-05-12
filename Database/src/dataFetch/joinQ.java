package dataFetch;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import com.mysql.cj.jdbc.MysqlDataSource;

public class joinQ {

	public static void main(String[] args) throws Exception{
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerTimezone("UTC");
		String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&serverTimezone=UTC";
		String uname = "root";
		String pass = "macbookair";
		//join query
		String query = "SELECT firstName,lastName, register_date FROM users INNER JOIN contacts ON users.id = contacts.user_id";
	 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement state = con.createStatement();
	 
		ResultSet rs =state.executeQuery(query);
		
		System.out.println("firstName   lastName   register_date");
	 
		while(rs.next()){
		String	firstName = rs.getString("firstName");
		String	lastName = rs.getString("lastName");
		//int	contactNo = rs.getInt("contactNo");
		
		//date primitive 
		java.sql.Date register_date = rs.getDate("register_date");
		
	 
			System.out.println(firstName+ "        " + lastName+"        "+ register_date);
			
			
	 
		
}
		System.out.println();
		System.out.println();

	
	
		

	}

}
