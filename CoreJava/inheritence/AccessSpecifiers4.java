package inheritence;
import p1.A;
class D extends A
{
	
	public static void main(String []args)
	{
		D obj=new D();
	//	obj.pri_n=1;
		obj.setA(10);
	//	obj.n=2;
		obj.pro_n=3;
		obj.pub_n=4;
	//	System.out.println("private = "+obj.pri_n);
		System.out.println("private = "+obj.getA());
	//	System.out.println("default = "+obj.n);
		System.out.println("protected = "+obj.pro_n);
		System.out.println("public = "+obj.pub_n);
	}
}

