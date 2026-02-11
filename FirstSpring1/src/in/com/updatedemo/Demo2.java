package in.com.updatedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo2 {
	public static void main(String[] args) throws Exception
	 {
		  String name1="karan";
		  
		 String email1="cjsxj";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_class", "root", "Vivek@123");
		PreparedStatement ps=   con.prepareStatement("update empa set name=? where email=?");
		 ps.setString(1, name1);
		
		 ps.setString(2, email1);
		   int count= ps.executeUpdate();
		    if(count>0) {
		    	System.out.println("success");
		    }
		    else {
		    	System.out.println("fail");
		    }
	}

}
