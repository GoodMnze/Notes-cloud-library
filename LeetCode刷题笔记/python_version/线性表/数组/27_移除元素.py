from typing import List

# 找出所有不等于 val 的值  覆盖
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        target = 0
        for i in nums:
            if i != val:
                nums[target] = i
                target += 1
        return target
