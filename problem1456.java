//1456. Maximum Number of Vowels in a Substring of Given Length

public class problem1456 {
    
    public static boolean checkVowels(char a)
    {
        if(a == 'a' || a == 'e' || a == 'i' ||a == 'o' ||a == 'u')
        return true;


        return false;
    }
   


    public static int maxVowels(String s, int k) {
            
        int ans=0;
        int count=0;
        int start=0,end=k-1;

       for(int i=start;i<=end;i++)
       {
            if(checkVowels(s.charAt(i)))
            {
                count++;
            }
       }
       ans = count;
        
       while(end<s.length()-1)
        {

            if(checkVowels(s.charAt(start)))
            {
                count--;
                start++;
            }
            else
            start++;

            end++;

            if(checkVowels(s.charAt(end)))
            {
                count++;
            }

            if(count> ans)
            ans= count;
        }

        return ans;
        }
    
    
        public static void main(String[] args) {
    
    
            String s="leetcode";
            int k=3;
    
            System.out.println(maxVowels(s,k));

    }
}
