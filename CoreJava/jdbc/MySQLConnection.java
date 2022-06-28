package jdbc;
import java.sql.*;
public class MySQLConnection {

	public static void main(String[] args) {
		try{
			//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2 create  the connection object 
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/greatlearning","root","Comnet@123");  
			
			//step3 create the statement object  
			Statement stmt=con.createStatement();
			
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from Student"); 
			
			//Step 5 Read Output from resultset
			System.out.println("Rollno\t student Name \t Marks");
			while(rs.next())  
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("studname")+"\t\t"+rs.getDouble("marks")); 
			
			//Step 6 Close Connection
			con.close();
			
			
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
