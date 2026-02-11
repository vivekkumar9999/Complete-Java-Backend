package in.com.selectdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo4 {
	public static void main(String[] args) throws Exception
	 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_class", "root", "Vivek@123");
		  PreparedStatement ps=con.prepareStatement("select * from empa");
		    ResultSet rs=ps.executeQuery();
		     while(rs.next()) {
		    	  String name1=rs.getString("name");
		    	  System.out.println(name1);
		    	  String email1=rs.getString("email");
		    	  System.out.println(email1);
		    	  String city1=rs.getString("city");
		    	  System.out.println(city1);
		    	
		     }
		  
	}

}
