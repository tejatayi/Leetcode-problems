//215. Kth Largest Element in an Array


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class problem215 {
    
    public static int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> Pq = new PriorityQueue<>(Collections.reverseOrder());

        IntStream.range(0, nums.length).forEach(i -> Pq.add(nums[i]));

        for(int i=1;i<k;i++)
        {
            Pq.remove();
        }

        return Pq.peek();

    }

    public static void main(String[] args) {
        int [] a = {3,2,3,1,2,4,5,5,6};

        System.out.println(findKthLargest(a, 4));


    }
}
