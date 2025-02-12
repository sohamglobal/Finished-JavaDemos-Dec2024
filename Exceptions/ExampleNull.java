class ExampleNull
{
    public static void main(String args[])
    {
        String nm=null;
        try
        {
        System.out.println(nm.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Object is null...cant run function");
        }
    }
}