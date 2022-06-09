package Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int a[]=new int[10];
        int i;
        for(i=0;i<a.length;i++)
        {
            a[i]=i+1;
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
