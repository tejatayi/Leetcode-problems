//1071. Greatest Common Divisor of Strings

public class problem1071 {


    public static int gcd (int a , int b)
        {
            if (a == 0) {
            return b;
            }
            if(b==0)
            return a;
            return gcd(b, a % b);
        }
    
        public static   String gcdOfStrings(String str1, String str2) {
                    
                    if((str1+str2).equals(str2+str1))
                    {
                         int a,b;
                    a=str1.length();
                    b=str2.length();
            
                    a=gcd(a,b);
        
                return str1.substring(0,a);
        
                }
        
                return "";
        
            }
        
           
        
            public static void main(String[] args)
            {
                
                String a = "ABCABC";
                String b ="ABC";
        
                System.out.println(gcdOfStrings(a,b));
       
        return;
    }
}


