

# python 基础

## 一、 基本数据类型和简单运算

### 1. 变量和类型
#### 1.1 整形
* python 可以处理任意大小的整数，python 中只有int
#### 1.2 浮点型
* 小数类型，支持科学科学计算法（1.2346e2）
#### 1.3 字符串性
* 文本类型
#### 1.4 布尔型
* true or flase
#### 1.5 复数型
* 数学上的复数
### 2. 变量
#### 2.1 硬性规则
* 构成： 字母、数字（不能开头）、下划线
* 大小写敏感
* 不能更关键字和系统保留字冲突
#### 2.2 PEP8 要求
* 小写字母拼写，多个单词下划线连接
* 受保护的实例属性单个下划线开头
* 私有的实例属性用两个下划线开头

#### 2.3 变量的使用

``` python
# 变量类型测试
a = 1
b = 1.1
c = '1.1'
d = True
e = 1 + 5j
print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(type(e))
```
* 输出结果

![image-20220909184129201](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20220909184129201.png)
#### 2.4 变量转换
* int():将一个数值或字符串转成整数，可以指定进制
* float（）： 将一个字符转成浮点数
* str   （）： 将指定的对象转成字符串，可以指定编码
* chr  （）： 将整数转成字符
* ord （）： 将字符转成编码
##### 代码测试

* 占位符语法 %d %f

``` python
a = int(input('a = '))
b = int(input('b = '))
print('%d + %d = %d' % (a, b))
```

##### 输出结果

![image-20220909185414076](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20220909185414076.png)

### 3. 运算符

| 运算符                                          | 描述                           |
| ----------------------------------------------- | ------------------------------ |
| `[]` `[:]`                                      | 下标，切片                     |
| `**`                                            | 指数                           |
| `~` `+` `-`                                     | 按位取反, 正负号               |
| `*` `/` `%` `//`                                | 乘，除，模，整除               |
| `+` `-`                                         | 加，减                         |
| `>>` `<<`                                       | 右移，左移                     |
| `&`                                             | 按位与                         |
| `^` `|`                                         | 按位异或，按位或               |
| `<=` `<` `>` `>=`                               | 小于等于，小于，大于，大于等于 |
| `==` `!=`                                       | 等于，不等于                   |
| `is` `is not`                                   | 身份运算符                     |
| `in` `not in`                                   | 成员运算符                     |
| `not` `or` `and`                                | 逻辑运算符                     |
| `=` `+=` `-=` `*=` `/=` `%=` `//=` `**=` `&=` ` | =` `^=` `>>=` `<<=`            |

### 4. 练习

* 计算闰年

``` python
year = int (input('请输入年份：'))
if (year % 4 == 0 and year % 100 != 0 or \
          year % 400 == 0):
    print("%d 是闰年" % year)
else: 
	print("%d 不是闰年" % year)
```

## 二、 条件分支和循环

### 1. if 条件分支

``` python
if 条件 ：
	输出
elif：
	输出
else：
	输出
```

### 2. 循环结构

#### 2.1 for 循环

* range（start，end，add） 前开后闭

- `range(101)`：可以用来产生0到100范围的整数，需要注意的是取不到101。

- `range(1, 101)`：可以用来产生1到100范围的整数，相当于前面是闭区间后面是开区间。

- `range(1, 101, 2)`：可以用来产生1到100的奇数，其中2是步长，即每次数值递增的值。

- `range(100, 0, -2)`：可以用来产生100到1的偶数，其中-2是步长，即每次数字递减的值。

  ``` PYTHON
  	sum = 0
      for x in range(1,101):
      	if x % 2 == 0:
              sum += x
      print(sum)
  ```

#### 2.2 while 循环

```
while Ture:
    if j:
        break;
```



### ### 3.  练习

``` python
# 4. 三角练习
for x in range(6):
    for y in range(a - x):
        print(' ',end="")
    for z in range(x * 2 + 1):
        print("*", end='')
    print('')
```





* 结果

  

  ![image-20220909212305264](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20220909212305264.png)

* python print 默认有一个结尾符， 要注意

## 三、函数和模块的使用

### 1.  函数

#### 1.1 函数的定义 和 使用

```python
# num 的阶乘
def fac(num)
	result = 1
    for n in range(1,num + 1):
        result *= n
    return result
```

#### 1.2 函数的参数

* python 函数的参数可以有默认值，也可以使用可变参数
* 所以并不需要支持函数的重载

#### 1.3 函数默认值

* 不传入参数使用默认参数
* 可以按顺序传一部分
* 也可以传一部分值

```python
def add(a = 0, b = 0, c = 0)
add(1,1) 
add(a = 1, b = 3)
```

#### 1.4 可变参数

* 可以传入多个参数

```python
def add(*args)
add()
add(1,2,34,5)
```

### 2. 模块

#### 2.1 从包导入指定函数

```python
from module1 import foo 
foo()
```

#### 2.2 起别名

```python
from module as m1
m1.foo()
```

#### 2.3 _main_

```python
# __name__是Python中一个隐含的变量它代表了模块的名字
# 只有被Python解释器直接执行的模块的名字才是__main__
if __name__ == '__main__':
    print('call foo()')
    foo()
    print('call bar()')
    bar()
```

### 3. 变量的作用域

* global 全局
* nonlocal 嵌套作用域

## 四、字符串和常用数据结构

### 1. 字符串

​		Python为字符串类型提供了非常丰富的运算符，我们可以使用`+`运算符来实现字符串的拼接，可以使用`*`运算符来重复一个字符串的内容，可以使用`in`和`not in`来判断一个字符串是否包含另外一个字符串（成员运算），我们也可以用`[]`和`[:]`运算符从字符串取出某个字符或某些字符（切片运算），代码如下所示。

