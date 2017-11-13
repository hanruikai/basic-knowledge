
public class CountSort
{

    static  int[] countSort(int[] a,int k){
        //k max element in array a
        // the value of the element in a  server as the index for c , the key point
        int[] c=new int[k];
        for (int i = 0; i < a.length; i++)
        {
            c[a[i]]++;//same element in a will count the same element in c array
        }
        // from 1,not 0
        for (int i = 1; i <k; i++)
        {
            c[i]+=c[i-1];
        }
        int[] b=new int[a.length];
        for (int i=a.length-1; i >-1; i--)
        {
            //-- operation is to process the duplicate element, the value in array is changed. pay attention 
            b[--c[a[i]]]=a[i];
        }
        return b;
    }
    
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
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
        int[] r = { 2,3,1,5,1,6,9,9 };
        display(r);
        int k=getMax(r)+1;
        int[] b=countSort(r,k);
        display(b);
    }
}
