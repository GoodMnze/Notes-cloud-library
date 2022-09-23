from threading import Lock, Thread
from time import sleep


class Account(object):
    def __init__(self):
        self._balance = 0
        self._lock = Lock()  # 初始化的时候就加了锁

    def deposit(self, money):
        # 先获取锁才能操作
        self._lock.acquire()
        try:
            self._balance += money
        finally:
            self._lock.release()

    @property
    def balance(self):
        return self._balance


class AddMoneyThread(Thread):
    # 也可以传递 类当参数  没有明确的判断
    def __init__(self, account, money):
        # 要调用父类的 初始化方法
        super(AddMoneyThread, self).__init__()
        self._account = account
        self.money = money

    def run(self):
        self._account.deposit(self.money)


def main():
    account = Account()
    # 列表
    threads = []
    for _ in range(100):
        t = AddMoneyThread(account, 1)
        threads.append(t)
        # 以列表的方式启动进程
        t.start()
    for t in threads:
        t.join()
    print(f'账户余额为: {account.balance}')


if __name__ == '__main__':
    main()
