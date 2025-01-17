//443. String Compression


public class problem443 {
    public static int compress(char[] s) {
        
            int read=0,write=0;
    
            while(read<s.length)
            {
                char tem = s[read];
                s[write]=tem;
                write++;
    
                int c=1;
                read++;
    
                while ( read<s.length && s[read]==tem) {
                    
                    c++;
                    read++;
    
                }
                
                if(c>1)
                {
                    char [] num = String.valueOf(c).toCharArray();
    
                    for(int i=0;i<num.length;i++)
                    {
                        s[write]=num[i];
                        write++;
                    }
    
                }
    
            }
            
            return write;
    
        }
    
        public static void main(String[] args) {
            
            char [] c = {'a','a','b','b','c','c','c'};
    
            int ans = compress(c);

            for(int i=0;i<ans;i++)
            {
                System.out.print(c[i]+" ");
            }

    }
}
