//3066. Minimum Operations to Exceed Threshold Value II
import java.util.PriorityQueue;
import java.util.Queue;

public class problem3066 {
    
    public static int minOperations(int[] nums, int k) {
        
        Queue<Long> pq = new PriorityQueue<>();

        for(int i =0;i<nums.length;i++)
        {
            pq.add((long)nums[i]);
        }
        int cou=0;

        while (!pq.isEmpty() && pq.size()>=2) {

            // System.out.println(pq);
            long t1=pq.poll();
            long t2=pq.poll();
            //System.out.println(t1+" "+t2);
            if(t1>=k && t2>=k)
            break;
            
            cou++;

            long ans= (t1*2)+t2;

            pq.add(ans);

        }

        return cou;


    }

    public static void main(String[] args) {
        int [] a = {97,24,43,45,45,26};

        System.out.println(minOperations(a,45));
    }

}
