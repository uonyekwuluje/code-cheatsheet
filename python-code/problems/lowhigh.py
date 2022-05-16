def count_low_high(num_list):
    ret = {}
    retList = []
    for x in range(len(num_list)):
        if "high" not in ret:
            ret["high"] = 0
        if "low" not in ret:
            ret["low"] = 0


        if (num_list[x] > 50 or num_list[x]%3 == 0):
            ret["high"] += 1
        else:
            ret["low"] += 1

    retList.append(ret["low"])        
    retList.append(ret["high"])        
    return retList


def count_low_high(num_list):
    if (len(num_list)==0):
        return None
    high_list = len([n for n in num_list if n > 50 or n % 3 == 0])
    low_list = len([n for n in num_list if n <= 50 and not n % 3 == 0])
    return [low_list, high_list]


def count_low_high(num_list):
    if (len(num_list)==0):
        return None
    high_list = list(filter(lambda n: n > 50 or n % 3 == 0, num_list))
    low_list = list(filter(lambda n: n <= 50 and not n % 3 == 0, num_list))
    return [len(low_list), len(high_list)]





if __name__ == '__main__':
    num_list = [20, 9, 51, 81, 50, 42, 77]
    print(count_low_high(num_list))
