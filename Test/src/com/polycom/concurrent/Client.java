package com.polycom.concurrent;

public class Client
{
    private Data futureData=new FutureData();
    
    public Data request(){
        
        new Thread(){

            @Override
            public void run()
            {
                RealData realData=new RealData("aa");
                futureData.setResult(realData);
                
                
            }
            
            
        }.start();
        return futureData;
        
    }

}
