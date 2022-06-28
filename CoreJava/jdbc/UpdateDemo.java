package jdbc;
import java.sql.*;
import java.util.*;
public class UpdateDemo {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
        System.out.print("Enter Name : ");
        String name=s.next();
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.
                    getConnection("jdbc:oracle:thin:@localhost:1521:orcl", 
                    "hr", "hr");
            
            String str="Update empl  set empname = ? where empid=?";
            ps=con.prepareStatement(str);
            ps.setString(1, name);
            ps.setInt(2, id);
            
            int result=ps.executeUpdate();
            if(result> 0)
            	System.out.println("Record updated");
            else
            	System.out.println("Record not updated");
            
            
            
        } catch (Exception e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }
}
