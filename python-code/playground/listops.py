cities = ["Boston", "New York", "Milwake"]
print(cities)
print("Haiti" in cities)
print(cities.index("Boston"))


oddNum = [x**2 for x in range(2,20,2)]
print(oddNum)

list1 = [30, 50, 110, 40, 15, 75]
list2 = [10, 60, 20, 50]

sum_list = [(n1, n2) for n1 in list1 for n2 in list2 if n1 + n2 > 100]
print(sum_list)

empty_dict = {}  # Empty dictionary
print(empty_dict)

phone_book = {"Batman": 468426,
              "Cersei": 237734,
              "Ghostbusters": 44678
             }
print(phone_book)

phone_book["Biology"] = "890764"
print(phone_book)
del phone_book["Cersei"]
print(phone_book)


houses = {1: "Gryffindor", 2: "Slytherin", 3: "Hufflepuff", 4: "Ravenclaw"}
new_houses = {n**2: house + "!" for (n, house) in houses.items()}
print(houses)
print(new_houses)
print("-----------------------------------------------------------------------------------------------")
print("Solving Problems")
my_list = [34, 82.6, "Darth Vader", 17, "Hannibal"]
print(my_list)
tmp_list = []
tmp_list.append(my_list[0])
tmp_list.append(my_list[-1])
tmp_list.append(len(my_list))
my_tuple = tuple(tmp_list)
print(my_tuple)
print("")
my_list = [34, 82.6, "Darth Vader", 17, "Hannibal"]
my_tuple = (my_list[0], my_list[len(my_list) - 1], len(my_list))
print(my_tuple)
print("-----------------------------------------------------------------------------------------------")
