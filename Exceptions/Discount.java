class Discount
{
public static void main(String args[])
{
double amount,discount;

try
{
amount=Double.parseDouble(args[0]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Please pass amount...");
amount=0;
}
catch(NumberFormatException e)
{
System.out.println("Amount must be numeric...");
amount=0;
}

if(amount>5000)
discount=amount*13/100;
else
discount=amount*9/100;

System.out.println("Discount is "+discount);
}
}