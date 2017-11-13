package com.polycom.concurrent;

public class App
{

    
    public static void main(String[] args) throws InterruptedException
    {
        
        Client client=new Client();
        new Thread(){

            @Override
            public void run()
            {
                Data data=client.request();
            }
            
            
        }.start();
       
        
    }
}
