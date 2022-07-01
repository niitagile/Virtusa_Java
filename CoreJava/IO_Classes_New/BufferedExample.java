package IO_Classes_New;
import java.io.*;
public class BufferedExample {
	
		  public static void main(String[] argv) throws IOException {
		    BufferedReader br = new BufferedReader(
		    		new FileReader("D:"+File.separator+"register.txt"));
		    
		   
		    
		    
		    BufferedWriter bw = new BufferedWriter(
		    		new FileWriter("D:"+File.separator+"out.txt"));
		    int i;
		   do{	    
		      i = br.read();  
		      if (i != -1) {
		       
		          bw.write((char) i);
		      }
		    } while (i != -1);
		    br.close();
		    bw.close();
		    
		    
		    BufferedReader br1 = new BufferedReader(new FileReader("D:"+File.separator+"out.txt"));
		    do{	    
			      i = br1.read();
			      if (i != -1) {
			       
			         System.out.print((char) i);
			      }
			    } while (i != -1);
		  
		  br1.close();
		}}


