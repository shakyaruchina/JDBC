package dataFetch;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class updateData {

	public static void main(String[] args)throws Exception{ 
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerTimezone("UTC");
		String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&serverTimezone=UTC";
		String uname = "root";
		String pass = "macbookair";
		//updating date
		String query = "UPDATE contacts SET register_date='2019-05-11' WHERE contactNo='98'"; 
	 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement state = con.createStatement();
		
		state.executeUpdate(query);
	 
		
		
		System.out.println("Successfully executed");
	 
		
		
		
		
		
		
		
		state.close();
		con.close();

	
	
		

	}

	}
