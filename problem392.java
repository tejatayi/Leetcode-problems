
//392. Is Subsequence

public class problem392 {

    public static void main(String[] args) {
        String s= "c";
        String t="b";

        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
     
     boolean ans = false;

        int i=0,j=0;

        if(s.isEmpty())
        return true;

        while(j<t.length())
        {
            if(t.charAt(j)==s.charAt(i))
            {
                System.out.println(i);
                i++;
            }
            if(i==s.length())
            {
                ans=true;
                break;
            }
            j++;
        }


        return ans;
    }
    
}
