package in.com.deletedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo3 {
	public static void main(String[] args) throws Exception
	{
		    String email1="jjj@j";
		  Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_class","root", "Vivek@123");
		      PreparedStatement ps=  con.prepareStatement("delete from empa where email=?");
		        ps.setString(1, email1);
		        int i=ps.executeUpdate();
		          if(i>0) {
		        	  System.out.println("delete successfully");
		          }
		          else {
		        	  System.out.println("no deletion");
		          }
		      
		  
	}

}
