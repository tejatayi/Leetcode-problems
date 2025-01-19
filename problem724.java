//724. Find Pivot Index


public class problem724 {

    public static int pivotIndex(int[] nums) {

        int ans=-1;

        for (int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i-1]+nums[i];
        }

        
        for(int i=0;i<nums.length;i++)
        {
        
           
            int lsum=(i==0)? 0 : nums[i-1];         //(condition) ? (expressionifTrue) : (expressionifFalse)
            int rsum=nums[nums.length-1]-nums[i];

            

            if(lsum==rsum)
            {
                return i;
            }

            
        }

        return ans;
    }


    public static void main(String[] args) {
        
        int [] a = {2,1,-1};


        System.out.println(pivotIndex(a));


    }
    
}
