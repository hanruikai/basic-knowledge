
public class TestInsertSort
{
    static void InsertSort(int[] r){
        //from elements to be inserted
        for (int i = 1; i < r.length; i++)
        {
            int j = i-1;//j should be here,or r[j+1] can not be reference
            int key=r[i];
            for (; j>-1&&r[j]>key; j--)
            {
               r[j+1]=r[j];
            }
            r[j+1]=key;
            
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
        InsertSort(R);
        display(R);
        
    }

}
