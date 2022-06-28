package jdbc;
import java.sql.*;
import java.util.*;
public class DeleteDemo {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
            
            String str="Delete from student  where id=?";
            ps=con.prepareStatement(str);
            ps.setInt(1, id);
            int ans=ps.executeUpdate();
            
            if (ans>0)
            System.out.println("Record Deleted");
            
        } catch (Exception e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }
}
