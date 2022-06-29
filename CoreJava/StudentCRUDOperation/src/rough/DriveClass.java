package rough;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class DriveClass {

	public static void main(String[] args) throws Exception {
		StdudentController studentctrl=new StdudentController();
		System.out.println(" 1. Add Record");
		System.out.println("2. Update Record");
		System.out.println("3. Delete Record");
		System.out.println("4. View Records");
		System.out.println("5. View a Record");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice =sc.nextInt();
		int result;
		Student student=null;
		int rollno;
		String name;
		Date dob=null;
		switch(choice){
		case 1: 
			System.out.println("Enter rollno, name, dob");
			rollno=sc.nextInt();sc.nextLine();
			name=sc.nextLine();
			dob=new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
			
			student=new Student(rollno,name,dob);
			result=studentctrl.insertRecord(student);
			if(result>0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not inserted");
			break; 
		case 2:
			System.out.println("Enter rollno, name, dob");
			rollno=sc.nextInt();sc.nextLine();
			name=sc.nextLine();
			dob=new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
			
			student=new Student(rollno,name,dob);
			result=studentctrl.insertRecord(student);
			result=studentctrl.updateRecord(student);
			if(result>0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not inserted");
			break;
		case 3:
			System.out.println("Enter rollno");
			rollno=sc.nextInt();
			result=studentctrl.deleteRecord(rollno);
				if(result>0)
					System.out.println("Record Inserted");
				else
					System.out.println("Record not inserted");
			break;
		case 4:
				ArrayList<Student> list=studentctrl.getAllRecords();
				for(Student stud : list){
					System.out.println(stud.getRollno()+"\t"+stud.getStudname()+" "+stud.getDob());
				}
			break;
		case 5:
			System.out.println("Enter rollno, name, dob");
			rollno=sc.nextInt();
			student=studentctrl.getStudentByRollno(rollno);
			System.out.println("Rollno="+student.getRollno());
			System.out.println("Rollno="+student.getStudname());
			System.out.println("Rollno="+student.getDob());
			break;
		default: System.out.println("Wrong option");
		}

	}

}
