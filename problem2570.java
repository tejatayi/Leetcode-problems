//2570. Merge Two 2D Arrays by Summing Values


import java.util.Map;
import java.util.TreeMap;

public class problem2570 {
    
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();

        for(int i=0 ;i<nums1.length;i++)
        {
            map.merge(nums1[i][0], nums1[i][1], (a,b)->a+b);
        }
        for(int i=0 ;i<nums2.length;i++)
        {
            map.merge(nums2[i][0], nums2[i][1], (a,b)->a+b);
        }

       for(Map.Entry<Integer,Integer> it : map.entrySet())
       {
            System.out.println("Key :"+it.getKey()+" Value :"+it.getValue());
       }

       return map.entrySet()
                    .stream()
                    .map(i -> new int[]{i.getKey(),i.getValue()} )
                    .toArray(int [][] :: new);
    }



    public static void main(String[] args) {
        
        int [][] a = {{1,2},{2,3},{4,5}};
        int [][] b= {{1,4},{3,2},{4,1}};

        mergeArrays(a,b);

    }


}
