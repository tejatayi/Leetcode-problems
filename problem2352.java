//2352. Equal Row and Column Pairs

import java.util.HashMap;
import java.util.Map;

public class problem2352 {
    
    public static int equalPairs(int[][] grid) {
        
        int ans=0;
        HashMap<String,Integer>row = new HashMap<>();
        HashMap<String,Integer>column = new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
            String tem="";
            for(int j=0;j<grid.length;j++)
            {
                tem=tem+Integer.toString(grid[i][j])+",";
            }
            row.merge(tem, 1, (a,b)->a+b);
            tem="";
        }

        for(int j=0;j<grid.length;j++)
        {
            String tem="";
            for(int i=0;i<grid.length;i++)
            {
                tem=tem+Integer.toString(grid[i][j])+",";
            }
            column.merge(tem, 1, (a,b)->a+b);
            tem="";
        }

        for(Map.Entry<String,Integer> m : row.entrySet())
        {
            if(column.containsKey(m.getKey()))
            {
            
                //ans+=Math.max(m.getValue(), column.get(m.getKey()));

                ans+= (m.getValue()*column.get(m.getKey()));
            }
        }


        return ans;
    }




    public static void main(String[] args) {
        
        int [][] a= {{11,1},{1,11}};

        System.out.println(equalPairs(a));

    }
}
