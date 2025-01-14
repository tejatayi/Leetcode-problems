// 605. Can Place Flowers

class Problem605{


    public static boolean canPlaceFlowers(int[] f, int n) {
        
    int a[] = new int[f.length+2];
        a[0]=0;
        int len= a.length;
        a[len-1]=0;

        for(int i=1;i<len-1;i++)
        {
            a[i]=f[i-1];
    
        }
        int ans=0;
        for(int i=1;i<len-1;i++)
        {
            if(a[i]==0 && a[i-1]==0 && a[i+1]==0)
            {
                ans++;
                i++;
            }
    
        }

       // System.out.println(ans);
        if(ans >= n)
        return true;

        else 
        return false;
    }

    public static void main(String[] args)
    {
        
        int [] n2= {0,0,0,0,0};

        System.out.println(canPlaceFlowers(n2, 1));
       
        return;
    }
}