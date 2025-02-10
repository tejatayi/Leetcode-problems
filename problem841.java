//841. Keys and Rooms

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class problem841 {

        public static void explore(Queue<Integer> q , int [] a , List<List<Integer>> rooms)
        {   
            if(q.isEmpty())
            return;
            int ta = q.poll();
            if(a[ta]==1)
            {   
                explore(q, a, rooms);
            }
           
            a[ta]=1;
            List<Integer> tem = rooms.get(ta);

            for(int i=0;i<tem.size();i++)
            {
                if(a[tem.get(i)]==0)
                {
                    q.add(tem.get(i));
                }
            }
            


            explore(q, a, rooms);


        }



    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Queue<Integer> q = new LinkedList<>();
        int len = rooms.size();
        int [] a = new int[len];
        int c=0;
        q.add(0);

        explore(q, a,rooms);

        for(int i=0 ; i<len;i++)
        {
            if(a[i]==0)
            {
                System.out.println(a[i]);
                return false;}
        }

        return true;
        
       

    }
 public static <T> List<List<T>> convert(T[][] array) {
        List<List<T>> list = new ArrayList<>();
        for (T[] row : array) {
            list.add(new ArrayList<>(Arrays.asList(row)));
        }
        return list;
    }
    
    public static void main(String[] args) {
        // A jagged 2D array example
        Integer[][] jaggedArray = {{6,7,8},{5,4,9},{},{8},{4},{},{1,9,2,3},{7},{6,5},{2,3,1}};
        

        List<List<Integer>> listOfLists = convert(jaggedArray);
        System.out.println(canVisitAllRooms(listOfLists));
        
    
    }
}