```python
s1 = 'hello ' * 3
print(s1) # hello hello hello 
s2 = 'world'
s1 += s2
print(s1) # hello hello hello world
print('ll' in s1) # True
print('good' in s1) # False
str2 = 'abc123456'
# 从字符串中取出指定位置的字符(下标运算)
print(str2[2]) # c
# 字符串切片(从指定的开始索引到指定的结束索引)
print(str2[2:5]) # c12
print(str2[2:]) # c123456
print(str2[2::2]) # c246
print(str2[::2]) # ac246
print(str2[::-1]) # 654321cba
print(str2[-3:-1]) # 45
```

在Python中，我们还可以通过一系列的方法来完成对字符串的处理，代码如下所示。

```python
str1 = 'hello, world!'
# 通过内置函数len计算字符串的长度
print(len(str1)) # 13
# 获得字符串首字母大写的拷贝
print(str1.capitalize()) # Hello, world!
# 获得字符串每个单词首字母大写的拷贝
print(str1.title()) # Hello, World!
# 获得字符串变大写后的拷贝
print(str1.upper()) # HELLO, WORLD!
# 从字符串中查找子串所在位置
print(str1.find('or')) # 8
print(str1.find('shit')) # -1
# 与find类似但找不到子串时会引发异常
# print(str1.index('or'))
# print(str1.index('shit'))
# 检查字符串是否以指定的字符串开头
print(str1.startswith('He')) # False
print(str1.startswith('hel')) # True
# 检查字符串是否以指定的字符串结尾
print(str1.endswith('!')) # True
# 将字符串以指定的宽度居中并在两侧填充指定的字符
print(str1.center(50, '*'))
# 将字符串以指定的宽度靠右放置左侧填充指定的字符
print(str1.rjust(50, ' '))
str2 = 'abc123456'
# 检查字符串是否由数字构成
print(str2.isdigit())  # False
# 检查字符串是否以字母构成
print(str2.isalpha())  # False
# 检查字符串是否以数字和字母构成
print(str2.isalnum())  # True
str3 = '  jackfrued@126.com '
print(str3)
# 获得字符串修剪左右两侧空格之后的拷贝
print(str3.strip())
```

#### 1.1 字符串语法糖

我们之前讲过，可以用下面的方式来格式化输出字符串。

```python
a, b = 5, 10
print('%d * %d = %d' % (a, b, a * b))
```

当然，我们也可以用字符串提供的方法来完成字符串的格式，代码如下所示。

```python
a, b = 5, 10
print('{0} * {1} = {2}'.format(a, b, a * b))
```

Python 3.6以后，格式化字符串还有更为简洁的书写方式，就是在字符串前加上字母`f`，我们可以使用下面的语法糖来简化上面的代码。

```python
a, b = 5, 10
print(f'{a} * {b} = {a * b}')
```

### 2. 列表

下面的代码演示了如何定义列表、如何遍历列表以及列表的下标运算。

```python
list1 = [1, 3, 5, 7, 100]
print(list1) # [1, 3, 5, 7, 100]
# 乘号表示列表元素的重复
list2 = ['hello'] * 3
print(list2) # ['hello', 'hello', 'hello']
# 计算列表长度(元素个数)
print(len(list1)) # 5
# 下标(索引)运算
print(list1[0]) # 1
print(list1[4]) # 100
# print(list1[5])  # IndexError: list index out of range
print(list1[-1]) # 100
print(list1[-3]) # 5
list1[2] = 300
print(list1) # [1, 3, 300, 7, 100]
# 通过循环用下标遍历列表元素
for index in range(len(list1)):
    print(list1[index])
# 通过for循环遍历列表元素
for elem in list1:
    print(elem)
# 通过enumerate函数处理列表之后再遍历可以同时获得元素索引和值
for index, elem in enumerate(list1):
    print(index, elem)
```

下面的代码演示了如何向列表中添加元素以及如何从列表中移除元素。

```python
list1 = [1, 3, 5, 7, 100]
# 添加元素
list1.append(200)
list1.insert(1, 400)
# 合并两个列表
# list1.extend([1000, 2000])
list1 += [1000, 2000]
print(list1) # [1, 400, 3, 5, 7, 100, 200, 1000, 2000]
print(len(list1)) # 9
# 先通过成员运算判断元素是否在列表中，如果存在就删除该元素
if 3 in list1:
	list1.remove(3)
if 1234 in list1:
    list1.remove(1234)
print(list1) # [1, 400, 5, 7, 100, 200, 1000, 2000]
# 从指定的位置删除元素
list1.pop(0)
list1.pop(len(list1) - 1)
print(list1) # [400, 5, 7, 100, 200, 1000]
# 清空列表元素
list1.clear()
print(list1) # []
```

和字符串一样，列表也可以做切片操作，通过切片操作我们可以实现对列表的复制或者将列表中的一部分取出来创建出新的列表，代码如下所示。

```python
fruits = ['grape', 'apple', 'strawberry', 'waxberry']
fruits += ['pitaya', 'pear', 'mango']
# 列表切片
fruits2 = fruits[1:4]
print(fruits2) # apple strawberry waxberry
# 可以通过完整切片操作来复制列表
fruits3 = fruits[:]
print(fruits3) # ['grape', 'apple', 'strawberry', 'waxberry', 'pitaya', 'pear', 'mango']
fruits4 = fruits[-3:-1]
print(fruits4) # ['pitaya', 'pear']
# 可以通过反向切片操作来获得倒转后的列表的拷贝
fruits5 = fruits[::-1]
print(fruits5) # ['mango', 'pear', 'pitaya', 'waxberry', 'strawberry', 'apple', 'grape']
```

下面的代码实现了对列表的排序操作。

```python
list1 = ['orange', 'apple', 'zoo', 'internationalization', 'blueberry']
list2 = sorted(list1)
# sorted函数返回列表排序后的拷贝不会修改传入的列表
# 函数的设计就应该像sorted函数一样尽可能不产生副作用
list3 = sorted(list1, reverse=True)
# 通过key关键字参数指定根据字符串长度进行排序而不是默认的字母表顺序
list4 = sorted(list1, key=len)
print(list1)
print(list2)
print(list3)
print(list4)
# 给列表对象发出排序消息直接在列表对象上进行排序
list1.sort(reverse=True)
print(list1)
```

