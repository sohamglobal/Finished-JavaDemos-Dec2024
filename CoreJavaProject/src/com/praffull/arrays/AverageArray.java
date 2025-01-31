import java.util.*;

class AverageArray
{
    public static void main(String args[])
    {
        int mks[]=new int[10];
        int i,sum=0;
        double avg;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter marks of 10 students - ");
        for(i=0;i<=9;i++)
        {
            mks[i]=sc.nextInt();
            sum+=mks[i];
        }
        //System.out.println("sum is "+sum);
        avg=sum/10;
        System.out.println("Average is "+avg);

    }
}