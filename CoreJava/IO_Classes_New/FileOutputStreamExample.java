package IO_Classes_New;

import java.io.*;  
class FileOutputStreamExample{  
  public static void main(String args[]){  
   try{  
     FileOutputStream fout=new FileOutputStream("abc.txt");  
     String s="We are learning java";  
     byte b[]=s.getBytes();//converting string into byte array  
     fout.write(b);  
     fout.close(); 
     
     
     
     FileInputStream fin=new FileInputStream("abc.txt");
     int val,i=0;
    
     //read data till End of File
     while((val=fin.read())!=-1){
    	 	System.out.println((char)val);
    	 	
     }
     fin.close();
    
    // System.out.println("success...");  
    }catch(Exception e){System.out.println(e);}  
  }  
}  
