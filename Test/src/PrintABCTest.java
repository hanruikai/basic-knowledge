
public class PrintABCTest
{
    
    public static void main(String[] args)
    {
        
        Thread threadA=new Thread(new OutputRunnable(0,"A"));
        Thread threadB=new Thread(new OutputRunnable(1,"B"));
        Thread threadC=new Thread(new OutputRunnable(2,"C"));
        threadA.start();
        threadB.start();
        threadC.start();
        
    }
}
