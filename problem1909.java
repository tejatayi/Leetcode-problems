//1909. Remove One Element to Make the Array Strictly Increasing

import java.util.*;

class Problem1909{


    public static boolean canBeIncreasing(int[] a) {
    
        int len=a.length;
        int count=0, temp=0;
       
        for(int i=0;i<len-1;i++)
        {
            if(a[i]>=a[i+1])
            {
                count++;
                temp=i;
            }
        }


        if(count>1)
        {
            return false;
        }
        if(count==1)
        {
            if(temp==0 || temp==len-2)
            return true;

            if(a[temp]<a[temp+2] || a[temp-1]<a[temp+1])
            return true;
            
            else
            return false;
           
        }

        return true;
    }
        
        
    
        public static void main(String[] args)
    {
        
        int [] n2= {5,6,4,7};

        System.out.println(canBeIncreasing(n2));
       
        return;
    }
}