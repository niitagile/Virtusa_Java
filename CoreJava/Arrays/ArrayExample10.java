
public class p16 {
    public void printElements(int []list)
    {
        for (int ele:list) {
            System.out.println(ele);
        }
    }
    public static void main(String[] args) {
        p16 obj=new p16();
        int []arr={1,2,3};
        System.out.println("First Array");
        obj.printElements(arr);
        int []arr2={9,8,7,6,5,4,3};
        System.out.println("Second Array");
        obj.printElements(arr2);
    }
}
