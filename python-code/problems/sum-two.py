def find_sum(lst, k):
    for x in range(len(lst)):
        for y in range(1,len(lst)):
            if lst[x] + lst[y] == k:
                retLst = []
                retLst.append(x)
                retLst.append(y)    
                return retLst

if __name__ == '__main__':
    lst = [1,21,3,14,5,60,7,6]
    k = 81
    print("List => {}".format(lst))
    print("Sum => {}".format(k))
    print(find_sum(lst,k))
