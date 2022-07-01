package IO_Classes_New;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
/*
 * Serializable interface-- marker interface which doesn't have any method but they are giving special instruction to JVM
 */
class Student implements Serializable{
	private int sno;
	private String name;
	transient private int marks;//not store in file
	static int a=45;
	public Student(){
		sno=1;
		name="Rimi";
		marks=89;
	}
	public void getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sno");
		sno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter marks");
		marks=sc.nextInt();
	}
	public void display(){
		System.out.println("sno="+sno);
		System.out.println("name="+name);
		System.out.println("marks="+marks);
		System.out.println("a="+a);
	}
}
public class SerializeExample {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
				Student sobj=new Student();
				sobj.getdata();
				
				//write object in file
				FileOutputStream fout=new FileOutputStream("D:\\register.txt");
				ObjectOutputStream obj=new ObjectOutputStream(fout);
				obj.writeObject(sobj);
				
				//read object from file
				FileInputStream fin=new FileInputStream("D:\\register.txt");
				ObjectInputStream iobj=new ObjectInputStream(fin);
				Student sobj1=(Student)iobj.readObject();
				sobj1.display();
				fout.close();
				fin.close();
			}
			catch(Exception ex){System.out.println(ex);
			}

	}

}
