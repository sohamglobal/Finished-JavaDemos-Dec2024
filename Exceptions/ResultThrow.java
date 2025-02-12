import java.util.*;

class ResultThrow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mks;

        System.out.print("Enter marks out of 100 : ");
        try
        {
            mks=sc.nextInt();
            if(mks<0 || mks>100)
            throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println("invalid marks");
            mks=0;
        }
        
        if(mks>=35)
        System.out.println("you are pass");
        else
        System.out.println("you are fail");

    }
}