package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao 
	{
		String sql = "Insert into login values(?,?) ";
		String url = "jdbc:mysql://localhost:3306/sys";
		String username = "root";
		String password = "kinetics@123";
		public void insert(String uname, String pass)
		{
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement st= con.prepareStatement(sql);
				st.setString(1, uname);
				st.setString(2, pass);
				ResultSet rs= st.executeQuery();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			
		}	
}
