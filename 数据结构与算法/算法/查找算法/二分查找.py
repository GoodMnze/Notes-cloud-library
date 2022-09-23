# 二分查找
import random


def binary_search(alist, target):
    low, high = 0, len(alist) - 1
    while low <= high:
        mid = (low + high) // 2
        if alist[mid] == target:
            return mid
        if alist[mid] > target:
            high = mid - 1
        else:
            low = mid + 1
    return -1


def main():
    alist = random.sample([i for i in range(0, 100)], 20)
    alist.sort()
    print('list:' + str(alist))
    # 左右都开放的区间
    target = random.randint(0, 2)
    print(f'要查找的数是:{alist[target]}')
    print(f'binary_search result:{binary_search(alist,alist[target])}')


if __name__ == '__main__':
    main()
