package inheritence;
import java.util.Scanner;
class Person1{
private int id;
private String name;
public Person1(){
	id=0;
	name=null;}
public Person1(int id, String name){
	this.id=id;
	this.name=name;}
/*public void getdata(){
	id=2;
	name="preeti";
}*/
public void show(){
	System.out.println("id="+id);
	System.out.println("name="+name);}
}

public class Teacher2 extends Person1 {
	private String qual;
	private float sal;
	Teacher2(){
		qual="BCA";
		sal=5000;
		
		}
	Teacher2(int id, String name, String qual, float sal){
		super(id, name);//Parent(id,name)
		this.qual=qual;
		this.sal=sal;
	}
	public void display(){
		
		System.out.println("qual="+qual);
		System.out.println("salary="+sal);}
	/*public void getinfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter qualification");
		qual=sc.nextLine();
		System.out.println("Enter salary");
		sal=sc.nextFloat();
	}*/
	public static void main(String[] args) {
		Teacher2 obj=new Teacher2();
		//obj.getdata();
		//obj.getinfo();
		obj.show();
		obj.display();
		Teacher2 obj1=new Teacher2(23,"shikha","MCA",10000);
		//obj.getdata();
		//obj.getinfo();
		obj1.show();
		obj1.display();
			}}
