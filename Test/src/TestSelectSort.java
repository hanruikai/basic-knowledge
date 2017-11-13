
public class TestSelectSort
{
    
    
    static int  searchMin(int[] r,int low,int high){
        int min=low;
        for(int j=low;j<high;j++)
        {
            if (r[j]<r[min])
            {
                min=j;
            }
            
        }
        return min;
        
    }
    
    static  void testSelectSort(int[] r){
        for (int i = 0; i < r.length-1; i++)
        {
            int key=r[i];
            int min=searchMin(r,i,r.length);
            if (min!=i)
            {
                r[i]=r[min];r[min]=key;
            }
            
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
        testSelectSort(R);
        display(R);
    }
}
