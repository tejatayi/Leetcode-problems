
//649. Dota2 Senate

import java.util.LinkedList;
import java.util.Queue;

public class problem649 {
    public static String predictPartyVictory(String senate) {
        
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<senate.length();i++)
        {
            if(senate.charAt(i)== 'R')
            rad.add(i);
            else
            dir.add(i);

        }

        while(!rad.isEmpty() && !dir.isEmpty())
        {
            int r = rad.poll();
            int d = dir.poll();
            if(r<d)
            {
                rad.add(r+n);
            }
            else
            dir.add(d+n);
        }


        return rad.isEmpty() ?  "Dire": "Radiant";

    }


    public static void main(String[] args) {
        String a ="RD";

        System.out.println(predictPartyVictory(a));

    }
}
