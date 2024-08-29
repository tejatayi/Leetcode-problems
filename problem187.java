// 187. Repeated DNA Sequences

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Problem187{

    public static List<String> findRepeatedDnaSequences(String s) {
        
        List<String> ans = new ArrayList<>();
        Map<String,Integer> m= new HashMap<>();
        int l=0,r=10;

        while(r<=s.length())
        {
           String sub= s.substring(l, r);
            m.merge(sub, 1, (v1,v2)->v1+v2);
            l++;r++;
        }

        for(Map.Entry<String,Integer> map : m.entrySet())
        {
            if(map.getValue()>1)
            ans.add(map.getKey());
        }

        return ans;
    }
   
       
   
    public static void main(String[] args)
    {
        
        String a="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> ans= findRepeatedDnaSequences(a);
        for(String i : ans)
        {
            System.err.println(i);
        }
        
        return;
    }

}