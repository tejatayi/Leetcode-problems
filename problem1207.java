//1207. Unique Number of Occurrences

import java.util.HashMap;
import java.util.Map;

public class problem1207 {
    
    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            h.merge(arr[i], 1, (existingValue,newValue)-> existingValue+newValue);
        }

        HashMap<Integer,Integer> h1 = new HashMap<>();

        for(Map.Entry<Integer,Integer> it : h.entrySet())
        {
            h1.merge(it.getValue(), 1, (existingValue,newValue)-> existingValue+newValue);
        }

        for(int i : h1.values())
        {
            //System.out.print(i+" ");
            if(i>1)
            {
                return false;
            }
        }


        return true;
    }


    public static void main(String[] args) {
        int [] a = {1,2};

        System.err.println(uniqueOccurrences(a));
    }
}
