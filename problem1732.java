//1732. Find the Highest Altitude


public class problem1732 {

     
    public static int largestAltitude(int[] gain) {

        int max=0,s=0;

        for(int i=0;i<gain.length;i++)
        {
            s+=gain[i];

            if(s>max)
            max=s;
        }


        return max;
    }
    
    
    


    public static void main(String[] args) {
      
    int [] a = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(a));


     }
}