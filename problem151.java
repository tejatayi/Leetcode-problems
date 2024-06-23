//151. Reverse Words in a String



class Problem151 {

    public static String reverseWords(String s) {
        
       String [] x = s.split(" ");
       
       String ans = "";
       for(int i=(x.length)-1;i>=0;i--)
       {
            if(x[i]!="")
            {
                ans+=x[i];
                ans+=" ";
            }
        
       }
      
    String fin="";
    
    for(int i=0;i<ans.length()-1;i++)
    {
        fin+=ans.charAt(i);             //removing the last space 
    }
    
//      System.out.println('"'+fin+'"');       


        return fin;
    }

    public static void main(String[] args){
       
            String x = "the sky is blue";

            reverseWords(x);

           // System.out.println();
        return ;
    }
}