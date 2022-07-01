package IO_Classes_New;
import java.io.*;
public class FileWriterExample{
public static void main(String args[])  {


 	try {
 		FileWriter f =new FileWriter("D:\\register.txt");
		f.write("This is my new file");
		f.write("We are learning about IO");
		f.close();
		
		FileReader fr =new FileReader("D:\\register.txt");
		
		int ch;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}
		
		
		
		fr.close();
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
 

 }}
