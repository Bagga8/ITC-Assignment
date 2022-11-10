#--Comprehensions--
#-dictionary-
some_list = ['a', 'b', 'c', 'd', 'm', 'n', 'n']

duplicates =[x for x in some_list if some_list.count(x) > 1]

# duplicates =[]
# for value in some_list:
#     if some_list.count(value) > 1:
#         if value not in duplicates:
#           duplicates.append(value)

# print(duplicates)


# simple_dict ={
#     'a' : 1,
#     'b' : 2,
# }
# my_dict = {key:value**2 for key,value in simple_dict.items() if value %2 ==0}

# print(my_dict)


#-set-

# my_list = {char for char in 'hello'}
# my_list2 = {num for num in range(0,100)}

# print(my_list)
# print(my_list2)


#-list-
# my_list = [char for char in 'hello']
# my_list2 = [num for num in range(0,100)]
# my_list3 = [num*2 for num in range(0, 100)]
# my_list4 = [num**2 for num in range(0, 100)
#             if num % 2 ==0]


##for char in 'hello':
##    my_list.append(char)

# print(my_list)
# print(my_list2)
# print(my_list3)
# print(my_list4)

#--Example--
#-Square-
# my_list= [5,4,3]

# new_list = list(map(lambda num: num**2, my_list))
# print(new_list)

#-list sorting-
# a = [(0,2), (4,3), (10,-1), (9,9)]
# a.sort(key=lambda x: x[1])
# print(a)

#--lambda expressions--
# from functools import reduce
# my_list = [1, 2, 3]

# def accumulator(acc, item):
#      print(acc, item)
#      return acc + item

# print(list(filter(lambda item: item % 2 != 0, my_list)))
# print(my_list)


#--reduce--
# from functools import reduce
# my_list = [1, 2, 3]

# def multiply_by2(item):
#     return item*2

# def only_odd(item):
#     return item*2

# def accumulator(acc, item):
#     print(acc, item)
#     return acc + item

# print(reduce(accumulator, my_list, 0))
# print(my_list)


#--zip--
# my_list = [1, 2, 3]
# your_list = (10, 20, 30)
# their_list = (5, 4, 3)
# def multiply_by2(item):
#     return item*2

# print(list(zip(my_list, your_list, their_list)))
# print(my_list)


#--filter--
# my_list = [1, 2, 3]
# def multiply_by2(item):
#     return item*2

# def check_odd(item):
#     return item % 2 != 0

# print(list(filter(check_odd, my_list)))
# print(my_list)


#--map--
# my_list = [1, 2, 3]
# def multiply_by2(item):
#     return item*2

# print(list(map(multiply_by2, my_list)))
# print(my_list)


# def multiply_by2(li):
#     new_list = []
#     for item in li:
#         new_list.append(item*2)
#     return new_list

# print(multiply_by2([1, 2, 3]))
