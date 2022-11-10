# --2D lists & nested loops--

# number_grid = [
#     [1, 2, 3],
#     [4, 5, 6],
#     [7, 8, 9],
#     [0]
# ]
# print(number_grid[0][2])

# for row in number_grid:
#     for col in row:
#         print(col)


# --Exponent function--

# def raise_to_power(base_num, pow_num):
#     result = 1
#     for index in range(pow_num):
#         result = result * base_num
#     return result

# print(raise_to_power(8,2))


# --For loop--

# friends = ["Eduar", "Bagga", "Agon"]
# for index in range(len(friends)):
#     print(index)

# for index in range(3, 9):
#     print(index)

# friends = ["Eduar", "Bagga", "Agon"]
# for names in friends:
#     print(names)

# for letter in "Giraffe Academy":
#     print(letter)


# --Building a guessing game--

# secret_word = "giraffe"
# guess = ""
# guess_count = 0
# guess_limit = 3
# out_of_guesses = False

# while guess != secret_word and not(out_of_guesses):
#     if guess_count < guess_limit:
#         guess = input("Enter guess: ")
#         guess_count += 1
#     else:
#         out_of_guesses = True

# if out_of_guesses:
#     print("You lose!")
# else:
#     print("You win!")


# --While Loop--
# i = 1
# while i <= 10:
#     print(i)
#     i += 1

# print("Done with loop")


# --Dictionaries--

# monthConversions = {
#     "Jan": "January",
#     "Feb": "February",
#     "Mar": "March",
#     "Apr": "April",
#     "May": "May",
#     "Jun": "June",
#     "Jul": "July",
#     "Aug": "August",
#     "Sep": "September",
#     "Oct": "October",
#     "Nov": "November",
#     "Dec": "December",
# }

# print(monthConversions["Dec"])
# print(monthConversions.get("Bag", "Not a valid key"))


# --Building a better calculator--
# num1 = float(input("Enter first number: "))
# op = input("Enter operator: ")
# num2 = float(input("Enter second number: "))

# if op == "+":
#     print(num1 + num2)
# elif op == "-":
#     print(num1 - num2)
# elif op == "*":
#     print(num1 * num2)
# elif op == "/":
#     print(num1 / num2)
# else:
#     print("Invalid operator")


# --If statements and comparisons--
# def max_num(num1, num2, num3):
#     if num1 >= num2 and num1 >= num3:
#         return num1
#     elif num2 >= num1 and num2 >= num3:
#         return num2
#     else:
#         return num3
# print(max_num(300, 8, 29))


# --If statements--
# is_male = False
# is_tall = True

# if is_male and is_tall:
#     print("you are a tall male")
# elif is_male and not (is_tall):
#     print("you are a short male")
# elif not(is_male) and (is_tall):
#     print("you are a tall female")
# else:
#     print("You are not a male or tall or both")


# --Return statement--
# def cube(num):
#     return num*num*num  #breaks back out of the function

# result = cube(4)
# print(result)


# --Functions--
# def say_hi(name, age):
#     print("hello " + name + ", you are " + age)

# say_hi("Mike", "35")
# say_hi("Steve", "70")


# --Tuples--
# coordinates = (4, 5)
# vectors = [(7, 3), (4,10), (8,2)] #tupples inside list
# coordinates[1] = 8 #Tuples cant be changed therefore this gives an error
# print(coordinates[1])


# --List Functions--
# lucky_numbers  = [8, 12, 34, 6, 16, 25, 7]
# friends = ["Agon", "Eduar", "Bagga", "Shabnam", "Ola", "Bagga"]
# friends.extend(lucky_numbers)
# friends.append("Rupalli")
# friends.insert(3, "Poornima")
# friends.remove("Ola")
# friends.clear()
# friends.pop()
# print(friends)
# print(friends.index("Bagga"))
# print(friends.count("Bagga"))

# lucky_numbers.sort()
# print(lucky_numbers)
# lucky_numbers.reverse()
# print(lucky_numbers)

# friends2 = friends.copy()
# print(friends2)


# --Lists--
# friends = ["Agon", "Eduar", "Shabnam", "Ola", "Bagga"] #Index positions start from 0, or negatives from -1
# print(friends[1:])
# print(friends[2:5])
# friends[1] = "Rupalli"
# print(friends[1])


# --Madlibs game--
# colour = input("Enter a colour: ")
# plural_noun = input("Enter a plural noun: ")
# celebrity = input("Enter a celebrity: ")

# print("Roses are " + colour)
# print(plural_noun + "are blue")
# print("I love " + celebrity)


# --Building a Basic calculator--
# num1 = input("Enter a number: ")
# num2 = input("Enter another number: ")
# result = int(num1) + float(num2)       #int only works with whole numbers, float does decimal numbers

# print(result)


# --Getting input from user--
# name = input("Enter your name: ")
# age = input("Enter your age: ")
# print("Hello " + name + ", you are" + age)


# --Working with numbers--
# from math import *

# my_num = -8

# print(floor(3.8))
# print(round(3.8))

# print(min(8, 12))
# print(max(4,6))

# print(sqrt(64))
# print(pow(8, 2))
# print(abs(my_num))

# print(str(my_num) + " is my favourite number")


# --Working with strings--
# phrase = "Giraffe academy"
# print(phrase.upper())

# phrase = "Giraffe academy"
# print(phrase.upper().isupper())

# phrase = "Giraffe Academy"
# print(len(phrase))

# phrase = "Giraffe Academy"
# print(phrase[0])

# phrase = "Giraffe Academy"
# print(phrase.index("Acad"))

# phrase = "Giraffe Academy"
# print(phrase.replace("Giraffe", "Elephant")) ##


# --Variables and data type--
# character_name = "Bagga"
# character_age = 25.8
# is_Male = True
# print("There once was a man named " + character_name +" ,")
# print("he was " + character_age + " years old. ")

# character_name = "Mike"
# print("He really liked the name "+ character_name+ " , ")
# print("but didn't like being " +character_age + " , ")


# --Drawing a shape--
# print("   /|")
# print("  / |")
# print(" /  |")
# print("/___|")


# --Setup and hello world--
# print("Hello World")
# print("bagga is the best")
