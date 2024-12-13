package JDBCDemo.JDBCCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		try
		{
		String driver="com.mysql.jdbc.Driver"	;
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String username="root";
		
		String password="shamsheeraAT";
		
		//Register the Driver
		Class.forName(driver);
		//.Establish the Connection
		Connection con=DriverManager.getConnection(url,username,password);
		
		//create statements
		Statement st=con.createStatement();
		//Execute query
		String query="INSERT INTO employee(eid,name,address,salary)VALUES(101, 'Amreen','JHBCSLayout',20000)";
		//execute the sql statement to inser new employee record
		
		int rowAffected=st.executeUpdate(query);
	if(rowAffected>0)
	System.out.println("New Employee records addedd Successfully");
	else
		System.out.println("Insertion Failed!!");
	st.close();
	con.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}


