# 1. 类的定义
import os
from time import sleep, localtime, time


class Student(object):
    # __init__ 是一个初始化方法 绑定属性、初始化
    def __init__(self, name, age):
        self.name = name
        self.__age = age

    def study(self, course_name):
        print(f'{self.name}正在学习 {course_name}')

    # 定义一个私有权限的方法
    def __play(self):
        print('访问到私有方法')  # AttributeError: 'Student' object has no attribute '__play'


# 2. 类的使用
# def main():
#     stu = Student('肖灵锋', 18)
#     stu.study('Python')
#     # 访问私有 属性
#     stu._Student__play()
#     print(stu._Student__age)
# # 伪权限 只是改变了访问方式
#
# if __name__ == '__main__':
#     main()

# 4. 定义一个描述时钟的类
class Clock(object):
    # __slots__ 魔法属性 用于限定参数
    # // 名字都不许一样
    __slots__ = ('_hour', '_minute', '_second')

    def __init__(self, hour=0, minute=0, second=0):
        self._hour = hour
        self._minute = minute
        self._second = second

    # staticmethod 静态工具方法 校验参数 返回 boolean
    @staticmethod
    def is_valid(hour, minute, second):
        return 24 >= hour >= 0 and 60 >= minute >= 0 and 60 >= second >= 0

    # classMethod init 之前会调用一次
    @classmethod
    def now(cls):
        now_time = localtime(time())
        return cls(now_time.tm_hour, now_time.tm_min, now_time.tm_sec)

    # 加入构造方法 generator 不能自动生成 很恶心
    @property
    def hour(self):
        return self._hour

    # 修改器 - setter方法
    @hour.setter  # property 和 setter 是一套的
    def hour(self, hour):
        self._hour = hour

    def run(self):
        # 赋值 = ， boolean ==
        self._second += 1
        if self._second == 60:
            self._second = 0
            self._minute += 1
            if self._minute == 60:
                self._minute = 0
                self._hour += 1
                if self._hour == 24:
                    self._hour = 0

    def show(self):
        # return f'{self._hour}:{self._minute}:{self._second}'
        return '%02d:%02d:%02d' % \
               (self._hour, self._minute, self._second)


def main():
    hour, minute, second = 1, 2, 3
    x = 0  # 加一个次数控制
    if Clock.is_valid(hour, minute, second):
        clock = Clock(hour, minute, second)
        while x < 10:
            os.system('cls')  # 没有生效
            print(clock.show())  # 调用方法要加括号
            clock.run()
            sleep(1)
            x += 1
    else:
        print('输入无效')
    # class_method 的测试
    # 上面是死循环， 所以到不了这里
    clock1 = Clock.now()
    while True:
        os.system('cls')  # 没有生效
        print(clock1.show())  # 调用方法要加括号
        clock1.run()
        sleep(1)


if __name__ == '__main__':
    main()
