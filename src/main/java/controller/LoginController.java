//package controller;
//
//public class LoginController {
//	String email,pass;
//	String dbUrl="jdbc:mysql://localhost:8080/maradb";
//    String dbUname="root";
//    String dbPassword="";
//    String dbDriver="com.mysql.cj.jdbc.Driver";
//	public LoginController(String email,String pass){
//		this.email=email;
//		this.pass=pass;
//	}
//
//	public boolean toStore(){
//		 Connection con = null;
//	   		try{
//	   			Class.forName(dbDriver);  //class not found exception
//	 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
//			String sql = "select * from actionTable where email='"+email+"' and password='"+pass+"'";	 		
//}
