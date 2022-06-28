package jdbc;


import java.sql.*;
import java.util.*;
public class InsertDemo {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter rollno : ");
        int id=s.nextInt();
        System.out.print("Enter Name : ");
        String name=s.next();
        System.out.print("Enter english marks : ");
        float marks=s.nextFloat();
        
        try {
        	//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2 create  the connection object 
			 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/greatlearning","root","Comnet@123"); 
			
            String str="Insert into student (rollno, studname,marks) values(?,?,?)";
            ps=con.prepareStatement(str);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setFloat(3, marks);
           
            int ans =ps.executeUpdate();
            if(ans>0)
            	System.out.println("Record inserted");
            
            //System.out.println("Record Inserted");
            
        } catch (Exception e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }
}
