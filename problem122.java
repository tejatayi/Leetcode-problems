//122. Best Time to Buy and Sell Stock II

public class problem122 {
    

    public static int maxProfit(int[] p) {
    
        int ans=0;
        for(int i=0;i<p.length-1;i++)
        {
           if(p[i]<p[i+1])
           {
               ans+=p[i+1]-p[i];
           }
        }
   
        return ans;
        
       }


    public static void main(String[] args) {
        
        int [] a = {7,1,5,3,6,4};

        System.out.println(maxProfit(a));

        
    }


}
