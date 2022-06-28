package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertPhoto {
	public static void main(String args[]){  
		 
		try{  
	//step1 load the driver class  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  String url="10.113.17.162";
	//step2 create  the connection object 
	 
	  Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@//10.113.17.162:1521/orcl","hr","nidhi");  
	 
	  
	//step3 Read Image from File
	File imgfile = new File("D://users//Hydrangeas.jpg");//File is calss in java.io
	FileInputStream fin = new FileInputStream(imgfile);
	//step 4 Preparestatement to put image in database
	PreparedStatement pre = con.prepareStatement("insert into Photo1 values(?,?,?)");
	pre.setInt(1,5);
	pre.setString(2,"Durga");
	pre.setBinaryStream(3,fin,(int)imgfile.length()); //convert image in binary
	pre.executeUpdate();
	System.out.println("Inserting Successfully!");
	pre.close();
	con.close();


	//step5 close the connection object

	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	 
}}
