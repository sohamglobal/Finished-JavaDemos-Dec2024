import java.util.*;

class Result
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mks;

        System.out.print("Enter marks out of 100 ");
        try
        {
            mks=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("invalid marks");
            mks=0;
        }
        finally
        {
            System.out.println("thanks");
        }

        if(mks>=35)
        System.out.println("you are pass");
        else
        System.out.println("you are fail");

    }
}