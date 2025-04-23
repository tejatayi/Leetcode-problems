import java.util.HashSet;


// LeetCode Problem 128: Longest Consecutive Sequence
// Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/


public class problem128 {
    public static int longestConsecutive(int[] nums) {
      
        HashSet<Integer> map = new HashSet<>();
        int max=0;
        for(int i : nums)
        {
            map.add(i);
        }

        for(int i : nums)
        {

            int c=1;
            int tem=i;
            while(true)
            {
                tem++;
                if(map.contains(tem))
                {
                    c++;
                    map.remove(tem);
                }
                else
                break;
            }
            tem=i;
            while(true)
            {
                tem--;
                if(map.contains(tem))
                {c++;map.remove(tem);}
                else
                break;
            }
            map.remove(i);
            max=Math.max(max,c);
        }

    return max;

    }

    public static void main(String[] args) {
        
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(nums));
    }
}