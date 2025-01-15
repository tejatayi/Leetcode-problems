//11.Container With Most Water


public class problem11 {
    

    public static void main(String[] args) {
        int [] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }

    public static int maxArea(int[] height) {
        
        int area=0;
        int max=0;
        int i=0,j=height.length-1;

        while(i<j)
        {
            area = (j-i)*(Math.min(height[i],height[j]));
            if(area>max)
            max=area;

            if(height[i]<=height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        return max;
    }
}
