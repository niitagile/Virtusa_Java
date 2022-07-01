package IO_Classes_New;
import java.io.*;

public class PushbckExample {

   public static void main(String[] args) {
      String s = "Hello World";
      // create a new StringReader
      StringReader sr = new StringReader(s);
      // create a new PushBack reader based on our string reader
      PushbackReader pr = new PushbackReader(sr, 20);
      try {
         // read the first five chars
         for (int i = 0; i < 5; i++) {
            char c = (char) pr.read();
            System.out.print("" + c);
            // skip a character every time
            pr.skip(1);
         }
         // change line
         System.out.println();
         // close the stream
         pr.close();

      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}
