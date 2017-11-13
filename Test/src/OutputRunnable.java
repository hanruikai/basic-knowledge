
public class OutputRunnable implements Runnable
{

    private int sequence;//0,1,2,thread flag to indicate the sequence
    
    private String value;

    static  Object lock=new Object();//must be static, or not same object
    
    static volatile int state; //must be static, or state change will not be visible for other threads
    
    
    public OutputRunnable(int sequence,String value)
    {
        super();
        this.sequence=sequence;
        this.value = value;
    }



    @Override
    public void run()
    {
        
        for (int i = 0; i < 10; i++)
        {
            synchronized(lock)
            {
                while (state%3!=sequence)  //while,not if, result is not correct
                {
                    try
                    {
                        lock.wait();
                    }
                    catch (InterruptedException e)
                    {
                        throw new UnsupportedOperationException("Unexpected Exception", e);
                        
                    }
                }
                System.out.print(value);
                state++;
                lock.notifyAll();
            }
             
        }
    }

}
