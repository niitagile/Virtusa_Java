
import java.sql.*;
public class SelectDemo {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.
                    getConnection("jdbc:oracle:thin:@localhost:1521", 
                    "hr", "hr");
            stmt=con.createStatement();
            rs=stmt.executeQuery("Select * from student");
            while(rs.next())
            {
                System.out.println(rs.getInt("id")+
                        " "+rs.getString("name")+
                        " "+rs.getInt("age"));
            }
        } catch (Exception e) {
            System.out.println("Problem");
            e.printStackTrace();
        }
    }
}
