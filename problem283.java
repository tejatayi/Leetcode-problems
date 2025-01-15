//283. Move Zeroes

public class problem283 {

    public static void moveZeroes(int[] nums) {
        
        int c=0;
       

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c++;
            }
            if(nums[i]!=0)
            {
                nums[i-c]=nums[i];
            }
           
        }
       int it = nums.length-c;

        while(it < nums.length)
        {
            nums[it]=0;
            it++;
        }
    }

    public static void main(String[] args) {
     int [] a = {0,1,0,3,12,4,5};

     moveZeroes(a);
        for(int n:a)
        {
            System.out.print(n+" ");
        }

    

    }
}
