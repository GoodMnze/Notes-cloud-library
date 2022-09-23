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
