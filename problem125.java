//125. Valid Palindrome



class Problem125{

    
    public static boolean isPalindrome(String s) {
                                                                 
                                                                //replace function is used to replace a specitic string with another string and return a new string obj
        String x1= s.replaceAll("[^a-zA-Z0-9]", ""); //[^a-zA-Z] is regular expression where ^ denotes negate the a-z,A-Z
        int i=0,j=x1.length()-1;                                  // go through REGex syntax to get a clear picture.
        String x = x1.toLowerCase(); 
       System.err.println(x);
        while(i<=j)
        {
            if(x.charAt(i)==x.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    
    
        public static void main(String[] args)
    {
        
      String x= new String(".a");
      System.out.println(isPalindrome(x));

     
        return;
    }
}
