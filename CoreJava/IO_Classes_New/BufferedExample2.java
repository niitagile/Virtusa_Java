package IO_Classes_New;
import java.io.*;
public class BufferedExample2 {
    public static void main(String[] args) {
        try {
        	//FileReader br = new FileReader("E:"+File.separator+"b1"+"register.txt");
            FileReader fr=new FileReader("E:\\register.txt");
            BufferedReader br=new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null)
            {
                System.out.println(s);
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
