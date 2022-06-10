package Imp_Classes;
class Bank extends Object{

	@Override
	public String toString(){
		return "Bank Management system";
	}
	
}
public class ObjectClass_toString {

	public static void main(String[] args) {
		Bank obj=new Bank();
		Bank obj1=obj;
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj.equals(obj1));
		System.out.println(obj.getClass());
		
		

	}

}
