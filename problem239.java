// 239.Sliding Window Maximum

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Problem239{

    public static int[] maxSlidingWindow(int[] nums, int k) {
      
        List<Integer> an = new ArrayList<>();

        int l=0,r=0;

        Deque<Integer> dq = new ArrayDeque<>();             //using a deque

        while(r<nums.length)
        {
            while(!dq.isEmpty() && dq.peekLast()<nums[r])                   //checking if the top of the queue is lessthan the current (nums[r])
            {
                dq.removeLast();
            }
            dq.addLast(nums[r]);

            if(r==l+k-1)
            {
                an.add(dq.peekFirst());
                if(dq.peekFirst()==nums[l])
                dq.removeFirst();
                l++;  
            }
            r++;
            if(r==nums.length)
            break;
            
        }


        int [] ans = new int[an.size()];            

        for(int i=0;i<an.size();i++)        // converting list into array for return type
        {
            ans[i]=an.get(i);
        }
        return ans;
    }
              
     


    public static void main(String[] args)
    {
        
        int [] n2= {1,3,-1,-3,5,3,6,7};
        //int [] n2 = {1};
        int [] ans = maxSlidingWindow(n2, 3);
        for (int i : ans) {
            System.out.print(i);
        }

       
        return;
    }
}