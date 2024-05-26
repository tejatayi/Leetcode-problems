//Find the Difference of Two Arrays

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

class Problem2215{


    public static List<List<Integer>> findDifference(int[] n1, int[] n2) {

        Map<Integer,Integer> x1= new HashMap<>();
        Map<Integer,Integer> x2= new HashMap<>();

        for(int i=0 ; i < n1.length;i++)
        {
            x1.put(n1[i],1);
        }

        for (int i=0 ; i <n2.length; i++)
        {
            x2.put(n2[i],1);
        }

        List <Integer> a1 = new ArrayList<>();
        List <Integer> a2 = new ArrayList<>();

        for(Map.Entry<Integer,Integer> it : x1.entrySet()){

            if(!x2.containsKey(it.getKey()))
            {
                a1.add(it.getKey());
            }
        }

        for(Map.Entry<Integer,Integer> it : x2.entrySet()){

            if(!x1.containsKey(it.getKey()))
            {
                a2.add(it.getKey());
            }
        }


            List<List<Integer>> ans = new ArrayList<>();

            ans.add(a1);
            ans.add(a2);


            return ans;

    }

    public static void main(String[] args)
    {
        int [] n1= {1,2,3};
        int [] n2= {2,4,6};

        System.out.println(findDifference(n1,n2));
    }
}