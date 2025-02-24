from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
        """

        # Time O(n), Space O(1)
        
        left = 1

        for r in range(1, len(nums)):
            if nums[r] != nums[r - 1]:
                nums[left] = nums[r]
                left += 1
            
        return left