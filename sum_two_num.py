from collections import defaultdict
nums=[2,7,11,15]
target=9

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        index=defaultdict(list)
        
        for i,num in enumerate(nums):
            s=target-num
            if s in index:                
                return(index[s],i)
            index[num]=i


sol=Solution()
print(sol.twoSum(nums,target))


