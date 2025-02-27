from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
        """
        
        # Solution 1: Time O(n), Space O(1)
        
        # last index in nums1
        last = m + n - 1

        # merge in reverse order
        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[last] = nums1[m - 1]
                m -= 1
            else:
                nums1[last] = nums2[n - 1]
                n -= 1
            last -= 1
        

        # fill remaining nums2 elements in nums1
        while n > 0:
            nums1[last] = nums2[n - 1]
            n -= 1
            last -= 1