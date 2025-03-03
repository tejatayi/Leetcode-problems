//2161. Partition Array According to Given Pivot

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class problem2161 {
    
    public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            l1.add(nums[i]);
            if(nums[i]==pivot)
            count++;
            if(nums[i]>pivot)
            l2.add(nums[i]);
        }
        for(int i=0;i<count;i++){

            l1.add(pivot);
        }
        int [] a = Stream.concat(l1.stream(), l2.stream()).
                            mapToInt(Integer::intValue).
                            toArray();

        return a;
    }


    public static void main(String[] args) {
        
        int [] a = {9,12,5,10,14,3,10};

        int [] anss = pivotArray(a,10);

        for (int i : anss) {
            System.out.print(i+" ");
        }

    }
}
