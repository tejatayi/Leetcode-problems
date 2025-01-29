//394. Decode String

import java.util.Stack;

public class problem394 {

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static String decodeString(String s) {
        
        Stack<String> st = new Stack<>();

        int i=0;
        StringBuffer temp = new StringBuffer();
        while(i<s.length())
        {
            String t = String.valueOf(s.charAt(i));

            if(t.equals("]"))
            {
                 temp.setLength(0);
                while (!st.peek().equals("[")) {
                    temp.insert(0, st.pop());
                }
                st.pop();
               StringBuffer x = new StringBuffer();
                while (!st.isEmpty() && isInteger(st.peek())) {
                    x.insert(0,st.pop());
                }

                String temp1 = temp.toString().repeat(Integer.parseInt(x.toString()));
                
                st.push(temp1);
                
            }
            else{
                st.push(t);
            }
                i++;
        }
        temp.setLength(0);
        while (!st.isEmpty()) {
            temp.insert(0, st.pop()); // Maintain correct order
        }

        
        return temp.toString();
    }




    public static void main(String[] args) {
        String a="3[a2[c]]";

        System.out.println(decodeString(a));
    }
}
