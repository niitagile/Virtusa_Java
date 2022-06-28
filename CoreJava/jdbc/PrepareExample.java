package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareExample {

	public static void main(String[] args) {
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			 
			//step2 create  the connection object 
			 
			  Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521/orcl","scott","tiger");  
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter employee id");
			 int eid=sc.nextInt();
			 System.out.println("Enter employee name");
			 sc.nextLine();
			 String ename=sc.nextLine();
			//step3 create the statement object  
			PreparedStatement stmt=con.prepareStatement("insert into student values (?,?)");  
			stmt.setInt(1,eid);
			stmt.setString(2,ename);
			
			//step4 execute query  
			int ans=stmt.executeUpdate();
			//System.out.println(rs.next());
			if(ans>0)  
			System.out.println("Record inserted");  
			else
				System.out.println("Record Not inserted");
			//step5 close the connection object

			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			 


	}

}
