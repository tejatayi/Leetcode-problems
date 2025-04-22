//189. Rotate Array


public class problem189 {
    
    public static void reverse(int [] a , int i, int j)
    {
        while(i<j)
        {
            a[i]=a[i]^a[j];
            a[j]=a[i]^a[j];
            a[i]=a[i]^a[j];

            i++;
            j--;
        }
    }

    public static void rotate(int[] n, int k) {
         int len =n.length;
          k = k % len;
        
        reverse(n,0,len-1);
        reverse(n,0,k-1);
        reverse(n,k,len-1);
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        
        rotate(a,3);

        for(int i : a)
        {
            System.out.print(i+" ");
        }

    }
}
