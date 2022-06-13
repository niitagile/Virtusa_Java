package staitckeyword;

public class StaticExample5 {
	int rollno;
	static int id=0;
	String name;
	public StaticExample5(String name){
		rollno=++id;
		this.name=name;
	}
	public void display(){
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("Total object:"+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample5 st1=new StaticExample5("Ritu");
		st1.display();
		StaticExample5 st2=new StaticExample5("Reema");
		st2.display();
	}

}
