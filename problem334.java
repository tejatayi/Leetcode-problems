public class problem334 {

    public static boolean increasingTriplet(int[] nums) {
        
        int fsmall= Integer.MAX_VALUE;
        int ssmall= Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=fsmall)
            fsmall=nums[i];

            if(nums[i]<=ssmall && nums[i]>fsmall)
            {
                ssmall=nums[i];
            }

            if(nums[i]>fsmall && nums[i]>ssmall)
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        int [] a = {5,4,3,2,1};


        System.out.println(increasingTriplet(a));

    }
    
}
