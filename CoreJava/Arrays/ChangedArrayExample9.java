package Arrays;


public class ChangedArrayExample9 {
    public static void printElements(int []list)
    {
        for (int i = 0; i < list.length; i++) {
            list[i]+=2;
        }
    }
    public static void main(String[] args) {
        
        int []arr={1,2,3};
        System.out.println("First Array");
        printElements(arr);
        for(int i=0;i<arr.length;i++)
        	System.out.println(arr[i]);
    }
}
