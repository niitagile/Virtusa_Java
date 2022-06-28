package jdbc;

import java.sql.*;

public class JoinDemo {
   public static void main(String[] args) throws Exception{
      Class.forName("org.apache.derby.jdbc.ClientDriver");
      Connection con = DriverManager.getConnection
      ("jdbc:derby://localhost:1527/testDb","username",
      "password");
      Statement stmt = con.createStatement();
      String query ="SELECT fname,lname,isbn from author "
      		+ "inner join books on author.AUTHORID = books.AUTHORID";
      ResultSet rs = stmt.executeQuery(query);
      System.out.println("Fname  Lname   ISBN");
      while (rs.next()) {
         String fname = rs.getString("fname");
         String lname = rs.getString("lname");
         int isbn = rs.getInt("isbn");
         System.out.println(fname + "  " + lname+"   "+isbn);
      }
      System.out.println();
      System.out.println();
   }
}
