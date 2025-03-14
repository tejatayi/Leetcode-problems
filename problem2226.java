//2226. Maximum Candies Allocated to K Children


public class problem2226 {

        public static boolean isValid(long m , int[] c,long k)
        {
            long t=0;
            for(int i=0;i<c.length;i++)
            {
                t+=c[i]/m;
            }
            if(t>=k)
            return true;

            return false;
        }
        public static int maximumCandies(int[] c, long k) {
            
            long r=0;
            long sum =0;;
            for(int i=0;i<c.length;i++)
            {
                r=Math.max(r, c[i]);
                sum+=c[i];
            }
            if(sum<k)
            return 0 ;
    
            long l=1;
            int ans =0;
            
            while (l<=r) 
            {
                long mid =l+(r-l)/2;
                if(isValid(mid,c,k))
                {
                    ans=(int)mid;
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }
            }
            
            return ans;
        }
    
    
    public static void main(String[] args) {
        int [] a = {4,7,5};

        System.out.println(maximumCandies(a, 4));
    }
}
