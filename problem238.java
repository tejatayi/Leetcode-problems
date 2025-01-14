//238. Product of Array Except Self

public class problem238 {
    public static int[] productExceptSelf(int[] nums) {
    
            int[] ans = new int[nums.length];
            
            for(int i=0;i<ans.length;i++)
            {
                ans[i]=0;
            }
    
            int c=0,p=1,tem=-1;

            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                {
                    p*=nums[i];
                }

                if(nums[i]==0)
                {
                    if(c==0)
                    {   c++;
                        tem=i;
                    continue;}
                    if(c>=1)
                    {
                        c++;
                        break;
                    }
                }
                
            }
            if(c==1)
            {
                ans[tem]=p;
                return ans;
            }
            if(c>1)
            {
                return ans;
            }

            if(c==0)
            {
                for(int i=0;i<nums.length;i++)
                {
                    ans[i]=p/nums[i];
                }

                return ans;
            }

        
    
            return ans;
        }
    
    
        public static void main(String[] args) {
            int [] a ={1,2,3,4,0};
    
            int[] ans = productExceptSelf(a);

            for(int i=0;i<ans.length;i++)
            {
                System.out.print(ans[i]+" ");
            }
    }
}
