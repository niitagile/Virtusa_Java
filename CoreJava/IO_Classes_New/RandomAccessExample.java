package IO_Classes_New;

import java.io.*;
public class RandomAccessExample 
{
  public static void main(String args[])
  {
	RandomAccessFile file=null;
	try
	{
	/* Opens the file in read/write mode */
	file=new RandomAccessFile("abc.txt","rw");	
	file.writeInt(85);
	file.writeInt(5);
	file.writeChar('V');
	file.seek(0);
	System.out.println(file.readInt());
	System.out.println(file.readInt());
	System.out.println(file.readChar());
	
	//file.seek(file.length()); place the curson at end
	/*System.out.println("end of cursor");
	file.writeBoolean(true);
	file.writeInt(35);
	//file.seek(0); /* Places the file pointer at the beginning of file */
	//file.seek(5);
	/*System.out.println(file.readInt());
	System.out.println(file.readInt());
	System.out.println(file.readChar());
	//file.seek(5);
	System.out.println(file.readBoolean());
	int n;
	System.out.println((int)file.read());*/
	file.close();
	} catch(IOException e)
	{
	System.out.println("Exception: " +e);
 	}
      }  
}  