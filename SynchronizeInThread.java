// Synchronize keyword in thread

public class SynchronizeInThread
{
    public static void main(String[] args) throws InterruptedException 
    {
        Count c = new Count();

        Runnable obj1 = ()->
        {
            for(int i = 0;i < 10000;i++)
            {
                c.incre();
            }
        };

        Runnable obj2 = ()->
        {
            for(int i = 0;i < 10000;i++)
            {
                c.incre();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
        // After the full completion of thread work then will be after programs are executes (.join())
        t1.join();
        t2.join();

        System.out.println(c.a);
    }
}

class Count
{
    int a;
    // Sysnchronized is use to the process that allows only one thread at a particular time to complete a given task entirely
    public synchronized void incre()
    {
        a++;
    }
}