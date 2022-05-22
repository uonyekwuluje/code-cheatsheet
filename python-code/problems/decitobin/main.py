from stack import Stack

def convert_int_to_bin(dec_num):
    binNum = Stack()
    ret = ""
    while (dec_num > 0):
        ans = dec_num // 2
        rem = dec_num % 2
        binNum.push(rem)
        dec_num = ans
    print(binNum.get_stack())
    while not binNum.is_empty():
        ret += str(binNum.pop())
    print(ret)

def manual():
    num = 242
    dem = 2
    tmp = ""
    while (num > 0):
        ans = num // dem
        binary = num % dem
        print("{} / {} = {} ----> {}".format(num,dem,ans,binary))
        num = ans
        tmp += str(binary)

    print(tmp)
    print(tmp[::-1])



if __name__ == '__main__':
    convert_int_to_bin(242)
