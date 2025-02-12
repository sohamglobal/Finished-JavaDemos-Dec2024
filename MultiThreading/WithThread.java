class Praffull extends Thread
{
    public void run()
    {
        for(int i=1;i<=25;i++)
        System.out.println("Hello from Praffull "+i);
    }
}

class Sharayu extends Thread
{
    public void run()
    {
        for(int i=1;i<=15;i++)
        System.out.println("Bye from Sharayu "+i);
    }
}

class WithThread
{
    public static void main(String args[])
    {
        Praffull p=new Praffull();
        Sharayu s=new Sharayu();
        p.start();
        s.start();
    }
}