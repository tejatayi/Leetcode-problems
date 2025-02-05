//3304. Find the K-th Character in String Game I

public class problem3304 {



    public static char helper(int k , String a )
    {
        if(a.length()>=k)
        return a.charAt(k-1);

        StringBuffer b= new StringBuffer(a);

        for(int i =0;i<a.length();i++)
        {
            char next = a.charAt(i);
            next =(next=='z')? 'a' :(char)(next+1);
            b.append(next);
        }

        return helper(k, b.toString());

    }


    public static char kthCharacter(int k) {
        String a="a";
       return helper(k, a);
    }


    public static void main(String[] args) {

        System.out.println(kthCharacter(5));

    }
}
