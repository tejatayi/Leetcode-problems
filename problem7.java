//7. Reverse Integer

public class problem7 {
    public static int reverse(int x) {
        long sum=0;
        long abs;
        if(x<0){
            x = x*-1;
            while(x>0){
                abs = x%10;
                sum = sum*10 + abs;
                x = x/10;
            }
            sum=sum*-1;
        }
        else{
            while(x>0){
                abs = x%10;
                sum = sum*10 + abs;
                x = x/10;
            }
        }
        if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE){
            return 0;
        }
        return (int)sum;
    }


    public static void main(String[] args) {
        
        System.out.println(reverse(123));

    }
}
