import java.util.Arrays;

class Solution
{
    double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] x=new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, x, 0, nums1.length);
        System.arraycopy(nums2,0, x, nums1.length, nums2.length);
        Arrays.sort(x);
        int n=x.length;
        if (n%2==0)
        {
            return (x[n/2-1]+x[n/2])/2.0;
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
        int[] nums2={2,4};
        Solution m=new Solution();
        System.out.println(m.findMedianSortedArrays(nums1, nums2));
    }
}

