// 658. Find K Closest Elements

import java.util.*;

class Problem658{


    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        Problem658 obj = new Problem658();

        int near= obj.findNearest(arr, x);
        int left=near;
        int right= near+1;
        List<Integer> list = new ArrayList<>();
        
        while(k>0 && (left>=0 && right<arr.length))
        {
            int left_abs=Math.abs(x-arr[left]);
            int right_abs= Math.abs(x-arr[right]);

            if(left_abs<=right_abs)
            {
                list.add(arr[left]);
                left--;
                k--;
            }
            else
            {
                list.add(arr[right]);
                right++;
                k--;
            }
        }

        while (left>0 && k>0) {
            list.add(arr[left]);
            k--;
            left--;
            
        }

        while(right<arr.length && k>0)
        {
            list.add(arr[right]);
            right++;
            k--;
        }
        
        Collections.sort(list);
    return list;   

    }
    
    public int findNearest(int a[],int target)
    {

        int left=0,right=a.length-1;
        int ans=0;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(target==a[mid])  // if you find target return target
            return mid;
           
        
                if(target>a[mid])
                {
                   
                    left=mid+1;
                }
                else
                {
                    right=mid;
                }
            
        }
        left--;     // to find the left and right are indeces range where the target is present
        if(left<0)      // it the target is between 0 and 1 indece "left-- = -1" so
        {
            left=0;

        }           
        int l_abs=Math.abs(target-a[left]);
        int r_abs=Math.abs(target-a[right]);
        if(l_abs<=r_abs)
        ans=left;
        else
        ans=right;
            return ans;
    }


    public static void main(String[] args)
    {
        
        int [] n2= {1,2,3,4,5};
        List<Integer> list = findClosestElements(n2,4,3);

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
       
       
        return;
    }
}