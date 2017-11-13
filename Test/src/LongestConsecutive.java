import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive
{
    Map<Integer,Integer>   map=new HashMap<>();
    
    public  int longestConsecutive(int[] r){
        int res=0;
        for (int i : r)
        {
            int left=(map.containsKey(i-1))?map.get(i-1):0;
            int right=(map.containsKey(i+1))?map.get(i+1):0;
            int sum=left+right+1;
            map.put(i, sum);
            res=Math.max(res,sum);
            //{5=1, 6=3, 71=1, 7=1, 88=1, 90=1}  not update neighbors, the count will be wrong when 8 is put. because sum for 7 is not right 
            //extend to boundary of the sequence. pay attention. it is i-left and i+right. 
            map.put(i-left, sum);
            map.put(i+right, sum);
        }
        return res;
        
    }
    
    
    
    public static void main(String[] args)
    {
        int[] r = { 71, 88, 90, 7, 5, 6, 63, 74, 89, 8 };
        System.out.println(new LongestConsecutive().longestConsecutive(r));
        
    }
}
