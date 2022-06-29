package rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;

public class StudentService {
	
	private static Connection getConnection() {
		Connection con=null;
		//Step 1 : load Driver in memory
		try {
			//to call Class loader to load class in memory at dymanic time
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			//Step 2: Database information 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cred", "root","Comnet@123");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public ArrayList<Student> getAllRecords(){
	ArrayList<Student> list=new ArrayList<>();
	try{
	Connection con=getConnection();
	//To get all Records
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from studentdetails");
	//Add all Records in ArrayList		
					
	while(rs.next()) {
		
		list.add(new Student(rs.getInt(1),rs.getString(2),rs.getDate(3)));
				
	}
	stmt.close();
	con.close();
	
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return list;
	}
	
	
	
	//Insert Record in Table
	public int insertRecord(Student student){
		int result=0;
		try{
			Connection con=getConnection();
			java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
			//To insert records 
			PreparedStatement ps=con.prepareStatement("insert into studentDetails(rollno, studname,dob) values(?,?,?)");
			ps.setInt(1,student.getRollno());
			ps.setString(2,student.getStudname());
			ps.setDate(3, sdob);
			result=ps.executeUpdate();
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return result;
	
	}
	public int deleteRecord(int rollno){
		int result=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("delete from studentdetails where rollno=?");
			
			ps.setInt(1,rollno);
			
			result=ps.executeUpdate();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return result;
	}
	
	public int updateRecord(Student student){
		int result=0;
		try{
			Connection con=getConnection();
			java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
			
			//To insert records 
			PreparedStatement ps=con.prepareStatement("update studentDetails set studname=?,dob=? where rollno=?");
			ps.setInt(3,student.getRollno());
			ps.setString(1,student.getStudname());
			ps.setDate(2, sdob);
			result=ps.executeUpdate();
			con.close();
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return result;
	}
	public Student getStudentByRollno(int rollno){
		Student student=null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("Select * from studentdetails where rollno=?");
			ps.setInt(1, rollno);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				student=new Student(rs.getInt(1),rs.getString(2),rs.getDate(3));
			
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return student;
	}

}
