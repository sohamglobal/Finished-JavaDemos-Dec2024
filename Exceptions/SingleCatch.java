class SingleCatch
{
public static void main(String args[])
{
double amount,discount;

try
{
amount=Double.parseDouble(args[0]);
}
catch(Exception e)
{
System.out.println("Please pass numeric amount...");
amount=0;
}

if(amount>5000)
discount=amount*13/100;
else
discount=amount*9/100;

System.out.println("Discount is "+discount);
}
}