// Plus One

class Problem66{


    public static int[] plusOne(int[] d) {
        int carry = 0;

     for(int i=(d.length)-1; i>=0 ; i--)
     {
        if(i==0 && d[i]==9 )
        {   
            int l=d.length+1;
            int temp[] = new int[l];
      //      System.out.println(temp.length); 
            temp[0]=1;
            for(int j=1;j<temp.length;j++)
            temp[j]=0;

            return temp;
        }
        if(d[i]!=9 && carry==1)
        {
            //System.out.println(d[i]);
            d[i]++;
            carry=0;
            break;
        }
        
        if(d[i]==9)
        {
            d[i]=0;
            carry = 1;
            continue;
        }
     }
    return d;
    }

    public static void main(String[] args)
    {
        
        int [] n2= {9,9,9,9};

        int x[] = plusOne(n2);
        for(int i=0;i<x.length;i++)
        System.out.print(x[i]); 
    }
}