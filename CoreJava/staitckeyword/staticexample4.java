package staitckeyword;

class staticexample4{ 
static int count=0;//will get memory only once and retain its value 
	staticexample4(){ 
	count++; 
	System.out.println(count); 
	} 
	public static void main(String args[]){ 
	staticexample4 c1=new staticexample4(); 
	staticexample4 c2=new staticexample4(); 
	staticexample4 c3=new staticexample4(); 
	} 
	} 
