package jdbc;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveImage {
	public static void main(String args[]){  
		 
		try{  
	//step1 load the driver class  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  String url="10.113.17.162";
	//step2 create  the connection object 
	 
	  Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@//10.113.17.162:1521/orcl","hr","nidhi");  
	 
	//step3 create the statement object  
	  PreparedStatement ps=con.prepareStatement("select img from photo1");  
	  ResultSet rs=ps.executeQuery();  
	  if(rs.next()){//now on 1st row  
	               
	  Blob b=rs.getBlob(1);
	  byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
	               
	  FileOutputStream fout=new FileOutputStream("d:\\users\\sonoo.jpg");  
	  fout.write(barr);  
	               
	  fout.close();  

	con.close();  
	  
	}}catch(Exception e){ System.out.println(e);}  
	 
	 
	}  
}
