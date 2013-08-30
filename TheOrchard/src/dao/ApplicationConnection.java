package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ApplicationConnection 
{
	
         private String url= "jdbc:mysql://localhost:3306/cms";
		 private String userName="root";
		 private String password="root";
		 
		 public java.sql.Connection getConnection(){
			java.sql.Connection con = null;	
			 try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(url,userName, password);
				} catch (ClassNotFoundException e) {
					System.out.println("Could not find the driver");
				} catch (Exception e) {
					System.out.println("Could not connect to the database");
				}
				return con;
		 }
		 public PreparedStatement getPreparedstatement(java.sql.Connection con,String query)throws Exception{
			PreparedStatement statement = con.prepareStatement(query);
			return statement;
		 }
		
		
}
