# 归并排序 先分后治
import random


def merge_sort(alist):
    # 先分后治
    n = len(alist)
    # 出口
    if n <= 1:
        return alist
    mid = n // 2
    lift_list = merge_sort(alist[:mid])
    right_list = merge_sort(alist[mid:])

    # 合并 result: 接收结果
    result = []
    lift_pointer, right_pointer = 0, 0
    while lift_pointer < len(lift_list) and right_pointer < len(right_list):
        if lift_list[lift_pointer] <= right_list[right_pointer]:
            result.append(lift_list[lift_pointer])
            lift_pointer += 1
        else:
            result.append(right_list[right_pointer])
            right_pointer += 1
    # 越界后处理
    result += lift_list[lift_pointer:]
    result += right_list[right_pointer:]
    return result


def main():
    alist = random.sample([i for i in range(0, 100)], 15)
    print('排序前:' + str(alist))
    print('排序后:' + str(merge_sort(alist)))


if __name__ == '__main__':
    main()
