// 81. Search in Rotated Sorted Array II
// This problem is similar to the problem "33.Search in Rotated Sorted Array" 

class Problem81{


    public static boolean search(int[] n, int t) {
        
        int l=0,r=n.length-1;

        while(l<=r)
        {
            int mid=(l+r)/2;

            if(n[mid]==t)
            return true;

            //check if left part is sorted
            if(n[mid]>n[l])
            {
                if(t<n[mid] && t>=n[l]) //if target is in the range of mid and the left pointer 
                r=mid-1;
                else
                l=mid+1;


            }

            //if the right part is sorted
            else if(n[mid]<n[r])
            {
                if(t>n[mid] && t<=n[r]) //if the target is in the range of mid and the right pointer
                l=mid+1;
                else
                r=mid-1;

            }
            
            // if the element at "L" is equal to the element at "MID"
           else
            {
                if(n[mid]==n[l])
                l++;
                else
                r--;
            }
        }
        return false;
    }

   

    public static void main(String[] args)
    {
        
        int [] n2= {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};

        System.out.println(search(n2, 13));
       
        return;
    }
}