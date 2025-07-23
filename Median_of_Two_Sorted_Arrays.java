import java.util.Arrays;

class Median
{
    int median(int[] nums1, int[] nums2)
    {
        int[] x=new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, x, 0, nums1.length);
        System.arraycopy(nums2,0,x, x,nums2.length)
        int n=x.length;
        if (n%2==0)
        {
            int y=(x[n/2-1]+x[n/2])/2;
            return y;
        }
        else
        {
            return (x[n/2]);
        }
    }
}

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args)
    {
        int[] nums1={1,3};
        int[] nums2={2};
        Median m=new Median();
        System.out.println(m.median(nums1, nums2));
    }
}

