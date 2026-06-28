package in.com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	public static void main(String[] args)  throws Exception
	{
		 String name="sudama";
		 String last_name="singh";
		 String rollno="90";
		 String city="raghawpur";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Vivek@123");
		PreparedStatement ps= con.prepareStatement("insert into data values(?,?,?,?) ");
		ps.setString(1, name);
		ps.setString(2, last_name);
		ps.setString(3, rollno);
		ps.setString(4, city);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
	}

}
