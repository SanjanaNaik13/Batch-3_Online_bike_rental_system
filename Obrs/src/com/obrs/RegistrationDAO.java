package com.obrs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.model.*;

public class RegistrationDAO {
	private static Connection con; 
	  private static PreparedStatement stmt;
	  
	public static void getConnection()
	  {	 	
		  String JdbcURL = "jdbc:mysql://localhost:3307/bikedatabase?" + "autoReconnect=true&useSSL=false";
	      String Username = "root";
	      String password = "";
	       con = null;      
	      try 
	      {
	    	 Class.forName("com.mysql.jdbc.Driver");   // Driver should be registered
	    	 // con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/test1","root","");  
	         con = DriverManager.getConnection(JdbcURL, Username, password);
	         
	      } 
	      catch (Exception e) 
	      {
	         e.printStackTrace();
	      }
		   
		 
	  }
	  public static void closeConnection()
	  {
		  try{
			  if(con.isClosed()==false)
		          con.close();   // closing the connection
		  }
		  catch(Exception e)
		  { e.printStackTrace();	 }
	  }  
	  
	  public static Boolean register(RegistrationModel r)
	  {  
		  try
		  {
		  getConnection();
		  int nor=0;
	      stmt=con.prepareStatement("insert into user_detsils values(?,?,?,?,?,?,?,) "); 
	      stmt.setString(1, r.getEmail_id());
	      stmt.setString(2, r.getPassword());
	      stmt.setString(3, r.getph_no());
	      stmt.setString(4, r.getLocation());
	      stmt.setString(5, r.gets_quest());
	      stmt.setString(6, r.gets_ans());
	      stmt.setString(7, r.getDl_no());

	      nor=stmt.executeUpdate();
		     closeConnection();	 
		    if(nor>0)
		    {
		    	return true;
		    }
		    return false;
		  }
		  catch(SQLException e)
		  {	  e.printStackTrace();	 return false; }
		  catch(Exception e)
		  {	  e.printStackTrace();	 return false; }  	  
	  }
}
