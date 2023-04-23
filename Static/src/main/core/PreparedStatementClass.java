package main.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementClass {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vanna","root","root");
		
		String query = "Select * from authors where age>= ? and firstname = ?";
		
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, 20);
        pstmt.setString(2, "SAI");
        
        ResultSet rs =  pstmt.executeQuery();
        
       // System.out.println('Age      Name');
        while (rs.next()) {
            String Name = rs.getString("firstname");
            int age = rs.getInt("age");
            System.out.println(Name + "     " + age);
        }
		
		}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
