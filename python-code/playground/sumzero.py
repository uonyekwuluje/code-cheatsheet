#!/usr/bin/env python3
def check_sum(num_list):
    for x in range(len(num_list)):
        for y in range(x+1,len(num_list)):
            if num_list[x] + num_list[y] == 0:
                return True
    return False
        

nList = [10, -14, 26, 5, -3, 13, -5]
print(nList)
print(check_sum(nList))
