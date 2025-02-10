//2364. Count Number of Bad Pairs

import java.util.HashMap;

public class problem2364 {
    



    public static long countBadPairs(int[] nums) {
        
        long len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<len;i++)
        {
            
            int tem = nums[i] - i;
            map.merge(tem, 1, Integer::sum);
    
        }
        long ans = (((long)len*(len-1))/2);
        

        for(int m : map.values())
        {
            ans-=((long)m*(m-1))/2;
        }

       


        return ans;

    }


   



    public static void main(String[] args) {
        
        int [] a = {4,1,3,3};

        System.out.println(countBadPairs(a));



    }
}
