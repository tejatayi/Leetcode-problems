// 76. Minimum Window Substring


import java.util.HashMap;
import java.util.Map;

class Problem76{

    public static String minWindow(String s, String t) {
        
        Map<Character,Integer> strMap = new HashMap<>();
        Map<Character,Integer> targeMap = new HashMap<>();
        

        for(int i=0;i<t.length();i++)
        {
            targeMap.merge(t.charAt(i),1,(a,b)->a+b);             // hasing s string
        }
        for(int i=0;i<s.length();i++)
        {
            strMap.merge(s.charAt(i),1,(a,b)->a+b);           //hasing t string
        }

        int l=0,r=s.length()-1;

        if(t.length()>s.length())
        return "";

        while (r>=0 && l<s.length()) {

            int val_in_str_l = strMap.get(s.charAt(l));
            int val_in_tar= targeMap.getOrDefault(s.charAt(l), 0);   // if there is no key in the target map it return 0 as default
            
            if(val_in_str_l > val_in_tar)                               // moving the left pointer untill it can
            {
                strMap.put(s.charAt(l), strMap.get(s.charAt(l))-1);
                //strMap.merge(s.charAt(l), 0, (e,n)->e-1);
                l++;
                continue;
            }

            int val_in_str_r = strMap.get(s.charAt(r));
            val_in_tar= targeMap.getOrDefault(s.charAt(r), 0);
            if(val_in_str_r > val_in_tar)
            {
                strMap.put(s.charAt(r), strMap.get(s.charAt(r))-1);
                //strMap.merge(s.charAt(r), 0, (e,n)->e-1);
                r--;
                continue;
            }

            break;            

        }
    

        return s.substring(l, r+1);
    }
              
     


    public static void main(String[] args)
    {
        
       String s= "cabwefgewcwaefgcf";
       String ans= minWindow(s, "cae");

       System.out.println(ans);
     
    
       
        return;
    }
}