package Classes;

public class StaticBlockExample {

	 static{
		System.out.println("static Block");
	}
	{
		System.out.println("Initializer Block");
	}
		
			public static void main(String[] args) {
			// TODO Auto-generated method stub
				
				StaticBlockExample st=new StaticBlockExample();
				
				StaticBlockExample st1=new StaticBlockExample();
				StaticBlockExample st2=new StaticBlockExample();
				StaticBlockExample st3=new StaticBlockExample();
				
		}

}
