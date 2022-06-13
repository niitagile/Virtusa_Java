package staitckeyword;
 class Outer{
	 int rollno=89;
	 static class Inner{
		 int num=9;
		 void display(){
			 System.out.println(num);
			 System.out.println("rollno="+new Outer().rollno);
		 }
	 }//static class end
	 void method1(){
		new Inner().display();
		
	 }
 }
public class staticinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Outer.Inner().display();
			//or
			 Outer.Inner obj=new Outer.Inner();
			 obj.display();
	}

}
