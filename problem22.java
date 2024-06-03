// 22.Generate Parentheses

import java.util.ArrayList;
import java.util.List;

class Problem22{

    public static  List<String> find(List<String> ans,int n , int open , int close , String s)
    {
        if(close==n) // break condition;
        {
            ans.add(s);
            return ans;
        }


        if(open<n)   // open bracket
        {
            
        //   open++;
            find(ans, n, open+1, close, s+"(");
        }

        if(close<open)   //close bracket
        {
            
           // close++;
            find(ans, n, open, close+1, s+")");
        }



        return ans;

       
    }


    public static List<String> generateParenthesis(int n) {
        
    
    List<String> ans = new ArrayList<>();
    
    System.out.println(find(ans, n, 0, 0,""));
    return ans;
    }




    public static void main(String[] args)
    {
        
        int n=3;

        generateParenthesis(n);

       
        return;
    }
}