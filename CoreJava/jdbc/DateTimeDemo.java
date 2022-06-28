package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DateTimeDemo {
  public static Connection getConnection() throws Exception {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    Class.forName(driver);
    return DriverManager.getConnection(url, "userName", "password");
  }

  public static void main(String args[])throws Exception {
    String INSERT_RECORD = "insert into TestDates(id, date_column, time_column) values(?, ?, ?)";
    Connection conn = null;
    PreparedStatement pstmt = null;
    try {
      conn = getConnection();
      pstmt = conn.prepareStatement(INSERT_RECORD);
      pstmt.setString(1, "001");

      java.util.Date date = new java.util.Date();// fetch current date and time
      long t = date.getTime();// retrieving only time
      java.sql.Date sqlDate = new java.sql.Date(t); //convert java date to sql date
      java.sql.Time sqlTime = new java.sql.Time(t); //convert java time to sql time
      
      pstmt.setDate(2, sqlDate);
      pstmt.setTime(3, sqlTime);
      
      pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Failed to insert the record.");
    } finally {
      pstmt.close();
      conn.close();
    }
  }
}

           
         
    
    
    
  










