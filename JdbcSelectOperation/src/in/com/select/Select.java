package in.com.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Vivek@123");
		PreparedStatement ps= con.prepareStatement("select * from data ");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			String name=rs.getString("name");
			String rollno=rs.getString("rollno");
			System.out.println(name);
			System.out.println(rollno);
		}
	}

}
