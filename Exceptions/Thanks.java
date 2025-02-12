class Thanks
{
public static void main(String args[])
{
String nm;
try
{
nm=args[0];
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("No name received...");
nm="unknown user";
}
System.out.println("Thanks "+nm+" for joining us");
}
}