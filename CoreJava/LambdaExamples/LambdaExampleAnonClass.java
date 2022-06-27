package LambdaExamples;
/* interface Shape{
 * void draw();
 * 
 * }
 */
public class LambdaExampleAnonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Shape s=new Shape(){
				public void draw() {
					// TODO Auto-generated method stub
					System.out.println("area of rectangle is L*B");
				}
			};
			s.draw();
			
			//Lambda expression
			Shape shape= ()->	System.out.println("area of rectangle is L*B");
			
			shape.draw();
			
	}

}
