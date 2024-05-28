//3. Longest Substring Without Repeating Characters

import java.util.*;

class Problem3{


    public static int lengthOfLongestSubstring(String s) {
        
        int count=0,max=0;

       Set<Character> x = new HashSet<>();

       for(int i=0;i<s.length();i++)
       {
        if(x.contains(s.charAt(i))){
            x.clear();
            count=0;
            char tem= s.charAt(i);
            i--;
            while(s.charAt(i)!=tem){
                i--;
            }
            
            continue;
        }
        else{
            x.add(s.charAt(i));
            count++;

            if(count >max)
            max=count;
        }
       }
           
     
        
        return max;

    }
        
        
    
        public static void main(String[] args)
    {
        
      String x= new String("abcdbaef");
      System.out.println(lengthOfLongestSubstring(x));

     
        return;
    }
}
