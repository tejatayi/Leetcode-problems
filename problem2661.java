//2661. First Completely Painted Row or Column

import java.util.ArrayList;
import java.util.HashMap;

public class problem2661 {
    
    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        
        HashMap<Integer,ArrayList<Integer>> mx = new HashMap<>();    // 

        int rl=mat[0].length;           // row length
        int cl=mat.length;              //column length

        int nor=cl,noc=rl;              // noof rows , no of columns respectively

        // System.out.println("row length: "+nor);
        // System.out.println("col length: "+noc);


        for(int x=0;x<nor;x++)                  // deriving a hash map of cordinates 3 - 0,0
        {
            for(int y=0;y<noc;y++)
            {
                ArrayList<Integer> cordinates = new ArrayList<>();
                cordinates.add(x);
                cordinates.add(y);
                
               // System.out.println(mat[x][y]+" : ("+x+","+y+")");

                mx.put(mat[x][y], cordinates);
            }
        }

        int [] rco = new int[nor];
        int [] cco = new int[noc];

        for(int i =0 ; i< arr.length;i++)
        {
            ArrayList<Integer> cordinates = mx.get(arr[i]);

            System.out.println(cordinates);

            rco[cordinates.get(0)]++;
            cco[cordinates.get(1)]++;

            if(rco[cordinates.get(0)]==rl || (cco[cordinates.get(1)]==cl))
            return i;
        }




        return -1;
    }


    public static void main(String[] args) {

        int [] a={6,2,3,1,4,5};
        int [][] b= {{5,1},{2,4},{6,3}};

        System.out.println(firstCompleteIndex(a,b));


    }
}

