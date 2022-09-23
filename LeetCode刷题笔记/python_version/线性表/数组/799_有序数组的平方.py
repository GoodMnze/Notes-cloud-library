from typing import List


class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        # 审题：
        #     initial:递增数组
        #     return: 平方递增数组
        #     issue：平方后顺序不一样
        # 实现：
        #     双指针，慢指针走到 >= 0  结束
        #     [low - high) [high,length -1]
        #     merge

        # 代码
        # 1. 处理左指针 得到第一个大于等于 0 的下标
        n = len(nums)
        low, high = 0, n
        while nums[low] < 0:
            low += 1
        # 2. merge
        newNums, index = [], 0
        while low < high < len(nums):
            if nums[low] < nums[high]:
                newNums[index] = nums[low]
                index += 1
                low += 1
            else:
                newNums[index] = nums[high]
                index += 1
                high += 1
        # 3. 处理越界数组
        newNums += nums[:high]
        newNums += nums[high:]

        return newNums


def main():
    nums = [-4, -1, 0, 3, 10]
    Solution.sortedSquares(nums)


if __name__ == '__main__':
    main()
