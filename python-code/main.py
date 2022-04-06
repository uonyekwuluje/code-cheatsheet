#!/usr/bin/env python3

def listOps():
    names = ["Uche", "Chinwe", "Emeka"]
    for nm in names:
        print(nm)

    names.append("Tolue")
    print(names)
    names.pop(0)
    print(names)
    names.remove("Emeka")
    print(names)
    names.insert(3,"Emeka")
    print(names)


def dictOps():
    name = {"hobbies": ["reading","running"]}
    print(name)
    print("Dictionary is of lenght =>",len(name))
    print(name["hobbies"][0])

    try:
       nm1 = int(input("Enter a Number: "))
    except:
       print("Please Enter A number")

def tuppleTest():
    print("Testing Tuples")
    tp = ("MA", "GA", "ID")
    print(tp)
    print(list(tp))


def testInputs():
    age = 345.48585868686
    print("You entered %2.2f" %(age))
    fi = open("test.txt","r")
    for x in fi:
        print(x.rstrip())  
    fi.close()



if __name__ == '__main__':
    listOps()
    testInputs()
    dictOps()
    tuppleTest()
