def longestCommonPrefix(strs):
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

        # Check Other
        if len(strs) == 1:
            return "".join(strs)


        # Get Lowest String Lenght
        low = len(strs[0])
        for x in range(len(strs)):
            if len(strs[x]) < low:
                low = len(strs[x])

        prefix = ""
        isFound = ""
        rLimit = 0 
        while (rLimit <= low):
            for x in range(0,len(strs)):
                if (strs[x][0:rLimit] == strs[x-1][0:rLimit]):
                    isFound = True
                else:
                    isFound = False
                    break

            if isFound:
               prefix = strs[x][0:rLimit]
            else:
               break

            rLimit += 1

        return "".join(prefix)

        

if __name__ == '__main__':
    nList = ["ab","a"]
    #nList = ["flower","flow","flight"]
    print("Longest Prefix for List {} is => {}".format(nList,longestCommonPrefix(nList)))
