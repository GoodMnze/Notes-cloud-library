# 插入排序
import random


def insert_sort(alist):
    # 列表长度
    n = len(alist)
    # 递增: 每次插入一个数
    for i in range(1, n):
        j = i
        # 递减: 每次从 i - 1 比较到 0
        while j > 0:
            if alist[j] < alist[j - 1]:
                alist[j], alist[j - 1] = alist[j - 1], alist[j]
            else:
                break
            j -= 1
    return alist


def main():
    alist = random.sample([i for i in range(1, 100)], 15)
    print('排序前数组:' + str(alist))
    print('排序后数组:' + str(insert_sort(alist)))


if __name__ == '__main__':
    main()
