from itertools import islice
from typing import List


def topKFrequent(nums: List[int], k: int) -> List[int]:
    
    """
    https://leetcode.com/problems/top-k-frequent-elements/submissions/1459421024/
    """
     
    # Brute ForceForce approach: Time complexity O(n log n), Space complexity O(n)

    # occurence_count = {}
    # for num in nums: # O(N)
    #     if num in occurence_count:
    #         occurence_count[num] += 1
    #     else:
    #         occurence_count[num] = 1
    
    # sorted_by_values = dict(sorted(occurence_count.items(), key=lambda item: item[1], reverse=True))
    
        
    # return list(islice(sorted_by_values.keys(), k))


    # Optimized approach with Heap: Time complexity O(n log n), Space complexity O(n)

    from collections import Counter
    import heapq

    count = Counter(nums)
    print(count.get)
    return heapq.nlargest(k, count.keys(), key=count.get)


print(topKFrequent([-1, -1], 2))