//1910. Remove All Occurrences of a Substring

public class problem1910 {
    

    public static String removeOccurrences(String s, String part) {
        
        int len = part.length();
        StringBuffer sb = new StringBuffer(s);
        for(int i =0;i<sb.length();i++)
        {   
            if(i+len > sb.length())
            break;
            String tem = sb.substring(i,i+len);
            if(tem.equals(part))
            {
                sb.delete(i,i+len);
                i=-1;
            }
            
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        
        String s="daabcbaabcbc";
        String part = "abc";

        System.out.println(removeOccurrences(s,part));

    }


}
