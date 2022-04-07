#!/usr/bin/env python3

from basics import p_list


#def dictOps():
#    name = {"America": ["MA","GA","CA"]}
#    name["Italy"] = ["Sily","Gily"]
#
#    print(name)
#    print("Dictionary is of lenght =>",len(name))
#    print(name["America"][0])
#
#
#    try:
#       nm1 = int(input("Enter a Number: "))
#    except:
#       print("Please Enter A number")
#
#def tuppleTest():
#    print("Testing Tuples")
#    tp = ("MA", "GA", "ID")
#    print(tp)
#    print(list(tp))
#
#
#def testInputs():
#    age = 345.48585868686
#    print("You entered %2.2f" %(age))
#    fi = open("test.txt","r")
#    for x in fi:
#        print(x.rstrip())  
#    fi.close()



if __name__ == '__main__':
    #p_list.listOps()
    strs = ["dog","racecar","car"]
    #strs = ["flower","flow","flight"]
    print(strs)
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
