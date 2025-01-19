//1493. Longest Subarray of 1's After Deleting One Element


// this is the same problem as problem1004 . go through the questions of both and analze , just a little moddification

public class problem1493 {
    public static int longestSubarray(int[] nums) {

//--------------------------------------- modified / added code-----------------------        
        int k=1;

        if(nums.length==1)
        return 0;

//-------------------------------------------------------------

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



        return max-1;  //modified  from "return max" to "return max-1"
    }

    public static void main(String[] args) {
        
        int [] a = {1,1,0,1};
        

        System.out.println(longestSubarray(a));


    }


}



