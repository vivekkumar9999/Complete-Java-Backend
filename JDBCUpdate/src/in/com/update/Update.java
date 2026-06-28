package in.com.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root","Vivek@123");
		PreparedStatement ps=con.prepareStatement("update   data set name='Karan 'where city='Bhopal' ");
		  int i=ps.executeUpdate();
		  if(i>0) {
			   System.out.println("success");
		  }
		  else {
			  System.out.println("failed updation");
		  }
	}

}
