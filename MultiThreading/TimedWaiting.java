class MyThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("welcome to multithreading");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("thread is interrupted");
            }
        }
        System.out.println("Thread is terminated");
    }
}

class TimedWaiting
{
    public static void main(String args[])
    {
        MyThread t1=new MyThread();
        t1.start();
    }
}

