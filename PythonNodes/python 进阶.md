# 数据结构与算法 python 版

## 算法

### 1. 排序算法(基本)

#### 1.1 冒泡

``` python
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
```

#### 1.2 选择排序

```python
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
# 总结
# 1. 写出来只是最基础的学习
# 2. 学习算法不是让自己对某个算法更熟悉，这个过程是在锻炼自己的思维，所以一定要聪明的动脑子
```

#### 1.3 插入排序

```python
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

```

### 2. 排序算法（进阶）

#### 2.1 快排

```python
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
```



#### 2.2 归并

```python
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
```

### 3. 查找算法

#### 3.1 二分查找

```python
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
```

## 数据结构

### 1. 数据结构实现

#### 1.1 栈的实现

```python
# 栈的实现
class Stack(object):
    # 初始化一个空栈
    def __init__(self):
        self.__list = []

    # 添加一个元素
    def push(self, item):
        self.__list.append(item)

    # 弹出栈顶元素 pop
    def pop(self):
        return self.__list.pop()

    # 返回栈顶元素
    # 增加了一个判断 栈不为空 才拿最后补一个元素 不然会越界
    def peek(self):
        if self.__list:
            return self.__list[len(self.__list) - 1]
        return None

    # 返回栈的元素个数
    def size(self):
        return len(self.__list)

    # 判断是否为空
    def is_empty(self):
        return self.__list == []


def main():
    # 压栈
    stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    # 是否为空
    print(f'是否为空:{stack.is_empty()}')
    # 返回栈顶元素
    print(f'栈顶元素:{stack.peek()}')
    # 返回元素个数
    print(f'size:{stack.size()}')
    # 出栈
    print('出栈:', end='')
    print(stack.pop(), end=' ')
    print(stack.pop(), end=' ')
    print(stack.pop(), end=' ')
    print(stack.pop())
    # 是否为空
    print(f'是否为空:{stack.is_empty()}')
    # 返回栈顶元素
    print(f'栈顶元素:{stack.peek()}')
    # 返回元素个数
    print(f'size:{stack.size()}')


if __name__ == '__main__':
    main()
```

#### 1.2 队列的实现

```python
# 队列的实现
class Queue:

    # 初始化方法
    def __init__(self):
        self.__list = []

    # 这里有两种写法
    # 尾插 头出:  插入比较多的时候使用
    # 头插 尾出:  取出比较多的时候使用
    # 添加一个元素
    def enqueue(self, item):
        self.__list.insert(0, item)

    # 从队列头部删除一个
    def dequeue(self):
        return self.__list.pop()

    # 判断是否为空
    def is_empty(self):
        return self.__list == []

    # 返回队列的大小
    def size(self):
        if self.__list:
            return len(self.__list) - 1
        return None


def mian():
    # 初始化队列 要加括号
    queue = Queue()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    # is_empty 测试
    print(f'is_empty 测试: {queue.is_empty()}')
    # size 测试
    print(f'size 测试: {queue.size()}')
    # 出栈测试
    print('出栈测试:', end='')
    print(queue.dequeue(), end='')
    print(queue.dequeue(), end='')
    print(queue.dequeue(), end='')
    print(queue.dequeue())
    # is_empty 测试
    print(f'is_empty 测试: {queue.is_empty()}')
    # size 测试
    print(f'size 测试: {queue.size()}')


if __name__ == '__main__':
    mian()
```



### API

#### 1. 生成随机数

```python
    # 随机数(有重复值)  random.randint(0,10): 获得 0 - 9 的随机数 + 循环十次
    alist = [random.randint(0, 10)for i in range(10)]
    # 随机数(无重复值)  random.sample(sample, number)
    alist = random.sample([i for i in range(0, 10)], 10)
```

