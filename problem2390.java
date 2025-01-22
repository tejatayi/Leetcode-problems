//2390. Removing Stars From a String



public class problem2390 {
    
    public static String removeStars(String s) {
        

        StringBuilder ans = new StringBuilder("");
        
       for(int i=0;i<s.length()-1;i++)
       {
        if(s.charAt(i)!='*' && s.charAt(i+1)!='*')
        {
            ans.append(s.charAt(i));
        }
       }
       if(s.charAt(s.length()-1)!='*')
        ans.append(s.charAt(s.length()-1));
       return ans.toString();
    }
       

    public static void main(String[] args) {
        

        String s ="leet**cod*e";
        System.out.println(removeStars(s));
    }
}
