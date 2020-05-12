package dataFetch;

import java.sql.*;

import com.mysql.cj.jdbc.MysqlDataSource;
public class dataTest
{
	public static void main(String[] args) throws Exception {
		//fixing the timezone error
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerTimezone("UTC");
		//database url
		String url = "jdbc:mysql://localhost:3306/demo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDateTimeCode=false&serverTimezone=UTC";
		//database credentials
		String uname = "root";
		String pass = "macbookair";
		
		//query
		//fetching results from database using java(jdbc)
		String query = "select location from users where id=2";
		
		//Register JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Building Connection
		Connection con = DriverManager.getConnection(url,uname,pass);
		//Calling the statement
		Statement state = con.createStatement();
	 
		ResultSet rs =state.executeQuery(query);
		//Extract data from result set
		rs.next();
		String name = rs.getString("location");
		
		//Display values
		System.out.println(name);
	 
		state.close();
	 	con.close();
}
}
	 /**private static final String QUERY = "select id, firstName,lastName,email,password,location from users";

		 public static void main(String[] args) throws Exception {
		        try (
		        		
		        		
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false ","root", "macbookair");

		            Statement statem = connection.createStatement();

		            ResultSet rs = statem.executeQuery(QUERY))
		        {

		                while(rs.next()){
		                    int id = rs.getInt("id");
		                    String firstName = rs.getString("firstName");
		                    String lastName = rs.getString("lastName");
		                    String email = rs.getString("email");
		                    String password = rs.getString("password");
		                    String location = rs.getString("location");
		                    System.out.println(id + "," + firstName + " " + lastName + "," +email+ "," +password+","+location);
		                }
		            
		        } catch (SQLException e) {
		            printSQLException(e);
		        }
		    }

		    public static void printSQLException(SQLException ex){
		        for (Throwable e: ex){
		            if(e instanceof SQLException){
		                e.printStackTrace(System.err);
		                System.err.println("SQLState:" + ((SQLException) e).getSQLState());
		                System.err.println("Error Code" + ((SQLException) e).getErrorCode());
		                System.err.println("Message:" + ((SQLException) e).getSQLState());
		                Throwable t = ex.getCause();
		                while( t!= null){
		                    System.out.println("Cause:" + t);
		                    t=t.getCause();
		                }
		            }
		        }
		    
		
		
		
	}

	 }**/
		 
		 /**String url = "jdbc:mysql://localhost:3306/demo";
		 String uname = "root";
		 String pass = "macbookair";
		 String query = "select location from users where id=2";
		 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection(url,uname,pass);
		 
		 Statement state = con.createStatement();
		 
		 ResultSet rs =state.executeQuery(query);
		 
		 rs.next();
		 String name = rs.getString("firstName");
		 
		 System.out.println(name);
		 
		 state.close();
		 con.close();
	 }**/
	 
