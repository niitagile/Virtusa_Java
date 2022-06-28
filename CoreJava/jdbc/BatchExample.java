package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BatchExample {
	public static void main(String[] args)throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","scott","tiger");
	      Statement stmt = con.createStatement (ResultSet.TYPE_SCROLL_SENSITIVE,
	    		  ResultSet.CONCUR_UPDATABLE);
	      String insertEmp1 = "insert into student values (10,'jay')";
	      String insertEmp2 = "insert into student values (11,'jayes')";
	      String insertEmp3 = "insert into student values (12,'shail')";
	      //con.setAutoCommit(false);
	      
	      ResultSet rs = stmt.executeQuery("select * from student ");
	      rs.last();
	      stmt.addBatch(insertEmp1);
	      stmt.addBatch(insertEmp2);
	      stmt.addBatch(insertEmp3);
	      //System.out.println("rows before batch execution= "+ rs.getRow());
	      stmt.executeBatch();
	      con.commit();
	      System.out.println("Batch executed");
	      rs = stmt.executeQuery("select * from student");
	      while(rs.next())
	    	  System.out.println(rs.getInt(1));
	      rs.close();
con.close();
}}
