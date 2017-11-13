
public class Test
{
    public static void main(String[] args)
    {
        
        Integer  a=100;
        Integer b=100;
        Integer c=new Integer(100);
        Integer d=new Integer(100);
        System.out.println(a==b);//true
        System.out.println(c==d);//false
        
        String  e="a";
        String f="a";
        String i=new String("a");
        String j=new String("a");
        System.out.println(e==f);//true
        System.out.println(i==j);//false
        
        Integer  f1=127,f2=127,f3=128,f4=128;
        System.out.println(f1==f2);//true
        System.out.println(f3==f4);//false
        System.out.println(-f1==-f2);//true
        System.out.println(-f3==-f4);//t
        
    }
}
