def merge_lists(lst1, lst2):
    print("First List => {}".format(lst1))
    print("Second List => {}".format(lst2))
    newlst = lst1 + lst2
    print("UnSorted List => {}".format(newlst))
    for x in range(len(newlst)):
        for y in range(1,len(newlst)):
            if newlst[y] < newlst[y-1]:
                tmp = newlst[y]
                newlst[y] = newlst[y-1]
                newlst[y-1] = tmp
    print("Sorted List => {}".format(newlst))

if __name__ == '__main__':
    lst1 = [1,3,4,5]
    lst2 = [2,6,7,8]
    merge_lists(lst1, lst2)
