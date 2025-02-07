//3160. Find the Number of Distinct Colors Among the Balls

import java.util.HashMap;

public class problem3160 {
    


    public static int[] queryResults(int limit, int[][] queries) {
        
        HashMap<Integer,Integer> bal = new HashMap<>();
        HashMap<Integer,Integer> col= new HashMap<>();
        int [] ans = new int[queries.length];
        int x=0;
        for(int i=0;i<queries.length;i++)
        {   
                int ball = queries[i][0];
                int color= queries[i][1];

                if(bal.containsKey(ball))
                {
                    int bc=bal.get(ball);  //present ball color
                    int tem= col.get(bc)-1;

                   if(tem==0)
                   {
                    col.remove(bc);
                   }
                   else
                   col.put(bc, tem);
                }
                bal.put(ball, color);
                col.merge(color, 1, (a,b)->a+b);

              
            ans[x]=col.size();
            x++;  
        }

        return ans;
    }


    public static void main(String[] args) {
        int [][] a = {{0,1},{1,4},{1,1},{1,4},{1,1}};

        int [] ans = queryResults(1,a);

        for(int i=0;i<ans.length;i++)
        System.out.print(ans[i]+" ");

    }
}
