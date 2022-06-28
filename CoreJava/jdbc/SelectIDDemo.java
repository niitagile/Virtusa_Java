import java.sql.*;
import java.util.*;
public class SelectIDDemo {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
        
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager. getConnection("jdbc:oracle:thin:@localhost:1521", "hr", "hr");
            String str="Select * from student where id=?";
            ps=con.prepareStatement(str);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            if(rs.next())
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            else
            	System.out.println("Record Not Found");
            
            con.close();
        } catch (Exception e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }
}
