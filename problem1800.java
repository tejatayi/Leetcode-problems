//Maximum Ascending Subarray Sum

public class problem1800 {
    
    public static int maxAscendingSum(int[] nums) {
        
        int max =nums[0];
        int c=nums[0];
        for(int i=1;i<nums.length;i++ )
        {
            if(nums[i]>nums[i-1])
            {
                c+=nums[i];
              max=  Math.max(max, c);
            }
            else
            {
                c=nums[i];
            }
        }

        return max;

    }



    public static void main(String[] args) {
        int [] a ={10,20,30,40,50};

        System.out.println(maxAscendingSum(a));
    }
}
