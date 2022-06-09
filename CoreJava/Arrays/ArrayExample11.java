package Arrays;
public class ArrayExample11{
    public int sumElements(int []arr)
    {
        int sum=0;
        for (int x:arr) {
            sum=sum+x;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayExample11 obj=new ArrayExample11();
        int []arr={1,2,3};
        int res=obj.sumElements(arr);
        System.out.println(res);
    }
}
