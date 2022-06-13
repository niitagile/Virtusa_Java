package p1;
public class A
{
	private int pri_n;
	public void setA(int num)
	{
		pri_n=num;
	}
	public int getA()
	{
		return pri_n;
	}

	int n;
	protected int pro_n;
	public int pub_n;
	public static void main(String []args)
	{
		A obj=new A();
		obj.pri_n=1;
		obj.n=2;
		obj.pro_n=3;
		obj.pub_n=4;
		System.out.println("private = "+obj.pri_n);
		System.out.println("default = "+obj.n);
		System.out.println("protected = "+obj.pro_n);
		System.out.println("public = "+obj.pub_n);
	}
}

