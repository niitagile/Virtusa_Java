package staitckeyword;

public class block_example {
	block_example(){
		System.out.println("Constructor");
	}
	{	
		System.out.println("Initializer Block");
	}
	static{
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		block_example obj1=new block_example();
		block_example obj2=new block_example();

	}

}
