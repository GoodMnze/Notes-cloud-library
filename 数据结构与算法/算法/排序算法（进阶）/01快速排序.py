import random


# 后面再优化吧,暂时 不想动了
def quick_sort(alist, start, end):
    # base = random.randint(start, end)
    # 出口
    if start > end:
        return
    low, high = start, end
    base = low
    # 中间没有数 就不需要再比较了
    while low < high:
        # 所有小于等于 直接过
        if alist[base] >= alist[low + 1]:
            low += 1
        # 大于基准数的 和右边第一个数交换
        else:
            alist[low + 1], alist[high] = alist[high], alist[low + 1]
            high -= 1
    if alist[base] < alist[low]:
        low -= 1
    alist[base], alist[low] = alist[low], alist[base]

    quick_sort(alist, start, low - 1)
    quick_sort(alist, low + 1, end)

    return alist


def main():
    alist = random.sample([i for i in range(0, 99)], 15)
    print('排序前:' + str(alist))
    # len = 15
    start, end = 0, len(alist) - 1
    result = quick_sort(alist, start, end)
    print('排序后:' + str(result))


if __name__ == '__main__':
    main()
