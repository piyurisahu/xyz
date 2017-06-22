package com.piyuri.sqlInjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public final static String DB_DRIVER_CLASS="com.mysql.jdbc.Driver";
	public final static String DB_URL="jdbc:mysql://localhost:3306/piyuri";
	public final static String DB_USERNAME="root";
	public final static String DB_PASSWORD="rehnedo";
	
/*	try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/piyuri","root","rehnedo");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
		}catch(Exception e){ System.out.println(e);} 
*/	
	
	
	public static Connection getConnection() throws ClassNotFoundException 
	{
		System.out.println("in connection method");
		Connection con=null;
		Class.forName(DB_DRIVER_CLASS);
		System.out.println("after getting driver class");
	try {
		con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("Connection Created Successfully");
	
		return con;
	}
	

}
