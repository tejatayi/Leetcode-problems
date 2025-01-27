//2017. Grid Game

// chatgpt code do it again 

public class problem2017 {
 
    public static long gridGame(int[][] grid) {
        int len = grid[0].length;

        // Use a 2 x len array for prefix sums to avoid MLE
        long[][] pre = new long[2][len];
    
        // Build prefix sums for top and bottom rows
        pre[0][0] = grid[0][0];
        pre[1][0] = grid[1][0];
        for (int i = 1; i < len; i++) {
            pre[0][i] = pre[0][i - 1] + grid[0][i];
            pre[1][i] = pre[1][i - 1] + grid[1][i];
        }
    
        // We'll store the column 'max_index' that MINIMIZES the second robot's coins
        // Initialize 'max' to something large because we are looking for the minimum
        long max = Long.MAX_VALUE;
        int max_index = -1;
    
        // Check each column i where the first robot might drop
        for (int i = 0; i < len; i++) {
            // If the first robot drops at i, the second robot can choose:
            // 1) bottom row columns [0..i-1]
            // 2) top row columns [i+1..len-1]
    
            long topLeft    = (i == len - 1) ? 0 : (pre[0][len - 1] - pre[0][i]);
            long bottomLeft = (i == 0)       ? 0 : pre[1][i - 1];
    
            // Second robot takes whichever portion is bigger
            long tem = Math.max(topLeft, bottomLeft);
    
            // We want to minimize the second robot's coins
            if (tem < max) {
                max = tem;
                max_index = i;
            }
        }
    
        // For debugging: compute the leftover coins on top & bottom with our chosen 'max_index'
        long v1 = (max_index == len - 1) ? 0 : (pre[0][len - 1] - pre[0][max_index]);
        long v2 = (max_index == 0)       ? 0 : (pre[1][max_index - 1]);
    
        System.out.println(v1 + "," + v2);
        System.out.println("index :" + max_index);
    
        // 'max' holds the minimized second-robot score
        return max;
    }



    public static void main(String[] args) {
        
        int [][] a = {{1,3,1,15},{1,3,3,1}};

        System.out.println(gridGame(a));


    }
}
