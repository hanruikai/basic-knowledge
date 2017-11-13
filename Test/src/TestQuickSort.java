public class TestQuickSort
{
    public static void quickSort(int[] r, int low, int high)
    {
        if (low < high)
        {
            int key = partition(r, low, high);
            quickSort(r, low, key);
            quickSort(r, key + 1, high);
        }

    }
    static int  partition(int[] r, int low, int high){
        int key=r[low];
            while (low<high)
            {
                while (low<high&&r[high]>=key)  --high;
                swap(r,low,high);
                while (low<high&&r[low]<=key) ++low;
                swap(r, low, high);
            }
            return low;
    }

    private static void swap(int[] number, int i, int j)
    {
        int t;
        t = number[i];
        number[i] = number[j];
        number[j] = t;
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
        quickSort(R, 0, R.length - 1);
        display(R);
    }

}
