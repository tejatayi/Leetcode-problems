//735. Asteroid Collision


import java.util.Stack;

public class problem735 {
    public static int[] asteroidCollision(int[] as) {
        
       Stack<Integer> st = new Stack<>();
        int i=0;

        while(i<as.length)
        {
            if(as[i]<0 && !st.isEmpty() && st.peek()>0)
            {
                if(Math.abs(as[i])> st.peek())
                {
                    st.pop();
                    continue;
                }
                if(Math.abs(as[i])< st.peek())
                {
                    i++;
                    continue;
                }
                if(Math.abs(as[i])==st.peek())
                {
                    st.pop();
                    i++;
                    continue;
                }
            }
            else
            {
                st.push(as[i]);
                i++;
            }
        }

       int [] ans = new int[st.size()];
       
       for(int j=st.size()-1; j>=0;j--)
       {
            ans[j]=st.pop();
       }
       
        return ans;

    }





    public static void main(String[] args) {
        int [] b = {10,2,-5};
        int [] a= asteroidCollision(b);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }



}
