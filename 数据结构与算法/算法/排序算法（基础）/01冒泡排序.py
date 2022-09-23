# 冒泡排序  时间: O(n) 空间: O(1)
import random


def bubble_sort(alist):  # 不能用 list 当参数
    n = len(alist) -1
    for k in range(n):
        for i in range(n - k):
            if alist[i] > alist[i + 1]:
                alist[i], alist[i + 1] = alist[i + 1], alist[i]


def main():
    # 等会改进一下 用随机数生成
    # alist = [1, 34, 2, 5, 5, 3, 46, 6, 23, 4, 2, 41]
    # alist = random.sample([i for i in range(0, 10)], 10)
    alist = [random.randint(0, 10)for i in range(10)]
    print('排序前 alist:', end='')
    print(alist)
    print('排序后 alist:', end='')
    bubble_sort(alist)  # 如果没有设返回值，不能作为 print 的参数
    print(alist)


if __name__ == '__main__':
    main()