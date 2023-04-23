package main.core;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class CallableS {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vanna","root","root");
		String query="{call GetAuthors}";
		CallableStatement cs=con.prepareCall(query);
		
		System.out.println("Exceuting Stored Procedure");
		ResultSet rs=cs.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
