package main.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PS2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vanna","root","root");
		
		String query = "insert into authors values(?,?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(query);
		
		pstmt.setInt(1, 5);
		pstmt.setString(2, "Vanna");
		pstmt.setString(3,"Infotech");
		pstmt.setInt(4,8);
		
		pstmt.executeUpdate();
		System.out.println("Succesful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
