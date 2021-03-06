package dataFetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlDataSource;

public class dataEntry {

	public static void main(String[] args) throws Exception {
		//for user input
		Scanner scanner = new Scanner(System.in);
		
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setServerTimezone("UTC");
			String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&serverTimezone=UTC";
			String uname = "root";
			String pass = "macbookair";
			//? is the number of columns present
			String query = "insert into users values (?,?,?,?,?,?)";
			
			
		 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection has started");
			//preparedstatement for user input
			PreparedStatement state = con.prepareStatement(query);
			System.out.println("Enter the id");
			int id = scanner.nextInt();
			System.out.println("Enter the firstname");
			String firstName = scanner.next();
			System.out.println("Enter the last name");
			String lastName = scanner.next();
			System.out.println("Enter the email");
			String email = scanner.next();
			System.out.println("Enter your password");
			String password = scanner.next();
			System.out.println("Enter your location");
			String location= scanner.next();
			
			state.setInt(1,id);
			state.setString(2,firstName);
			state.setString(3,lastName);
			state.setString(4,email);
			state.setString(5,password);
			state.setString(6,location);
			
			
			
			int count= state.executeUpdate();
			
			System.out.println(count+"rows affected");
			
			state.close();
			con.close();
			
		}

	}


