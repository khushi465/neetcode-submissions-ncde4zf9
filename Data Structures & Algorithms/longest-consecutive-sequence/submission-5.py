class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
                return 0
        seen=set()
        for n in nums:
                seen.add(n)
        count, maxC=1,1
        for i in seen:
                if (i-1) not in seen:
                        count=1
                        while (i+1) in seen:
                                count+=1
                                i+=1
                        maxC=max(count,maxC)
        return maxC