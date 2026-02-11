package in.com.insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo1 {
	public static void main(String[] args) throws Exception
	{
		
		  String name1="mohan";
		  String email1 = "hdbdehj@d";
		  String city1="raghopur";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_class", "root", "Vivek@123");
		 PreparedStatement ps=con.prepareStatement("insert into empa values(?,?,?)");
		 ps.setString(1, name1);
		 ps.setString(2, email1);
		 ps.setString(3, city1);
		  int i= ps.executeUpdate();
		  if(i>0) {
			  System.out.println("success");
		  }
		  else {
			  System.out.println("failed");
		  }
	}

}
