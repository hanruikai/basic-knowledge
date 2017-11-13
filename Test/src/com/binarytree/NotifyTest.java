package com.binarytree;

public class NotifyTest
{

    
    public static void main(String[] args)
    {
        Object lock=new Object();
        Thread thread=new Thread(new OutputRunnalbe(1, lock));
        Thread thread2=new Thread(new OutputRunnalbe(2, lock));
        thread.start();
        thread2.start();
        
    }
}
