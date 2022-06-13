package inheritence;
class Parent{
	Parent(int a){
		
		System.out.println("Parent class constructor");
	}
	/*Parent(){
		System.out.println("Parent constructor");
	}*/
}
class Child extends Parent{
	Child(){
		super(5);
		System.out.println("Child class constructor");
		
	}
	/*Child(){
		System.out.println("Child cosntructor");
	}*/
}
public class ParentConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
	
	}

}
