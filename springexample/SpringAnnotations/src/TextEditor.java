import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	
	private SpellChecker sp;
	
	private String sname;
	

	public TextEditor() {
		super();
	}
	@Autowired
	public TextEditor(SpellChecker sp) {
		super();
		this.sp = sp;
	}
	public void spellCheck(){
		sp.checkSpelling();
	}
	
	public void setSp(SpellChecker sp) {
		this.sp = sp;
	}
	
	public String getSname() {
		return sname;
	}
	@Required
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
