//80. Remove Duplicates from Sorted Array II

public class problem80 {
    
    public static int removeDuplicates(int[] n) {
        
        if(n.length<=2)
        return n.length;

        int in=2;
        
        for(int r=2;r<n.length;r++)
        {
            if(n[r]!=n[in-2])
            {
                n[in]=n[r];
                in++;
            }

        }

       for(int i=0;i<in;i++)
       {
            System.out.print(n[i]+" ");
       }

        return in;

    }

    public static void main(String[] args) {
        int [] a = {0,0,1,1,1,1,2,3,3};

        System.out.println(removeDuplicates(a));

        
    }

}
