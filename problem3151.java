//3151. Special Array I

public class problem3151 {
    

    public static boolean isArraySpecial(int[] nums) {
    
        if(nums.length==1)
        return true;
    
    
            for(int i=0;i<nums.length-1;i++)
            {
                if((nums[i]%2==0 && nums[i+1]%2==0) || (nums[i]%2!=0 && nums[i+1]%2!=0))
                {
                        return false;
                }
            }
    
            return true;
        }


        public static void main(String[] args) {
            int [] a ={4,3,1,6};
            System.out.println(isArraySpecial(a));
        }

}
