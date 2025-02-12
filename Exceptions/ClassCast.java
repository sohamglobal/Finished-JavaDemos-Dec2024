class ClassCast
{
    public static void main(String args[])
    {
        Object obj="SohamGlobal";
        try
        {
        Integer num=(Integer) obj;
        }
        catch(ClassCastException e)
        {
            System.out.println("Error : "+e.getMessage());
        }


    }
}