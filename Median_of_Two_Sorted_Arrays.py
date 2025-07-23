class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        x=sorted(nums1+nums2)
        n=len(x)
        if n%2==0:
            y=float(x[n//2-1]+x[n//2])
            return float(y/2)
        else:
            return float(x[n//2])

nums1=[1,2]
nums2=[3]

sol=Solution()
print(sol.findMedianSortedArrays(nums1,nums2))