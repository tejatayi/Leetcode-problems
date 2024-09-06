// 424.Logenst Repeating Character Replacement


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Problem424{

    public static int characterReplacement(String s, int k) {
        
        int l=0,r=0;
        int ans=1;
        Map<Character,Integer> map = new HashMap<>() ;
        map.put(s.charAt(r), 1);
        r++;
        while(r<s.length())
        {   
            
            map.merge(s.charAt(r), 1,(a,b)->a+b );              // adding r value to the hash map

            int len_subarray = r-l+1;                                 //lenght of the sub array                                               
            int x= Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getValue();  // getting the max value of the  map
            boolean is_valid = (len_subarray-x <=k) ? true : false;

            if(!is_valid)                       // removing l value from the hash map
            {   
                int temp = map.get(s.charAt(l));
                map.put(s.charAt(l),--temp);
                l++;
            }
            else
            ans=len_subarray;
            r++;



        }

        return ans;
    }
              
     


    public static void main(String[] args)
    {
        
       String s= "ABAB";
        
       System.out.println(characterReplacement(s, 2));
    
       
        return;
    }
}