// 528. Random Pick with Weight
import java.util.Random;
class Problem528{
    
    int [] sum;
    int max=0;           
      public   Problem528(int[] w) {

        sum = new int[w.length];
        
        for(int i=0;i<w.length;i++)
        {
           max=max+w[i];
           sum[i]=max;
         
        }
        }
        
        public  int pickIndex() {
    
            Random r = new Random();
           
            if(sum.length==0)
            return 0;
            
            int t= r.nextInt(max)+1;
        
            int left=0,right=sum.length-1;

          
            while(left<right)
            {
                int mid= (left+right)/2;

            

                if(t>sum[mid])
                {
                    left=mid+1;

                }
                else{
                   right=mid;
                }

                
            }

            return left;
        }


    public static void main(String[] args)
    {
        
        int [] n2= {1,3,1};
        Problem528 object = new Problem528(n2);
       
        for(int i=1;i<=30;i++)
        System.out.println( object.pickIndex()+" ");

       
        return;
    }
}