def kth_max(mList,mk):
    for x in range(len(mList)):
        for y in range(1,len(mList)):
            if mList[y] < mList[y-1]:
                tmp = mList[y]
                mList[y] = mList[y-1]
                mList[y-1] = tmp
    print(mList)
    return mList[-mk]


if __name__ == '__main__':
    test_list = [40,35,82,14,22,66,53]
    ak = 6
    print(test_list)
    print(kth_max(test_list,ak))
    print("===================")
    print("==> Alternative <==")
    print("===================")
    test_list.sort()
    kth_max = test_list[-ak]
    print(kth_max)
