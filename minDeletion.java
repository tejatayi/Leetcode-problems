
//Minimum Deletions to Make Array Beautiful problem number 2216
public class minDeletion {

    public static int min(int[] n) {
        
        int count=0;
        for(int i=0;i<n.length;i++)
        {
            if((i-count)%2==0)
            {
                for(int j=i+1;j<n.length;j++)
                {
                    if(n[i]==n[j]){
                        count++;
                        i++;
                       
                    }
                    else
                    {
                        //j++;
                        i=j;
                        break;
                    }
                }  
            }
        }
        if((n.length-count)%2 != 0)
        count++;

        return count;
    }

    public static void main(String[] args){
       
            int [] n= {8,8,8,8};

            System.out.println(min(n));
        return ;
    }
}