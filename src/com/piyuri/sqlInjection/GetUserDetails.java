package com.piyuri.sqlInjection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class GetUserDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Emaiid");
		
		String id=sc.nextLine();
		System.out.println("User Emailid"+id);
		System.out.println("enter password details");
		String pwd=sc.nextLine();System.out.println("password is"+pwd);
		printUserData(id, pwd);
		

	}
	
	private static void printUserData(String id ,String pwd) throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		java.sql.PreparedStatement stmt=null;
		ResultSet rs=null;
		try
		{
			System.out.println("getting connection");
		con=DBConnection.getConnection();
		System.out.println("in staement");
		stmt=con.prepareStatement("Select * from Users where email=? and password=?");
		String query="select name,country,password from Users "
				+ "where email ='"+id+"' and password = '"+pwd+"'";
		/*String query="select * FROM Users";*/
		stmt.setString(1, id);
		stmt.setString(2, pwd);
		System.out.println("getting data from result set");
		rs=stmt.executeQuery();
		while(rs.next())
		{
			System.out.println("getting data from result set");
			System.out.println("name="+rs.getString("name")+"Country="+rs.getString("country"));
		}
	
		}finally{
			if(rs!=null)
			rs.close();
			
		}
	}

}
