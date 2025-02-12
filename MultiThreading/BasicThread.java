class Sample extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}

class BasicThread
{
    public static void main(String args[])
    {
        Sample s1=new Sample();
        Sample s2=new Sample();
        s1.start();
        s2.start();
    }
}