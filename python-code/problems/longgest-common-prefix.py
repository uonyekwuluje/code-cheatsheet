#!/usr/bin/env python3

if __name__ == '__main__':
    strs = ["dog","racecar","car"]
    #strs = ["flower","flow","flight"]
    print(strs)
    
    # Test for array lenght
    if (len(strs) >= 1 or len(strs) <= 200):
        pass
    else:
        print("Array Lenght Not Ok")
        quit()

    # Check Each Element Lenght
    for x in range(len(strs)):
        if (len(strs[x]) >=0 or len(strs[x]) <= 200):
           pass
        else:
           print("Subsript Not OK")
           quit()
   

    # Get Lowest String Lenght
    low = len(strs[0])
    for x in range(len(strs)):
        if len(strs[x]) < low:
            low = len(strs[x])

    preffix = ""
    isFound = False
    print("Lowest String Lenght => ",low)
    for rLimit in range(1,low):
        for x in range(1,len(strs)):
            print(strs[x-1][0:rLimit], strs[x][0:rLimit])
            if (strs[x-1][0:rLimit] == strs[x][0:rLimit]):
                isFound = True
            else:
                isFound = False 
                break

        if isFound:
           preffix = strs[x-1][0:rLimit]   
        else:
           break

        print("Passs => {}\n".format(rLimit))

    print("\nPreffix => {}\n".format(preffix))
