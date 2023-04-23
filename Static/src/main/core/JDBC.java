package main.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vanna","root","root");
			Statement st=con.createStatement();
			
			String sql="select * from authors where id=2";
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
