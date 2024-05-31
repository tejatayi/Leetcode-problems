// 6. Zigzag Conversion


/*
 * added each char of a string to a map having row numbers to visualize 
 * paypal [123212] if no of rows =3 
 * if no of rows=4 [1234 32 1234]
 * where the row numbers are key and values are the characters.
 */

import java.util.*;

class Problem6{


    public static String convert(String s, int numRows) {
        
        if(numRows==1)
        return s;

        HashMap<Integer,String> a = new HashMap<>();
        int key=1,fl=0;
        for(int i=1;i<=numRows;i++)
        {
            a.put(i,"");
        }

       for(int i=0;i<s.length();i++)
       {
            if(key<=numRows && fl==0)
            {
                a.put(key,a.get(key)+s.charAt(i));
                key++;
                if(key==numRows)
                {
                    fl=1;
                    continue;
                }
            
            }

            if(fl==1)
            {
                
                a.put(key,a.get(key)+s.charAt(i));
                key--;
                if(key==1)
                {
                    fl=0;
                }
            }
       }
       String ans="";
       for(int i=1;i<=numRows;i++)
       {
            ans=ans+a.get(i);
       }

     

       return ans;
    }

    public static void main(String[] args)
    {
        

       System.err.println(convert("paypalishiring",3)); 
       
        return;
    }
}