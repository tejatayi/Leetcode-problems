//5. Longest Palindromic Substring

public class problem5 {

    public static int checkPalin(char[] a , int l ,int r, int len)
    {
        while(l>=0 && r<len)
        {
            if(a[l]!=a[r])
            break;

            l--;r++;
        }

        return (r-l)-1;
    }

    public static String longestPalindrome(String s) {
        char [] a = s.toCharArray();
        int len = s.length();

        int start =0,end=0;

        for(int i =0 ;i<len;i++)
        {
            int l=i,r=i;

            int l1 = checkPalin(a, l, r, len);
            int l2 = checkPalin(a, l, r+1, len);
            int maxlen = Math.max(l1, l2);
            
            if (maxlen > end - start) {
                // Update start and end based on new palindrome bounds
                start = i - (maxlen - 1) / 2;
                end = i + maxlen / 2;
            }
            
        }
        
        return s.substring(start, end+1);

    }
    


    public static void main(String[] args) {
        String a = "babad";

        System.out.println(longestPalindrome(a));


    }
}
