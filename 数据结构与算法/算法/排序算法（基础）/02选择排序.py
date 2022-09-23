# 选择排序
import random


def select_sort(alist):
    # index (0, length -1)
    n = len(alist)
    # 遍历元素 递增比较 n 次
    for i in range(n):
        max_index = i
        # 从 i + 1 到 n
        for j in range(i+1, n):
            if alist[max_index] < alist[j]:
                max_index = j
        # 如果最大数就是当前数,不用交换
        if max_index != i:
            alist[max_index], alist[i] = alist[i], alist[max_index]
    return alist


def main():
    alist = random.sample([i for i in range(0, 100)], 15)
    print('排序前 list:' + str(alist))
    print('排序后 list:' + str(select_sort(alist)))


if __name__ == '__main__':
    main()
