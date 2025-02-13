//547. Number of Provinces

public class problem547 {
    
    public static void dfs(int [][] a ,int [] visited,int node )
    {   
        visited[node] = 1;
        
    
        for (int i = 0; i < a[node].length; i++) {
            
            if (a[node][i] == 1 && visited[i] == 0) {
                dfs(a, visited, i);
            }
        }
    }
    public static int findCircleNum(int[][] isConnected) {
        
        int nodes= isConnected.length;
        int [] visited = new int[nodes];
        int c=0;
        for(int i=0;i<nodes;i++)
        {
            if(visited[i]!=1)
            {
                c++;
                dfs(isConnected,visited,i);
            }
           
        }

        return c;

    }

    public static void main(String[] args) {
        int [][] a = {{1,0,0},{0,1,0},{0,0,1}};
    

        System.out.println(findCircleNum(a));
    }
}
