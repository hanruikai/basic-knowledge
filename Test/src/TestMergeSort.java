
public class TestMergeSort
{
    public static void merge(int[] a, int low, int mid, int high)
    {
        int[] temp = new int[high - low + 1];
        int i = low;//left pointer
        int j = mid + 1;//right pointer
        int k = 0;
        //move smaller element to new array
        while (i <= mid && j <= high)
        {
            if (a[i] < a[j])
            {
                temp[k++] = a[i++];
            }
            else
            {
                temp[k++] = a[j++];
            }
        }
        // left on left side
        while (i <= mid)
        {
            temp[k++] = a[i++];
        }
        //left on right
        while (j <= high)
        {
            temp[k++] = a[j++];
        }
        //copy to old array 
        for (int k2 = 0; k2 < temp.length; k2++)
        {
            a[k2 + low] = temp[k2];
        }
    }

    static void mergeSort(int[] r, int low, int high)
    {

        if (low < high)
        {
            int mid = (low + high) / 2;
            mergeSort(r, low, mid);
            mergeSort(r, mid + 1, high);
            merge(r, low, mid, high);
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
        mergeSort(R, 0, R.length - 1);
        display(R);
    }
}
