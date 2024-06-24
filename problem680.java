//680. Valid Palindrome II



class Problem680{

    public static boolean check (String s, int i,int j)
    {
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;j--;
            }
            else
                return false;

        }
        return true;
    }

    
    public static boolean validPalindrome(String s) {
        
        int i=0,j=s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return check(s,i+1,j)  || check(s,i,j-1);
            }
            i++;
            j--;
        }

        return true;
    }

    
    
        public static void main(String[] args)
    {
        
      String x= new String("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga");
      System.out.println(validPalindrome(x));

     
        return;
    }
}
