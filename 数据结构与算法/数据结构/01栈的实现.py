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