> 生成器

我们还可以使用列表的生成式语法来创建列表，代码如下所示。

```python
f = [x for x in range(1, 10)]
print(f)
f = [x + y for x in 'ABCDE' for y in '1234567']
print(f)
# 用列表的生成表达式语法创建列表容器
# 用这种语法创建列表之后元素已经准备就绪所以需要耗费较多的内存空间
f = [x ** 2 for x in range(1, 1000)]
print(sys.getsizeof(f))  # 查看对象占用内存的字节数
print(f)
# 请注意下面的代码创建的不是一个列表而是一个生成器对象
# 通过生成器可以获取到数据但它不占用额外的空间存储数据
# 每次需要数据的时候就通过内部的运算得到数据(需要花费额外的时间)
f = (x ** 2 for x in range(1, 1000))
print(sys.getsizeof(f))  # 相比生成式生成器不占用存储数据的空间
print(f)
for val in f:
    print(val)
```

### 3. 元组

下面的代码演示了如何定义和使用元组。

```python
# 定义元组
t = ('骆昊', 38, True, '四川成都')
print(t)
# 获取元组中的元素
print(t[0])
print(t[3])
# 遍历元组中的值
for member in t:
    print(member)
# 重新给元组赋值
# t[0] = '王大锤'  # TypeError
# 变量t重新引用了新的元组原来的元组将被垃圾回收
t = ('王大锤', 20, True, '云南昆明')
print(t)
# 将元组转换成列表
person = list(t)
print(person)
# 列表是可以修改它的元素的
person[0] = '李小龙'
person[1] = 25
print(person)
# 将列表转换成元组
fruits_list = ['apple', 'banana', 'orange']
fruits_tuple = tuple(fruits_list)
print(fruits_tuple)
```

这里有一个非常值得探讨的问题，我们已经有了列表这种数据结构，为什么还需要元组这样的类型呢？

