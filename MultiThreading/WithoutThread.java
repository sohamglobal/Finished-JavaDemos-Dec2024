class Praffull
{
    public void show()
    {
        for(int i=1;i<=25;i++)
        System.out.println("Hello from Praffull "+i);
    }
}

class Sharayu
{
    public void display()
    {
        for(int i=1;i<=15;i++)
        System.out.println("Bye from Sharayu "+i);
    }
}

class WithoutThread
{
    public static void main(String args[])
    {
        Praffull p=new Praffull();
        Sharayu s=new Sharayu();
        p.show();
        s.display();
    }
}