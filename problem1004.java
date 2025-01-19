//1004. Max Consecutive Ones III

public class problem1004 {
    

    public static int longestOnes(int[] nums, int k) {
        
        if(k>=nums.length)
        return nums.length;

        int c0=0;
        int start =0, end=0;
        int max=0;


        while(end<nums.length)
        {
            if(nums[end]==0)
            {
                c0++;
            }
            

            if(c0>k)
            {
                while(c0>k && start<nums.length)
                {
                    if(nums[start]==0 && c0>k)
                    {
                        c0--;
                    }

                    
                    start++;
                    
                }
            }

           // System.out.println("start :"+start+" end:"+end);

            if((end-start+1)>max)
            max=(end-start)+1;

            end++;
        }



        return max;
            
    }



    public static void main(String[] args) {
        
        int [] a = {0,0,1,1};
        int k = 1;

        System.out.println(longestOnes(a,k));


    }
}
