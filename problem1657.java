//1657. Determine if Two Strings Are Close

import java.util.HashMap;
import java.util.Map;



public class problem1657 {
    
    public static boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!=word2.length())
        return false;

        HashMap<Character,Integer> w1 = new HashMap<>();
        HashMap<Character,Integer> w2 = new HashMap<>();

        for(int i=0 ;i<word1.length();i++)
        {
            w1.merge(word1.charAt(i),1, (a,b)->a+b);
            w2.merge(word2.charAt(i),1, (a,b)->a+b);
        }
        for(int i=0;i<word1.length();i++)
        {
            if(!w1.containsKey(word2.charAt(i)))
                return false;
        }
       

        HashMap<Integer,Integer> it1 = new HashMap<>();
        HashMap<Integer,Integer> it2 = new HashMap<>();

        for(int i : w1.values())
        {
            it1.merge(i, 1, (a,b)->a+b);
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : w2.values())
        {
            it2.merge(i, 1, (a,b)->a+b);
            System.out.print(i+" ");
        }

        try{for(Map.Entry<Integer,Integer> i : it1.entrySet())
        {
            int key= i.getKey();
            int value= i.getValue();

            if(!(value==it2.get(key)))
            return false;
            
        }
        for(Map.Entry<Integer,Integer> i : it2.entrySet())
        {
            int key= i.getKey();
            int value= i.getValue();

            if(!(value==it1.get(key)))
            return false;
            
        }}

        catch(Exception e)
        {
            return false;
        }

        

       
        return true;
    }





    public static void main(String[] args) {
    
        String a="abc";
        String b="bca";

        System.out.println(closeStrings(a, b));

    }
}
