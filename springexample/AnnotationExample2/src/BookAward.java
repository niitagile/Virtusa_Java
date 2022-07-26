import org.springframework.stereotype.Component;



@Component
public class BookAward implements Award{

	@Override
	public void award() {
		System.out.println("Book Award is given");
		
	}

}
