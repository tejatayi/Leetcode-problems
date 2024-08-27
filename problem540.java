// 540. Single Element in a Sorted Array

class Problem540{

    public static int singleNonDuplicate(int[] nums) {
        
        int l=0,r=nums.length-1;
        if(nums.length == 1)        // checking for only 1 element in the array
            return nums[0];
        if(nums[l] !=nums[l+1])         //checking the begining of the array
        return nums[l]; 
        if(nums[r] != nums[r-1])        //checking the end of the array 
        return nums[r];
        while (l<=r) {
            int mid = l+(r-l)/2;

            if(nums[mid+1]!= nums[mid] && nums[mid-1] != nums[mid])  //checking if the mid is the ans
            return nums[mid];
            
        
                if(nums[mid] == nums[mid+1])            
                {
                    if(mid%2==0)
                    l=mid+1;
                    else
                    r=mid-1;
                }
                if(nums[mid]== nums[mid-1])
                {
                    if(mid%2==0)
                    r=mid-1;
                    else
                    l=mid+1;
                }
        }
        return -1;
    }
   /*  the logic is basically checking the "even,odd"  or "odd,even" set of each number  
    *  if the set is "even odd" then the ans is on the right if the set is "odd even" then 
       the ans is on the left part.
   */
       
   
    public static void main(String[] args)
    {
        
        int [] n2= {1,1,2,2,3};
        System.out.print(singleNonDuplicate(n2)); 
        
        return;
    }

}