package staitckeyword;

class staticexample3{ 
int count=0; 
	static int num=0;//will get memory only once and retain its value
	staticexample3(){ 
	count++; 
	num++;
	System.out.println("count="+count);
	System.out.println("num="+num);
	
	} 
	
public static void main(String args[]){ 
	
	staticexample3 c1=new staticexample3();//count=1 
	staticexample3 c2=new staticexample3(); //count=1
	staticexample3 c3=new staticexample3(); //count=1
	//num=3
	} 
} 
