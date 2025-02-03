//3105. Longest Strictly Increasing or Strictly Decreasing Subarray
public class problem3105 {
    public static int longestMonotonicSubarray(int[] nums) {
        
        if(nums.length==1)
        return 1;

        int c=1;
        int c1=1;
        
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {   
                c++;
            }
            else
            {
                c=1;
            }

            if(nums[i]<nums[i-1])
            {
                c1++;
               
            }
            else
            {
                c1=1;
            }
            max=Math.max(max,Math.max(c1,c));
        }

       

        return max;
    }

    public static void main(String[] args) {
        int [] a = {1,10,10};

        System.out.println(longestMonotonicSubarray(a));
    }
}
