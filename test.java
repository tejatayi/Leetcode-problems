import java.util.*;

public class test {
    

    public static void main(String[] args) {
        
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();

       a.add("1");
       a.add("2");
       a.add("3");
       a.add("4");
       a.add("5");

       b.add("3");
       b.add("4");
       b.add("5");
       b.add("6");

       Set<String> inter = new HashSet<>(b);

       inter.retainAll(a);

       for(String s:inter)
       System.out.println(s);




    }


}
