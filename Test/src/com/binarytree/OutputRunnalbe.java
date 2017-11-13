package com.binarytree;

public class OutputRunnalbe implements Runnable
{

    private int num;
    private Object lock;

    public OutputRunnalbe(int num, Object lock)
    {
        super();
        this.num = num;
        this.lock = lock;
    }

    @Override
    public void run()
    {
        while(true)
        {
            synchronized(lock)
            {
                try
                {
                    lock.notifyAll();
                    lock.wait();
                    System.out.println(num);
                }
                catch (InterruptedException e)
                {
                    throw new UnsupportedOperationException("Unexpected Exception", e);
                    
                }
                
            }
            
        }

    }

}
