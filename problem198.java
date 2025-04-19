//198. House Robber
public class problem198 {
    
    public static int rob(int[] nums) {
        
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        
        nums[1]=Math.max(nums[1], nums[0]);
        for(int i=2;i<nums.length;i++)
        {
            nums[i]=Math.max(nums[i-2]+nums[i], nums[i-1]);
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int [] n = {1,2,3,1};

        System.out.println(rob(n));


    }
}
