//1749. Maximum Absolute Sum of Any Subarray



public class problem1749 {

    public static int maxAbsoluteSum(int[] nums) {
        
    
        int max =0;
        int min = 0 , sum =0;

        for(int i=0;i<nums.length;i++)
        {
         sum+=nums[i];
         max=Math.max(max, sum);
         min=Math.min(min, sum);
        }

  

      return Math.abs(max-min);

        
    }




    public static void main(String[] args) {
    
        int [] a = {-3,-5,-3,-2,-6,3,10,-10,-8,-3,0,10,3,-5,8,7,-9,-9,5,-8};

        System.out.println(maxAbsoluteSum(a));

    }
    
}
