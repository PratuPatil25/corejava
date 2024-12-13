package JDBCDemo.JDBCCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 
Steps:
1.Load or register Driver Manager
2.Establish the Connection:using connection class Object
Connection con=Driver Manger.getConnection(url,username,password)
3.create statements
Statement st=con.create Statement
4.Execute query
5.Close the connection
 */
public class JDBCConnect {

	public static void main(String[] args) {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/jdbcdemo";
			String username = "root";

			String password = "shamsheeraAT";
			String query = "select * from course where cid=103";
			// Register the Driver
			Class.forName(driver);
			// .Establish the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success");
			// create statements
			Statement st = con.createStatement();
			// Execute query
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString("cname");
			System.out.println(name);
			Statement stmt = con.createStatement();
			String sql1 = "create table Employee(eid int not null primary key auto_increment,name varchar(50),address varchar(100) not null,salary int not null)";
			stmt.executeUpdate(sql1);
			// Close the connection
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
