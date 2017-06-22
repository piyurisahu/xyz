package com.piyuri.immutableClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {


		// TODO Auto-generated method stub

		
		public final static String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
		public final static String DB_URL = "jdbc:mysql://localhost:3306/piyuri";
		public final static String DB_USERNAME = "root";
		public final static String DB_PASSWORD = "rehnedo";

		
		public static Connection getConnection() throws ClassNotFoundException, SQLException {

			
			Connection con=null;
			Class.forName(DB_DRIVER_CLASS);
			con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			System.out.println("Connection established succesfully");
			return con;

		}
}
