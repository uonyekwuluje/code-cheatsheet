#!/usr/bin/env python3

def palindromeV1(numArg):
    x = str(numArg)
    st = len(x)-1
    isFound = True
    for li in range(len(x)):
        print(x[li],x[st])
        if x[li] != x[st]:
           isFound = False
           break
        st -= 1

    if isFound:
        print("This is a Palindrome")
    else:
        print("This is not a Palindrome") 


def palindromeV2(numArg):
    temp = numArg
    rev = 0
    while(numArg > 0):
        dig = numArg % 10
        rev = rev * 10 + dig
        numArg = numArg //10

    if(temp==rev):
        print("The number is palindrome!")
    else:
        print("Not a palindrome!")




if __name__ == '__main__':
    nm = 12
    print(nm // 10)
    #palindromeV1(nm)
    #palindromeV2(nm)
