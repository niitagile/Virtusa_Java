package multithreading_new;

import java.util.ArrayList;



public class SyncExample2 {
	public static void main(String[] args) {
		Board board=new Board();
		TeacherThread t1=new TeacherThread(board);
		StudentThread s1=new StudentThread(board);
		
		t1.start();
		s1.start();
	}
}

class TeacherThread extends Thread{
	Board board;
	String teachernames[]={"Mrs Mamta", "Mr Bipin", "Miss Komal"};
	TeacherThread(Board board){
		this.board=board;
	}
	
	public void run(){
		board.print(teachernames);
	}
}

class StudentThread extends Thread{
	Board board;
	String studentnames[]={"Nisha", "Nilesh", "Nitin", "Niranjan"};
	StudentThread(Board board){
		this.board=board;
	}
	
	public void run(){
		board.print(studentnames);
	}
}

class Data{
	ArrayList<Integer> marks=new ArrayList<>();
	synchronized void setValues(){
		for(int i=0;i<5;i++){
			marks.add(i+1);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}