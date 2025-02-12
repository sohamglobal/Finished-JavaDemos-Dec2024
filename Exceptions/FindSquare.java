import java.util.*;

class FindSquare
{
public static void main(String args[])
{
int n,sq;
Scanner sc=new Scanner(System.in);

System.out.print("Enter a number ");
try
{
n=sc.nextInt();
}
catch(InputMismatchException e)
{
System.out.println("invalid input...");
n=0;
}

sq=n*n;
System.out.println("Square is "+sq);
}
}