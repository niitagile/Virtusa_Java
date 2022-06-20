package Abstraction;
//in interface all members are public, methods abstarct, variables are final static
interface Project{
	int MAXTIME=10;
	void requirements();
	void analysis();
}
interface Testing{
	
}
/*interface Project{
	public static final int MAXTIME=10;
	public abstract void requirements();
	public abstract void analysis();
}
 * 
 */

class Website implements Project,Testing{

	@Override
	public void requirements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void analysis() {
		// TODO Auto-generated method stub
		
	}
	
}
public class interfaceexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project obj=new Website();
	}

}
