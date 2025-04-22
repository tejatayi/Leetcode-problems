//55. Jump Game

public class problem55 {
    
    public static boolean canJump(int[] n) {
        
        int len = n.length;
        boolean [] a = new boolean[len];
        a[len-1]=true;
        for(int i=len-2;i>=0;i--)
        {   
             int j=1;
             while(j<=n[i])
             {
                if((i+j)>=len-1 || a[i+j]==true)
                {   
                    a[i]=true;
                    break;
                }
                j++;
             }
        }

       
       
       return a[0];

    }


    public static void main(String[] args) {
        int [] a ={5,2,3,0,0,1};
        canJump(a);

    }
}
