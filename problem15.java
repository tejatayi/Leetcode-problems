// 15.3 sum

import java.util.*;

class Problem15{

  

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        Map<Integer,Integer> x= new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            x.put(nums[i], i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            
            if(i>1 && nums[i-1]==nums[i])
            continue;
            int c = nums[i];
            int target = 0-c;

            for(int j=i+1;j<nums.length;j++)
            {   
                if(j>i+1 && nums[j]==nums[j-1])
                continue;
                int temp= target- nums[j];
                if(x.containsKey(temp) && x.get(temp)>j)
                {
                    List<Integer> last = new ArrayList<>();
                    last.add(nums[i]);
                    last.add(nums[j]);
                    last.add(temp);
                    //ans.add(last);
                    set.add(last);
                }
            }
           
            
        }
        ans.addAll(set);


        return ans;
    }





    public static void main(String[] args)
    {
        
        int []n={0,0,0,0,0,0};

        List<List<Integer>> x=threeSum(n);
        
        for(List<Integer>mylist : x)
        {
            for(Integer i : mylist)
            {
                System.err.print(i+",");
            }
            System.err.println();
        }
        

       
       
        return;
    }
}