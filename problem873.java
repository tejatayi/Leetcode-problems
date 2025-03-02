//873. Length of Longest Fibonacci Subsequence

import java.util.HashMap;

public class problem873 {
    
    public static int lenLongestFibSubseq(int[] arr) {
     
        HashMap<Integer,Integer> m = new HashMap<>();
        int len = arr.length;
        for(int i=0 ; i < len ; i++)
        {
            m.put(arr[i], i);
        }
        int c=0 ; 
        int ans =0 ;
        for(int i=0 ;i<len ;  i++)
        {   
            for(int j = i+1; j< len ; j++)
            {   c=0;
                int sum= arr[i]+arr[j];
                int prev = arr[j];
                while (m.containsKey(sum)) {
                   c++;
                   ans= Math.max(ans, c);
                   
                   int tem= prev ; 
                   prev = sum;
                   sum=sum+tem;
                }

            }
        }

        return (ans==0) ? 0 : ans+2;

    }

    public static void main(String[] args) {
        int [] a = {1,3,7,11,12,14,18};

        System.out.println(lenLongestFibSubseq(a));

    }

}
