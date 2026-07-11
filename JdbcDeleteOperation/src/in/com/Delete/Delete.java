package in.com.Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String[] args)  throws Exception
	 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Vivek@123");
		PreparedStatement ps= con.prepareStatement("delete from data where rollno=90 ");
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}
	}

}
