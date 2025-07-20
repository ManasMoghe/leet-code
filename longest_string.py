
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        count=0
        t=[]
        for char in s:
            if char in t:
                t=t[t.index(char)+1:]
            else:
                t.append(char)
                count=max(count,len(t))
        return(count)

s = "pwwkew"
sol=Solution()
print(sol.lengthOfLongestSubstring(s))