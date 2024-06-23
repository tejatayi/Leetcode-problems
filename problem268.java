// 268. Missing Number



class Problem268{

  
        public static int missingNumber(int[] n) {
    
           int x= n.length;
            int total= (x*(x+1))/2;
        int sum=0;
        for (int i=0;i<x;i++)
        sum+=n[i]; 
    
        return total-sum;
    
        }





    public static void main(String[] args)
    {
        
        int []n={0,1,2,3,4,5,6,7,9};

       System.out.println(missingNumber(n));
       
        return;
    }
}