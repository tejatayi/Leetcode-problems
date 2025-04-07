//209 . Minimum Size Subarray Sum

public class problem209 {
 
    public static int minSubArrayLen(int target, int[] nums)    
    {
        int l=0;
        int len = nums.length;
        int min= len+1;
        int sum =0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
           // System.out.println(sum);
            while (sum >= target) {
                min = Math.min(min, r - l + 1);
                sum -= nums[l];
                l++;

                //System.out.println(min);
            }
        }

        return (min == len+1) ? 0 : min;
    }


    public static void main(String[] args) {
        int [] a= {2,3,1,1,1,1,1};

        System.out.println(minSubArrayLen(5, a));
        

    }
}
