package com;

import java.sql.*;



public class Display {
	public static void main (String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root","root");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee1");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+" : "+rs.getInt(4)+" : "+rs.getString(5));
			}
			
			
			
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}

}
