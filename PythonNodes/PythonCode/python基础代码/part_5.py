# io 操作
import json


def main(file_2=None):
    # 1.0 第一个 io 流
    # 获得一个流 路径 + 模式 + 编码
    file = open('../ioTest/1.txt', 'r', encoding='utf-8')
    print('1.0 测试结果:' + file.read())
    file.close()  # 跟 java 一样 需要关闭流
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
    ''' 1.0 文本写入
      w 覆盖写  
      x 如果文件已经存在会报异常 
      a 追加    '''
    ###
    try:
        with open('../ioTest/2.txt', 'w', encoding='utf-8') as file_4:
            file_4.write('write 1.0:我好困，我想睡觉了')
    except LookupError:
        print('error')

    # 二进制读写 可以加前缀 w x a
    with open('../ioTest/2.txt', 'rb') as file_5:
        data = file_5.read()
    with open('../ioTest/4.txt', 'ab') as file_6:
        file_6.write(data)
    # json 读写
    mydict = {
        'name': '骆昊',
        'age': 38,
        'qq': 957658,
        'friends': ['王大锤', '白元芳'],
        'cars': [
            {'brand': 'BYD', 'max_speed': 180},
            {'brand': 'Audi', 'max_speed': 280},
            {'brand': 'Benz', 'max_speed': 320}
        ]
    }
    try:
        with open('../ioTest/data.json', 'w', encoding='utf-8') as fs:
            json.dump(mydict, fs)  # dump（data，stream）
    except IOError as e:
        print(e)
    print('保存数据完成!')


if __name__ == '__main__':
    main()
