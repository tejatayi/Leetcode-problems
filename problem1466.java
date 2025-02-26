//1466. Reorder Routes to Make All Paths Lead to the City Zero

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class problem1466 {

    public static int minReorder(int n, int[][] connections) {
       
       HashMap<Integer,List<Integer>> org = new HashMap<>();
       HashMap<Integer,List<Integer>> rev = new HashMap<>();

       for(int i=0;i<connections.length;i++)
       {
        int x = connections[i][0];
        int y = connections[i][1];

        if(!org.containsKey(x))
        {
            org.put(x, new ArrayList<>());
        }
        org.get(x).add(y);


        if(!rev.containsKey(y))
        {
            rev.put(y, new ArrayList<>());
        }
        rev.get(y).add(x);

       }

       Queue <Integer> q = new LinkedList<>();
       Set<Integer> set = new HashSet<>();
       q.add(0);
       set.add(0);
       int ans=0;
       while (!q.isEmpty()) {
        
        int tem=q.poll();
        

        if(org.containsKey(tem))
        {
            List<Integer> ls = org.get(tem);
            for(int i : ls)
            {
                if(!set.contains(i))
                {
                    q.add(i);
                    set.add(i);
                    ans++;
                }
                
            }
        }

        if(rev.containsKey(tem))
        {
            List<Integer> ls = rev.get(tem);
            for(int i : ls)
            {
                if(!set.contains(i))
                {
                    q.add(i);
                    set.add(i);
                }

            }
        }
       }
   

       return ans ;
    
    }
    public static void main(String[] args) {
        int [][] a = {{1,0},{1,2},{3,2},{3,4}};

        System.out.println(minReorder(5, a));
    }
}
