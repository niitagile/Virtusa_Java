package Arrays;

public class ArrayExample7 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{9,8,7},{4,5,6}};
        int i,j;
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
