class Praffull implements Runnable
{
    public void run()
    {
        for(int i=1;i<=25;i++)
        System.out.println("Hello from Praffull "+i);
    }
}

class Sharayu implements Runnable
{
    public void run()
    {
        for(int i=1;i<=15;i++)
        System.out.println("Bye from Sharayu "+i);
    }
}

class WithRunnable
{
    public static void main(String args[])
    {
        Praffull p=new Praffull();
        Thread t1=new Thread(p);

        Sharayu s=new Sharayu();
        Thread t2=new Thread(s);
        
        t1.start();
        t2.start();
    }
}