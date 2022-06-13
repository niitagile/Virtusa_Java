package staitckeyword;

class staticexample2{ 
	int rollno; 
	String name; 
	static String college ="ITS"; 
	
	staticexample2(int r,String n){ 
	rollno = r; 
	name = n; 
	} 
	void display (){System.out.println(rollno+" "+name+" "+college);} 
	
	public static void main(String args[]){ 
	staticexample2 s1 = new staticexample2(111,"Karan"); 
	staticexample2 s2 = new staticexample2(222,"Aryan"); 

	s1.display(); 
	s2.display(); 
	} 
} 
