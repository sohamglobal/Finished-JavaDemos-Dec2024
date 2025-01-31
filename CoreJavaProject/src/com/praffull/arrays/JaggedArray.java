import java.util.*;
class JaggedArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[5];
        arr[2]=new int[3];

        for(int i=0;i<=2;i++)
        {
            System.out.println("take input for "+arr[i].length+" columns");
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

       System.out.println("values in the jagged array -");

       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
       }

    }
}