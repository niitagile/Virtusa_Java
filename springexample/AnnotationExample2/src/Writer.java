import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class Writer {
	@Autowired
	@Qualifier("fiction")
	private Award award; 
	
	public void getAward(){
		award.award();
	}
}
