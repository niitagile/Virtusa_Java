
public class TextEditor {
	private SpellChecker sp;
	
	

	public TextEditor() {
		super();
	}
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
	
	
	
}
