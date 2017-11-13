
public class TestShellSort
{
    
    static  void testShellSort(int[] r){
        int gap=r.length/2;
        while (gap>0)
        {
            for(int i=gap;i<r.length;i+=gap)
            {
                int key=r[i];
                int j=i-gap;
                for(;j>-1&&r[j]>key;j-=gap)
                {
                    r[j+gap]=r[j];
                    
                }
                r[j+gap]=key;
                
            }
            gap=gap/2;
            
        }
        
    }
    
    
    
    public static void display(int[] R)
    {
        System.out.println();
        for (int i = 0; i < R.length; i++)
        {
            System.out.print(R[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] R = { 71, 88, 93, 77, 5, 16, 63, 74, 89, 18 };
        display(R);
        testShellSort(R);
        display(R);
    }
}
