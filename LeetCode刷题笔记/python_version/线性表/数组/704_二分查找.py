class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        low, high = 0, len(nums) - 1
        while low <= high:
            mid = (low + high) // 2
            if nums[mid] == target:
                return mid
            if nums[mid] > target:
                high = mid - 1
            else:
                low = mid + 1
        return -1

# python 中特别需要注意缩进
#   二分查找中两个可以改变的点
#     1. len 的定义可以为左开右闭 或者左开右开
#     2. 取决于 mid 的值是否有意义
#     3. low <= 或者 low <
#     4. 是否需要放出来 nums[mid]