1. 元组中的元素是无法修改的，事实上我们在项目中尤其是[多线程](https://zh.wikipedia.org/zh-hans/多线程)环境（后面会讲到）中可能更喜欢使用的是那些不变对象（一方面因为对象状态不能修改，所以可以避免由此引起的不必要的程序错误，简单的说就是一个不变的对象要比可变的对象更加容易维护；另一方面因为没有任何一个线程能够修改不变对象的内部状态，一个不变对象自动就是线程安全的，这样就可以省掉处理同步化的开销。一个不变对象可以方便的被共享访问）。所以结论就是：如果不需要对元素进行添加、删除、修改的时候，可以考虑使用元组，当然如果一个方法要返回多个值，使用元组也是不错的选择。
2. 元组在创建时间和占用的空间上面都优于列表。我们可以使用sys模块的getsizeof函数来检查存储同样的元素的元组和列表各自占用了多少内存空间，这个很容易做到。我们也可以在ipython中使用魔法指令%timeit来分析创建同样内容的元组和列表所花费的时间。

### 4.  集合

Python中的集合跟数学上的集合是一致的，不允许有重复元素，而且可以进行交集、并集、差集等运算。

可以按照下面代码所示的方式来创建和使用集合。

```
# 创建集合的字面量语法
set1 = {1, 2, 3, 3, 3, 2}
print(set1)
print('Length =', len(set1))
# 创建集合的构造器语法(面向对象部分会进行详细讲解)
set2 = set(range(1, 10))
set3 = set((1, 2, 3, 3, 2, 1))
print(set2, set3)
# 创建集合的推导式语法(推导式也可以用于推导集合)
set4 = {num for num in range(1, 100) if num % 3 == 0 or num % 5 == 0}
print(set4)
```

向集合添加元素和从集合删除元素。

```
set1.add(4)
set1.add(5)
set2.update([11, 12])
set2.discard(5)
if 4 in set2:
    set2.remove(4)
print(set1, set2)
print(set3.pop())
print(set3)
```

集合的成员、交集、并集、差集等运算。

```python
# 集合的交集、并集、差集、对称差运算
print(set1 & set2)
# print(set1.intersection(set2))
print(set1 | set2)
# print(set1.union(set2))
print(set1 - set2)
# print(set1.difference(set2))
print(set1 ^ set2)
# print(set1.symmetric_difference(set2))
# 判断子集和超集
print(set2 <= set1)
# print(set2.issubset(set1))
print(set3 <= set1)
# print(set3.issubset(set1))
print(set1 >= set2)
# print(set1.issuperset(set2))
print(set1 >= set3)
# print(set1.issuperset(set3))
```

> **说明：** Python中允许通过一些特殊的方法来为某种类型或数据结构自定义运算符（后面的章节中会讲到），上面的代码中我们对集合进行运算的时候可以调用集合对象的方法，也可以直接使用对应的运算符，例如`&`运算符跟intersection方法的作用就是一样的，但是使用运算符让代码更加直观。

### 5.  字典

字典是另一种可变容器模型，Python中的字典跟我们生活中使用的字典是一样一样的，它可以存储任意类型对象，与列表、集合不同的是，字典的每个元素都是由一个键和一个值组成的“键值对”，键和值通过冒号分开。下面的代码演示了如何定义和使用字典。

```python
# 创建字典的字面量语法
scores = {'骆昊': 95, '白元芳': 78, '狄仁杰': 82}
print(scores)
# 创建字典的构造器语法
items1 = dict(one=1, two=2, three=3, four=4)
# 通过zip函数将两个序列压成字典
items2 = dict(zip(['a', 'b', 'c'], '123'))
# 创建字典的推导式语法
items3 = {num: num ** 2 for num in range(1, 10)}
print(items1, items2, items3)
# 通过键可以获取字典中对应的值
print(scores['骆昊'])
print(scores['狄仁杰'])
# 对字典中所有键值对进行遍历
for key in scores:
    print(f'{key}: {scores[key]}')
# 更新字典中的元素
scores['白元芳'] = 65
scores['诸葛王朗'] = 71
scores.update(冷面=67, 方启鹤=85)
print(scores)
if '武则天' in scores:
    print(scores['武则天'])
print(scores.get('武则天'))
# get方法也是通过键获取对应的值但是可以设置默认值
print(scores.get('武则天', 60))
# 删除字典中的元素
print(scores.popitem())
print(scores.popitem())
print(scores.pop('骆昊', 100))
# 清空字典
scores.clear()
print(scores)
```

### 6. 练习

#### 6.1  在屏幕上显示跑马灯

#### 6.2 设计一个函数生成指定长度的验证码，由大写字母和数字构成

## 五、 面向对象

> **面向对象：** "把一组数据结构和处理它们的方法组成对象（object），把相同行为的对象归纳为类（class），通过类的封装（encapsulation）隐藏内部细节，通过继承（inheritance）实现类的特化（specialization）和泛化（generalization），通过多态（polymorphism）实现基于对象类型的动态分派。"

### 1. 面向对象基础

#### 1.1 类的定义

```python
# 1. 类的定义
class Student(object):
    # __init__ 是一个初始化方法 绑定属性、初始化
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def study(self, course_name):
        print(f'#{self.name}正在学习#{course_name}')
```



#### 1.2 创建类和使用对象

```python
# 2. 类的使用
def main():
    stu = Student('肖灵锋', 18)
    stu.study('Python')


if __name__ == '__main__':
    main()
```

#### 1.3 类的权限

* We are all consenting adults here.

  ```python
  # 3. 私有属性的定义和私有属性的访问
  def main():
      stu = Student('肖灵锋', 18)
      stu.study('Python')
      # 访问私有 属性
      stu._Student__play()
      print(stu._Student__age)
  
  
  if __name__ == '__main__':
      main()
  ```

#### 1.4 练习

```python
# 4. 定义一个描述时钟的类
class Clock(object):
    def __init__(self, hour=0, minute=0, second=0):
        self._hour = hour
        self._minute = minute
        self._second = second

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
    clock = Clock(23, 59, 58)
    while True:
        # os.system('cls')  # 设置模拟输出控制台中的终端才会生效
        print(clock.show())  # 调用方法要加括号
        clock.run()
        sleep(1)


if __name__ == '__main__':
    main()
```

### 2. 面向对象进阶

#### 2.1 @property装饰器

> ​		之前我们讨论过Python中属性和方法访问权限的问题，虽然我们不建议将属性设置为私有的，但是如果直接将属性暴露给外界也是有问题的，比如我们没有办法检查赋给属性的值是否有效。我们之前的建议是将属性命名以单下划线开头，通过这种方式来暗示属性是受保护的，不建议外界直接访问，那么如果想访问属性可以通过属性的getter（访问器）和setter（修改器）方法进行对应的操作。如果要做到这点，就可以考虑使用@property包装器来包装getter和setter方法，使得对属性的访问既安全又方便，代码如下所示。

```python
 # 访问器 - getter方法
    @property
    def name(self):
        return self._name

    # 访问器 - getter方法
    @property
    def age(self):
        return self._age

    # 修改器 - setter方法
    @age.setter
    def age(self, age):
        self._age = age
```





#### 2.2  \_\_slots\_\_ 魔法 （枚举）

> ​		我们讲到这里，不知道大家是否已经意识到，Python是一门[动态语言](https://zh.wikipedia.org/wiki/动态语言)。通常，动态语言允许我们在程序运行时给对象绑定新的属性或方法，当然也可以对已经绑定的属性和方法进行解绑定。但是如果我们需要限定自定义类型的对象只能绑定某些属性，可以通过在类中定义__slots__变量来进行限定。需要注意的是__slots__的限定只对当前类的对象生效，对子类并不起任何作用。

```python
    # 限定Person对象只能绑定_name, _age和_gender属性
    __slots__ = ('_name', '_age', '_gender')
```

#### 2.3 静态方法  (工具方法)

> 之前，我们在类中定义的方法都是对象方法，也就是说这些方法都是发送给对象的消息。实际上，我们写在类中的方法并不需要都是对象方法，例如我们定义一个“三角形”类，通过传入三条边长来构造三角形，并提供计算周长和面积的方法，但是传入的三条边长未必能构造出三角形对象，因此我们可以先写一个方法来验证三条边长是否可以构成三角形，这个方法很显然就不是对象方法，因为在调用这个方法时三角形对象尚未创建出来（因为都不知道三条边能不能构成三角形），所以这个方法是属于三角形类而并不属于三角形对象的。我们可以使用静态方法来解决这类问题，代码如下所示。

``` python
@staticmethod
    def is_valid(a, b, c):
        return a + b > c and b + c > a and a + c >
 
def main():
    a, b, c = 3, 4, 5
    # 静态方法和类方法都是通过给类发消息来调用的
    if Triangle.is_valid(a, b, c):
        t = Triangle(a, b, c)
        print(t.perimeter())
        # 也可以通过给类发消息来调用对象方法但是要传入接收消息的对象作为参数
        # print(Triangle.perimeter(t))
        print(t.area())
        # print(Triangle.area(t))
    else:
        print('无法构成三角形.')
```

#### 2.4 类方法 （初始工具方法）

> 和静态方法比较类似，Python还可以在类中定义类方法，类方法的第一个参数约定名为cls，它代表的是当前类相关的信息的对象（类本身也是一个对象，有的地方也称之为类的元数据对象），通过这个参数我们可以获取和类相关的信息并且可以创建出类的对象，代码如下所示。

``` python
@classmethod
    def now(cls):
        ctime = localtime(time())
        return cls(ctime.tm_hour, ctime.tm_min, ctime.tm_sec)
```

#### 2.5 用静态、魔法、类方法 改进一下上一个时钟练习

```python
# 5. 时钟类 强化版
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
```

#### 2.6 小总结

* **property** 和 set 方法是一套的
* __slots__ 就类似枚举
* **staticmethod** 用来做校验的方法
* **class_method** 用来初始化 可以直接调用 

#### 2.7 类的关系

> **is-a:** is-a关系也叫继承或泛化，比如学生和人的关系、手机和电子产品的关系都属于继承关系。

> **has-a(接口):** has-a关系通常称之为关联，比如部门和员工的关系，汽车和引擎的关系都属于关联关系；关联关系如果是整体和部分的关联，那么我们称之为聚合关系；如果整体进一步负责了部分的生命周期（整体和部分是不可分割的，同时同在也同时消亡），那么这种就是最强的关联关系，我们称之为合成关系。

> **use-a:** use-a关系通常称之为依赖，比如司机有一个驾驶的行为（方法），其中（的参数）使用到了汽车，那么司机和汽车的关系就是依赖关系。

#### 3. 继承和多态

#### 3.1 继承

* python 中的继承语法

```python
class Person(object)
class Student(Person)
```

#### 3.2 抽象类

* 抽象类的语法

```python
class Pet(object, metaclass=ABCMeta)
```

## 六、 图形用户界面和游戏开发

### 1. 图形用户界面

#### 1.1 基于 tkinter 模块的 GUI

使用tkinter来开发GUI应用需要以下5个步骤：

1. 导入tkinter模块中我们需要的东西。
2. 创建一个顶层窗口对象并用它来承载整个GUI应用。
3. 在顶层窗口对象上添加GUI组件。
4. 通过代码将这些GUI组件的功能组织起来。
5. 进入主事件循环(main loop)。

#### 1.2 练习

```python
import tkinter
import tkinter.messagebox


def main():
    flag = True

    # 修改标签上的文字
    def change_label_text():
        nonlocal flag
        flag = not flag
        color, msg = ('red', 'Hello, world!')\
            if flag else ('blue', 'Goodbye, world!')
        label.config(text=msg, fg=color)

    # 确认退出
    def confirm_to_quit():
        if tkinter.messagebox.askokcancel('温馨提示', '确定要退出吗?'):
            top.quit()

    # 创建顶层窗口
    top = tkinter.Tk()
    # 设置窗口大小
    top.geometry('240x160')
    # 设置窗口标题
    top.title('小游戏')
    # 创建标签对象并添加到顶层窗口
    label = tkinter.Label(top, text='Hello, world!', font='Arial -32', fg='red')
    label.pack(expand=1)
    # 创建一个装按钮的容器
    panel = tkinter.Frame(top)
    # 创建按钮对象 指定添加到哪个容器中 通过command参数绑定事件回调函数
    button1 = tkinter.Button(panel, text='修改', command=change_label_text)
    button1.pack(side='left')
    button2 = tkinter.Button(panel, text='退出', command=confirm_to_quit)
    button2.pack(side='right')
    panel.pack(side='bottom')
    # 开启主事件循环
    tkinter.mainloop()


if __name__ == '__main__':
    main()
```

**跳过：** 这部分不涉及到基础知识，简单了解一下，有需要再回来学习。

## 七、 文件和异常

​		在Python中实现文件的读写操作其实非常简单，通过Python内置的`open`函数，我们可以指定文件名、操作模式、编码信息等来获得操作文件的对象，接下来就可以对文件进行读写操作了。这里所说的操作模式是指要打开什么样的文件（字符文件还是二进制文件）以及做什么样的操作（读、写还是追加），具体的如下表所示。

| 操作模式 | 具体含义                         |
| -------- | -------------------------------- |
| `'r'`    | 读取 （默认）                    |
| `'w'`    | 写入（会先截断之前的内容）       |
| `'x'`    | 写入，如果文件已经存在会产生异常 |
| `'a'`    | 追加，将内容写入到已有文件的末尾 |
| `'b'`    | 二进制模式                       |
| `'t'`    | 文本模式（默认）                 |
| `'+'`    | 更新（既可以读又可以写）         |

![image-20220911013925936](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20220911013925936.png)

### 1.  基础操作 

#### 1.1 读取文本文件

​		读取文本文件时，需要在使用`open`函数时指定好带路径的文件名（可以使用相对路径或绝对路径）并将文件模式设置为`'r'`（如果不指定，默认值也是`'r'`），然后通过`encoding`参数指定编码（如果不指定，默认值是None，那么在读取文件时使用的是操作系统默认的编码），如果不能保证保存文件时使用的编码方式与encoding参数指定的编码方式是一致的，那么就可能因无法解码字符而导致读取失败。

```python
# io 操作
def main():
    # 获得一个流 路径 + 模式 + 编码
    file = open('../ioTest/1.txt', 'r', encoding='utf-8')
    print(file.read())
    file.close()


if __name__ == '__main__':
    main()

```

#### 1.2 加入异常处理

```python
    # 2.0 处理异常版本
    try:
        file_2 = open('../ioTest/1.txt', 'r', encoding='utf-8')
        print('2.0 测试结果:' + file_2.read())
    except FileNotFoundError:
        print('无法打开指定文件')
    except LookupError:
        print('指定了未知编码')
    except UnicodeDecodeError:
        print('读取文件时错误')
    finally:
        if file_2:
            file_2.close()
```

#### 1.3 with 处理 自动关流版本 + 逐行读取

```python
# 3.0 with + 逐行读取 + 列表接收
    try:
        with open('../ioTest/1.txt', 'r', encoding='utf-8') as file_3:
            # 这里省略了 readline for帮我们做了
            for line in file_3:
                print('3.0 逐行读取' + line, end='')
        # 4.0 列表接收
        with open('../ioTest/1.txt', 'r', encoding='utf-8') as file_3:
            line = file_3.readlines()
            print('\n4.0 测试结果:',end='')
            print(line)
    except LookupError:
        print('读取文件时错误')
```

#### 1.4 写入文件

```python
''' 1.0 文本写入
      w 覆盖写  
      x 如果文件已经存在会报异常 
      a 追加    '''
    ###
    try:
        with open('../ioTest/2.txt', 'x', encoding='utf-8') as file_4:
            file_4.write('write 1.0:我好困，我想睡觉了')
    except LookupError:
        print('error')
```

#### 1.5  二进制读写

```python
    # 二进制读写 可以加前缀 w x a 
    with open('../ioTest/2.txt', 'rb') as file_5:
        data = file_5.read()
    with open('../ioTest/4.txt', 'ab') as file_6:
        file_6.write(data)
```

### 2. json 读写

json模块主要有四个比较重要的函数，分别是：

- `dump` - 将Python对象按照JSON格式序列化到文件中
- `dumps` - 将Python对象处理成JSON格式的字符串
- `load` - 将文件中的JSON数据反序列化成对象
- `loads` - 将字符串的内容反序列化成Python对象

这里出现了两个概念，一个叫序列化，一个叫反序列化。自由的百科全书[维基百科](https://zh.wikipedia.org/)上对这两个概念是这样解释的：“序列化（serialization）在计算机科学的数据处理中，是指将数据结构或对象状态转换为可以存储或传输的形式，这样在需要的时候能够恢复到原先的状态，而且通过序列化的数据重新获取字节时，可以利用这些字节来产生原始对象的副本（拷贝）。与这个过程相反的动作，即从一系列字节中提取数据结构的操作，就是反序列化（deserialization）”。

```python
try:
    with open('../ioTest/data.json', 'w', encoding='utf-8') as fs:
        json.dump(mydict, fs)  # dump（data，stream）
except IOError as e:
    print(e)
print('保存数据完成!')
```

## 八、 正则表达式（这部分先略过，需要用到再学）

### 1. 正则表达式相关知识

在编写处理字符串的程序或网页时，经常会有查找符合某些复杂规则的字符串的需要，正则表达式就是用于描述这些规则的工具，换句话说正则表达式是一种工具，它定义了字符串的匹配模式（如何检查一个字符串是否有跟某种模式匹配的部分或者从一个字符串中将与模式匹配的部分提取出来或者替换掉）。如果你在Windows操作系统中使用过文件查找并且在指定文件名时使用过通配符（*和?），那么正则表达式也是与之类似的用来进行文本匹配的工具，只不过比起通配符正则表达式更强大，它能更精确地描述你的需求（当然你付出的代价是书写一个正则表达式比打出一个通配符要复杂得多，要知道任何给你带来好处的东西都是有代价的，就如同学习一门编程语言一样），比如你可以编写一个正则表达式，用来查找所有以0开头，后面跟着2-3个数字，然后是一个连字号“-”，最后是7或8位数字的字符串（像028-12345678或0813-7654321），这不就是国内的座机号码吗。最初计算机是为了做数学运算而诞生的，处理的信息基本上都是数值，而今天我们在日常工作中处理的信息基本上都是文本数据，我们希望计算机能够识别和处理符合某些模式的文本，正则表达式就显得非常重要了。今天几乎所有的编程语言都提供了对正则表达式操作的支持，Python通过标准库中的re模块来支持正则表达式操作。

我们可以考虑下面一个问题：我们从某个地方（可能是一个文本文件，也可能是网络上的一则新闻）获得了一个字符串，希望在字符串中找出手机号和座机号。当然我们可以设定手机号是11位的数字（注意并不是随机的11位数字，因为你没有见过“25012345678”这样的手机号吧）而座机号跟上一段中描述的模式相同，如果不使用正则表达式要完成这个任务就会很麻烦。

关于正则表达式的相关知识，大家可以阅读一篇非常有名的博客叫[《正则表达式30分钟入门教程》](https://deerchao.net/tutorials/regex/regex.htm)，读完这篇文章后你就可以看懂下面的表格，这是我们对正则表达式中的一些基本符号进行的扼要总结。

| 符号         | 解释                             | 示例             | 说明                                                         |
| ------------ | -------------------------------- | ---------------- | ------------------------------------------------------------ |
| .            | 匹配任意字符                     | b.t              | 可以匹配bat / but / b#t / b1t等                              |
| \w           | 匹配字母/数字/下划线             | b\wt             | 可以匹配bat / b1t / b_t等 但不能匹配b#t                      |
| \s           | 匹配空白字符（包括\r、\n、\t等） | love\syou        | 可以匹配love you                                             |
| \d           | 匹配数字                         | \d\d             | 可以匹配01 / 23 / 99等                                       |
| \b           | 匹配单词的边界                   | \bThe\b          |                                                              |
| ^            | 匹配字符串的开始                 | ^The             | 可以匹配The开头的字符串                                      |
| $            | 匹配字符串的结束                 | .exe$            | 可以匹配.exe结尾的字符串                                     |
| \W           | 匹配非字母/数字/下划线           | b\Wt             | 可以匹配b#t / b@t等 但不能匹配but / b1t / b_t等              |
| \S           | 匹配非空白字符                   | love\Syou        | 可以匹配love#you等 但不能匹配love you                        |
| \D           | 匹配非数字                       | \d\D             | 可以匹配9a / 3# / 0F等                                       |
| \B           | 匹配非单词边界                   | \Bio\B           |                                                              |
| []           | 匹配来自字符集的任意单一字符     | [aeiou]          | 可以匹配任一元音字母字符                                     |
| [^]          | 匹配不在字符集中的任意单一字符   | [^aeiou]         | 可以匹配任一非元音字母字符                                   |
| *            | 匹配0次或多次                    | \w*              |                                                              |
| +            | 匹配1次或多次                    | \w+              |                                                              |
| ?            | 匹配0次或1次                     | \w?              |                                                              |
| {N}          | 匹配N次                          | \w{3}            |                                                              |
| {M,}         | 匹配至少M次                      | \w{3,}           |                                                              |
| {M,N}        | 匹配至少M次至多N次               | \w{3,6}          |                                                              |
| \|           | 分支                             | foo\|bar         | 可以匹配foo或者bar                                           |
| (?#)         | 注释                             |                  |                                                              |
| (exp)        | 匹配exp并捕获到自动命名的组中    |                  |                                                              |
| (?<name>exp) | 匹配exp并捕获到名为name的组中    |                  |                                                              |
| (?:exp)      | 匹配exp但是不捕获匹配的文本      |                  |                                                              |
| (?=exp)      | 匹配exp前面的位置                | \b\w+(?=ing)     | 可以匹配I'm dancing中的danc                                  |
| (?<=exp)     | 匹配exp后面的位置                | (?<=\bdanc)\w+\b | 可以匹配I love dancing and reading中的第一个ing              |
| (?!exp)      | 匹配后面不是exp的位置            |                  |                                                              |
| (?<!exp)     | 匹配前面不是exp的位置            |                  |                                                              |
| *?           | 重复任意次，但尽可能少重复       | a.*b a.*?b       | 将正则表达式应用于aabab，前者会匹配整个字符串aabab，后者会匹配aab和ab两个字符串 |
| +?           | 重复1次或多次，但尽可能少重复    |                  |                                                              |
| ??           | 重复0次或1次，但尽可能少重复     |                  |                                                              |
| {M,N}?       | 重复M到N次，但尽可能少重复       |                  |                                                              |
| {M,}?        | 重复M次以上，但尽可能少重复      |                  |                                                              |

> **说明：** 如果需要匹配的字符是正则表达式中的特殊字符，那么可以使用\进行转义处理，例如想匹配小数点可以写成\.就可以了，因为直接写.会匹配任意字符；同理，想匹配圆括号必须写成\(和\)，否则圆括号被视为正则表达式中的分组。

### 2.  Python对正则表达式的支持

Python提供了re模块来支持正则表达式相关操作，下面是re模块中的核心函数。

| 函数                                         | 说明                                                         |
| -------------------------------------------- | ------------------------------------------------------------ |
| compile(pattern, flags=0)                    | 编译正则表达式返回正则表达式对象                             |
| match(pattern, string, flags=0)              | 用正则表达式匹配字符串 成功返回匹配对象 否则返回None         |
| search(pattern, string, flags=0)             | 搜索字符串中第一次出现正则表达式的模式 成功返回匹配对象 否则返回None |
| split(pattern, string, maxsplit=0, flags=0)  | 用正则表达式指定的模式分隔符拆分字符串 返回列表              |
| sub(pattern, repl, string, count=0, flags=0) | 用指定的字符串替换原字符串中与正则表达式匹配的模式 可以用count指定替换的次数 |
| fullmatch(pattern, string, flags=0)          | match函数的完全匹配（从字符串开头到结尾）版本                |
| findall(pattern, string, flags=0)            | 查找字符串所有与正则表达式匹配的模式 返回字符串的列表        |
| finditer(pattern, string, flags=0)           | 查找字符串所有与正则表达式匹配的模式 返回一个迭代器          |
| purge()                                      | 清除隐式编译的正则表达式的缓存                               |
| re.I / re.IGNORECASE                         | 忽略大小写匹配标记                                           |
| re.M / re.MULTILINE                          | 多行匹配标记                                                 |

> **说明：** 上面提到的re模块中的这些函数，实际开发中也可以用正则表达式对象的方法替代对这些函数的使用，如果一个正则表达式需要重复的使用，那么先通过compile函数编译正则表达式并创建出正则表达式对象无疑是更为明智的选择。

下面我们通过一系列的例子来告诉大家在Python中如何使用正则表达式。

#### 2.1 例子1：验证输入用户名和QQ号是否有效并给出对应的提示信息。

```
"""
验证输入用户名和QQ号是否有效并给出对应的提示信息

要求：用户名必须由字母、数字或下划线构成且长度在6~20个字符之间，QQ号是5~12的数字且首位不能为0
"""
import re


def main():
    username = input('请输入用户名: ')
    qq = input('请输入QQ号: ')
    # match函数的第一个参数是正则表达式字符串或正则表达式对象
    # 第二个参数是要跟正则表达式做匹配的字符串对象
    m1 = re.match(r'^[0-9a-zA-Z_]{6,20}$', username)
    if not m1:
        print('请输入有效的用户名.')
    m2 = re.match(r'^[1-9]\d{4,11}$', qq)
    if not m2:
        print('请输入有效的QQ号.')
    if m1 and m2:
        print('你输入的信息是有效的!')


if __name__ == '__main__':
    main()
```

> **提示：** 上面在书写正则表达式时使用了“原始字符串”的写法（在字符串前面加上了r），所谓“原始字符串”就是字符串中的每个字符都是它原始的意义，说得更直接一点就是字符串中没有所谓的转义字符啦。因为正则表达式中有很多元字符和需要进行转义的地方，如果不使用原始字符串就需要将反斜杠写作\\，例如表示数字的\d得书写成\\d，这样不仅写起来不方便，阅读的时候也会很吃力。

#### 2.2 例子2：从一段文字中提取出国内手机号码。

下面这张图是截止到2017年底，国内三家运营商推出的手机号段。

[![img](https://github.com/jackfrued/Python-100-Days/raw/master/Day01-15/res/tel-start-number.png)](https://github.com/jackfrued/Python-100-Days/blob/master/Day01-15/res/tel-start-number.png)

```
import re


def main():
    # 创建正则表达式对象 使用了前瞻和回顾来保证手机号前后不应该出现数字
    pattern = re.compile(r'(?<=\D)1[34578]\d{9}(?=\D)')
    sentence = '''
    重要的事情说8130123456789遍，我的手机号是13512346789这个靓号，
    不是15600998765，也是110或119，王大锤的手机号才是15600998765。
    '''
    # 查找所有匹配并保存到一个列表中
    mylist = re.findall(pattern, sentence)
    print(mylist)
    print('--------华丽的分隔线--------')
    # 通过迭代器取出匹配对象并获得匹配的内容
    for temp in pattern.finditer(sentence):
        print(temp.group())
    print('--------华丽的分隔线--------')
    # 通过search函数指定搜索位置找出所有匹配
    m = pattern.search(sentence)
    while m:
        print(m.group())
        m = pattern.search(sentence, m.end())


if __name__ == '__main__':
    main()
```

> **说明：** 上面匹配国内手机号的正则表达式并不够好，因为像14开头的号码只有145或147，而上面的正则表达式并没有考虑这种情况，要匹配国内手机号，更好的正则表达式的写法是：`(?<=\D)(1[38]\d{9}|14[57]\d{8}|15[0-35-9]\d{8}|17[678]\d{8})(?=\D)`，国内最近好像有19和16开头的手机号了，但是这个暂时不在我们考虑之列。

#### 2.3 例子3：替换字符串中的不良内容

```
import re


def main():
    sentence = '你丫是傻叉吗? 我操你大爷的. Fuck you.'
    purified = re.sub('[操肏艹]|fuck|shit|傻[比屄逼叉缺吊屌]|煞笔',
                      '*', sentence, flags=re.IGNORECASE)
    print(purified)  # 你丫是*吗? 我*你大爷的. * you.


if __name__ == '__main__':
    main()
```

> **说明：** re模块的正则表达式相关函数中都有一个flags参数，它代表了正则表达式的匹配标记，可以通过该标记来指定匹配时是否忽略大小写、是否进行多行匹配、是否显示调试信息等。如果需要为flags参数指定多个值，可以使用[按位或运算符](http://www.runoob.com/python/python-operators.html#ysf5)进行叠加，如`flags=re.I | re.M`。

#### 2.4 例子4：拆分长字符串

```
import re


def main():
    poem = '窗前明月光，疑是地上霜。举头望明月，低头思故乡。'
    sentence_list = re.split(r'[，。, .]', poem)
    while '' in sentence_list:
        sentence_list.remove('')
    print(sentence_list)  # ['窗前明月光', '疑是地上霜', '举头望明月', '低头思故乡']


if __name__ == '__main__':
    main()
```

## 九、 进程和线程

### 1. 基本概念

#### 1.1 什么是进程

> **进程:**一个执行中的程序，操作系统中以进程为单位分配存储空间，管理所有进程的执行，为他们分配资源，可以通过 fork 或者 spawn 的方式创建新进程来执行其它的任务，进程之间必须通过 IPC - Inter - Process Communication 来实现数据共享，具体的实现方式包括管道、信号、套接字、共享内存区等等

#### 1.2 什么是线程

> **线程：**实际的执行单位

#### 1.3 多线程的应用场景

* ​	最主要的体现在提升程序的性能和改善用户体验，今天我们使用的软件几乎都用到了多线程技术，这一点可以利用系统自带的进程监控工具（如macOS中的“活动监视器”、Windows中的“任务管理器”）来证实

### 2. Python 中的多线程

#### 2.1 语法

```python
# o1:接收结果 target:方法 args:参数
p1 = Process(targe=download_task,args=('str'))
# p1.start 启动一个线程 join 方法表示等待进程执行结束
p1.start
p1.join
# 必须等  不然看不到结果
```

#### 2.2 thread 类

```python
# 继承 Thread 类 可以实现多线程 
class Dome(Thread)
# 直接启动 少了 target
task = Dome('123')
task.start
task.join
# 可以实现线程共享 但会有线程安全问题
task = Dome(count,2) 
```

#### 2.3 python 中的锁

```python
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

```



#### 2.4 python 多线程的局限

> **只有并行没有并发：**Python的解释器有一个“全局解释器锁”（GIL）的东西，任何线程执行前必须先获得GIL锁，然后每执行100条字节码，解释器就自动释放GIL锁，让别的线程有机会执行，这是一个历史遗留问题，但是即便如此，就如我们之前举的例子，使用多线程在提升执行效率和改善用户体验方面仍然是有积极意义的。

#### 2.5 单线程 + 异步 I/O

​		现代操作系统对I/O操作的改进中最为重要的就是支持异步I/O。如果充分利用操作系统提供的异步I/O支持，就可以用单进程单线程模型来执行多任务，这种全新的模型称为事件驱动模型。Nginx就是支持异步I/O的Web服务器，它在单核CPU上采用单进程模型就可以高效地支持多任务。在多核CPU上，可以运行多个进程（数量与CPU核心数相同），充分利用多核CPU。用Node.js开发的服务器端程序也使用了这种工作模式，这也是当下并发编程的一种流行方案。

​		在Python语言中，单线程+异步I/O的编程模型称为协程，有了协程的支持，就可以基于事件驱动编写高效的多任务程序。协程最大的优势就是极高的执行效率，因为子程序切换不是线程切换，而是由程序自身控制，因此，没有线程切换的开销。协程的第二个优势就是不需要多线程的锁机制，因为只有一个线程，也不存在同时写变量冲突，在协程中控制共享资源不用加锁，只需要判断状态就好了，所以执行效率比多线程高很多。如果想要充分利用CPU的多核特性，最简单的方法是多进程+协程，既充分利用多核，又充分发挥协程的高效率，可获得极高的性能。

### 3. 多线程的实际应用（这部分先保留、要用到再补）

## 十、 网络编辑（保留）

## 十一、 图像和办公文档处理（保留）

### 1. 用 pillow 操作图像

### 2. 处理 Excel 表格

### 3. 处理 word 文档