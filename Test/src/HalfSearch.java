
public class HalfSearch
{
    
    public static int halfSearch(int[] arr,int key)
    {
        int max,min,mid;
        max = arr.length - 1;
        min = 0;
        mid = (max+min)/2;

        while(arr[mid] != key)
        {
            if(arr[mid] > key)
                max = mid - 1;
            else if(arr[mid] < key)
                min = mid +1;

            if(min > max)
                return -1;
            mid = (max+min)/2;
        }
        return mid;
    }
    
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,5,8,10,16,22,24,27,30};
        int index = halfSearch(arr,24);
        System.out.println(index);
        
        
    }

}
