import java.util.Scanner;

class TwoDManipulate
{
    public static void main(String args[])
    {
        int arr[][]=new int[3][4];
        int i,j,sum=0;
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter 12 values - ");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        //to print column-wise sum of elements
        for(i=0;i<=3;i++)
        {
            for(j=0;j<=2;j++)
            {
                sum+=arr[j][i];
            }
            System.out.println("Column sum is "+sum);
            sum=0;
        }


    }
}