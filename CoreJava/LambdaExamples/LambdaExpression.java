package LambdaExamples;
@FunctionalInterface
interface Shape{
	 void draw();
	 
}
interface Shape1{
	void display();
}
/*class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("area of rectangle is L*B");
	}
	
}*/
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*Shape s=new Rectangle();
			s.draw();*/
			
			//Lambda Expression
				
		
			Shape s1=()-> System.out.println("area of rectangle is L*B");
			s1.draw();
			
	}

}
