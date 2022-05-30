#!/usr/bin/env python3
def remove_even(lst):
    lstTemp = []
    for x in lst:
        if ((x%2) != 0):
            lstTemp.append(x)
    lst = lstTemp
    return lst  
    
def remove_even2(lst):
    return [num for num in lst if num%2 != 0]

    

if __name__ == '__main__':
    my_list = [1,2,4,5,10,6,3]
    print("Original => {}".format(my_list))
    print(remove_even(my_list))
    print(remove_even2(my_list))
