import java.util.List;


public class Questions {
	private String ques;
	private List<String> options;
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
		public void display(){
			System.out.println(ques);
			for(String opt : options){
				System.out.println(opt);
			}
		}
}
