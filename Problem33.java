// 33. Search in Rotated Sorted Array

class Problem33{


    public static int search(int[] n, int t) {
        
        int l=0,r=n.length-1;

        while(l<=r)
        {
            int mid=(l+r)/2;

            if(n[mid]==t)
            return mid;

            //check if left part is sorted
            if(n[mid]>=n[l])
            {
                if(t<n[mid] && t>=n[l]) //if target is in the range of mid and the left pointer 
                r=mid-1;
                else
                l=mid+1;


            }

            //if the right part is sorted
            else
            {
                if(t>n[mid] && t<=n[r]) //if the target is in the range of mid and the right pointer
                l=mid+1;
                else
                r=mid-1;

            }
        }
        return -1;
    }

   

    public static void main(String[] args)
    {
        
        int [] n2= {3,1};

        System.out.println(search(n2, 1));
       
        return;
    }
}