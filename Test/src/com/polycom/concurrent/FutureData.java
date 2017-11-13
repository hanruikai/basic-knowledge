package com.polycom.concurrent;

public class FutureData implements Data
{
   private RealData realData;
    
   private boolean isReady;
    @Override
    public synchronized String getResult()
    {
        if (!isReady)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                throw new UnsupportedOperationException("Unexpected Exception", e);
                
            }
        }
        return realData.getResult();

    }


    @Override
    public synchronized void setResult(RealData data)
    {
        if (isReady)
        {
            return;
        }
        this.realData=data;
        isReady=true;
        notifyAll();
    }

}
