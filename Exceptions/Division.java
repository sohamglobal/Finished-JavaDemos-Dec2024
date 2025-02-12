import java.util.*;

class Division
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x,y,res;

System.out.print("Enter first number : ");
x=sc.nextInt();
System.out.print("Enter second number : ");
y=sc.nextInt();

try
{
res=x/y;
}
catch(ArithmeticException e)
{
System.out.println("cant divide by zero..dividing by 1");
y=1;
res=x/y;
}


System.out.println("Result of division is "+res);
}
}