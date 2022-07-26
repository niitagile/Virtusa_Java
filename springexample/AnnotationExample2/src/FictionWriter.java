import org.springframework.stereotype.Component;


@Component
public class FictionWriter implements Award{

	@Override
	public void award() {
		// TODO Auto-generated method stub
		System.out.println("Fiction Writing award");
		
	}
	
	

}
