#!/usr/bin/env python3
def fibo(n):
    if n == 0:
        return 0

    if n <= 0:
        return -1

    if (n == 1 or n == 2):
        return 1
    else:
        return (fibo(n-1) + fibo(n-2))


if __name__ == '__main__':
    print(fibo(7))
