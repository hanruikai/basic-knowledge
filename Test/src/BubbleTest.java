public class BubbleTest
{
    
    public static  void  bubbleSort(int a[]){
        boolean flag=true;
        for (int i = 0; i < a.length-1&&flag; i++)
        {
            flag=false;
            for (int j = 0; j < a.length-1-i; j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp=a[j]; a[j]=a[j+1];a[j+1]=temp;
                    flag=true;
                }
                
            }
            
        }
    }
    public static void main(String[] args)
    {
        int a[]={31,2,26,9,100,87,4,16};
        bubbleSort(a);
        for (int i : a)
        {
            System.out.println(i);
        }
    }

}
