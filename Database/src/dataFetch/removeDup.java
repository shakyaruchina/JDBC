package dataFetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class removeDup {

	public static void main(String[] args)throws Exception {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerTimezone("UTC");
		String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&serverTimezone=UTC";
		String uname = "root";
		String pass = "macbookair";
		//selecting unique entries
		String query = "SELECT DISTINCT email FROM users ORDER BY email"; 
	 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement state = con.createStatement();
		
		ResultSet rs =state.executeQuery(query);
		 
		rs.next();
		String name = rs.getString("email");
	 
		System.out.println(name);
		
		
		System.out.println("Successfully executed");
	 
		
		
		
		
		
		
		
		state.close();
		con.close();

	

	}

}
