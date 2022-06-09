package Arrays;


public class ArrayExample9 {
    public static void printElements(int list[])
    {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public static void main(String[] args) {
        
        int []arr={1,2,3};
        System.out.println("First Array");
        printElements(arr);
        int []arr2={9,8,7,6,5,4,3};
        System.out.println("Second Array");
      printElements(arr2);
    }
}
