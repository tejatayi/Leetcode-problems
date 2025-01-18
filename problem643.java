//643. Maximum Average Subarray I


public class problem643 {
    
    public static double findMaxAverage(int[] nums, int k) {

        int i=0,j=k-1;
        double avg =0; 
        double sum =0;
        for(int h=0;h<k;h++)
        {
            sum+=nums[h];
        }
        avg=sum/k;
       
       
        while(j<nums.length-1)
        {
            sum=sum-nums[i];
            i++;
            j++;
            
            sum=sum+nums[j];

            if((sum/k)>avg)
            {
                avg=sum/k;
            }
        }
        

        return avg;
    }


    public static void main(String[] args) {
        int [] a= {1,12,-5,-6,50,3};
        int k=4;

        System.out.println(findMaxAverage(a,k));
    }
}
