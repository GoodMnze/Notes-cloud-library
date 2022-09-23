

# 1. 基本数据类型
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
# 2. 变量赋值
print('===========')
a = 1
b = 1
print('%d + %d = %d' % (a, b, a + b))
print('%d // %d = %d' % (a, b, a // b))
print('%d * %d = %d' % (a, b, a * b))
print('%d ** %d = %d' % (a, b, a ** b))
# 3. 练习
# year = int (input('请输入年份：'))
# if (year % 4 == 0 and year % 100 != 0 or \
#           year % 400 == 0):
#     print("%d 是闰年" % year)
# else: 
# 	print("%d 不是闰年" % year)
# 4. 三角练习
a = 6
for x in range(a):
    for y in range(a - x):
        print(' ',end="")
    for z in range(x * 2 + 1):
        print("*", end='')
    print('')