package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import model.signupModel;

public class signupController {
	String name,pass,email,phone;
	String dbUrl="jdbc:mysql://localhost:3306/maraDb";
    String dbUname="root";
    String dbPassword="";
    String dbDriver="com.mysql.cj.jdbc.Driver";
    signupModel rm;
	public signupController(signupModel rm){
		this.rm=rm; 
	}
	public void toStore(){
		Connection con = null;
   		try{
   			Class.forName(dbDriver);  //class not found exception
 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
 			String sql = "insert into actionTable (username,password,email,phoneno)"
 					+ "values('"+rm.getName()+"','"+rm.getPass()+"','"+rm.getEmail()+"','"+rm.getPhone()+"')";
 			Statement s = con.createStatement();
 			s.execute(sql);
 		   	con.close();
		 }catch(Exception e){      
			e.printStackTrace();
		 }
	
	
	
	}

}