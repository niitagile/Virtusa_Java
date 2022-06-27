package LambdaExamples;

import java.util.ArrayList;
import java.util.List;

public class lambdaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("ankita");
		list.add("Komal");
		list.add("Leena");
		/*for(String s:list){
			System.out.println(s);
		}*/
		list.forEach(s->System.out.println(s));

	}

}
/*Runnable r2=()->{};
Thread t=new Thread(r2);
t.start();*/