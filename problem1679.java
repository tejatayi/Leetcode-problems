//1679. Max Number of K-Sum Pairs


import java.util.HashMap;
import java.util.Map;

public class problem1679 {
    
    public static int maxOperations(int[] nums, int k) {
        
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {   
            
            if(nums[i]<=k)
           {
            //map.merge(nums[i], 1, Integer::sum); //can use any of the 2 implementaions
             map.merge(nums[i], 1, (existingValue,newValue)->existingValue+newValue);
            }
        }
        int ans=0;
        
        for(Map.Entry<Integer,Integer> m : map.entrySet())
        {
            int tem = m.getKey();
            int find = k-tem;
            int v1 = m.getValue();
            int v2 = map.getOrDefault(find, 0);
            
            if (tem == find) {
                ans += v1 / 2;
            } else {
                ans += Math.min(v1, v2);
            }
            

            m.setValue(0);
            map.replace(find, 0);

        }

        return ans;
    }



    public static void main(String[] args) {
        
        int [] a = {3,1,3,4,3};
        int k=6;

        System.out.println(maxOperations(a, k));

    }
}
