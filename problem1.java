// 1.two sum

import java.util.*;

class Problem1{

  
    public static int[] twoSum(int[] nums, int target) {

        HashMap <Integer,Integer> x = new HashMap<>();
        int[] ans= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            x.put(nums[i],i);
        }
        System.out.println(x);

        for(int i=0;i<nums.length;i++)
        {
            int temp = target-nums[i];

            if(x.containsKey(temp))
            {   
                if(x.get(temp)!= i)
                {
                    ans[1]=x.get(temp);
                    ans[0]=i;
                    return ans;
                }
            }
            
        }

        

        return ans;

    }





    public static void main(String[] args)
    {
        
        int []n={-1,-2,-3,-4,-5};

        int [] a= (twoSum(n,-8));

        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
       
        return;
    }
}