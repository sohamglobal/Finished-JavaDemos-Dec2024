import java.util.Scanner;

class DigSum2D
{
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{4,8,6},{7,8,9}};
        int i,sum=0;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<=2;i++)
        {
            sum+=arr[i][i];
        }

        System.out.print("sum is "+sum);

    }
}
