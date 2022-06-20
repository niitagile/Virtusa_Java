package collections;

class Employee1 implements Comparable<Integer>
{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

@Override
	
	public int compareTo(Integer arg0) {   
		// TODO Auto-generated method stub
		return this.age-arg0;
	}
}
public class JavaComparableExample
{
	  public static void main(String args[])	
		 {
			Employee1 e1 = new Employee1();
			e1.setAge(40);
			Employee1 e2 = new Employee1();
			e2.setAge(130);

			if( e1.compareTo(e2.getAge()) > 0 ) 
				{System.out.println("Employee one is elder than employee two !");
				} 
			else if( e1.compareTo(e2.getAge()) < 0 ) 
				{System.out.println("Employee one is younger than employee two !");
				} 
			else if( e1.compareTo(e2.getAge()) == 0 ) 
				{System.out.println("Both employees are same !");
				} 
		}
}


/*
	Signature of compareTo method is.
	public int compareTo(Object object).
	compareTo method should return 0 if both objects are equal,
	1 if first greater than other and -1 if first less than the other object of the same class.
	*/