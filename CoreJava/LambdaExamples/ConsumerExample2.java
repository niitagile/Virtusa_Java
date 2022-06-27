package LambdaExamples;
import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

//default Consumer <T> andThen(Consumer<? super T> after)
public class ConsumerExample2 {

	public static void main(String[] args) {
		//Consumer to multiply every value with 2
		Consumer<List<Integer>> modify= list ->{
			
			for(int i=0;i<list.size();i++){
				list.set(i,2*list.get(i));
			}	
		};
		
		//Consumer to display list
		Consumer<List<Integer>> displayList=list-> list.forEach(s->System.out.println(s));
				
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);
		
		
		
		//use addThen()
		modify.andThen(displayList).accept(list);

	}

}


