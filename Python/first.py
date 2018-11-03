############################################ PYTHON LANGUAGE BASICS ############################################

# variables don't need any type
# cannot set a variable without a value, so instead set it to None
# fStrings is a way to print integers with strings
x = 1;
child = None;

formatted = f"I said {x} times";

#data types conversion
decimal = 12.432432
integer = int(decimal) #will return 12

my_array = [1,2,3]
my_array_string = str(my_array) #['1','2','3']


# input() will ask for user input
# example of simples converter
print("Enter km")
kms = input()
miles = float(kms)/1.60
print(f"That is equal to {round(miles,2)}") #rounding to 2 decimal points

# Conditionals - ident line block is crucial for it to work
if name == "bruno"
	print("eu")
elif  name == "more"
	print("pai")
else: 
	print("nenhum")

# Logical gates are called differently. Instead of &&, ||, !, they are called and, or, not

# memory storage -> is VS == 
y = 1
y == 1 # true, because value is equal
y is 1 # true, because 1 and y are stored in the same memory unit
# ------------
arr = [1,2,3]
arr2 = [1,2,3]

arr == arr2 # this will return true, because values are equal
arr is arr2 # this will return false, because arr is not in the same memory cell as arr2

# loops don't need aux variable
# if you range it with only 1 number, it will auto start at 0
# range(1,8) ints from 1 to SEVEN, not 8.
# range(1,10,2) ints from 1-9 skipping 2 numbers every loop
# range(7,0,-1) ints from 7-1 skipping -1 numbers every loops
for x in range(1,10):
	print(x)

for letter in 'coffee':
	print(letter) # will return c, o, f, f, e, e. This is a iterable object

msg = input("Password: ")
while msg != 'feet':
	print("Wrong")
	msg = input("Password: ")
print('Yes! Enjoy')


# Array's length can be accessed by len(list)
len(arr) #3
r = list(range(1,10)) #list() creates a list with elements from 1-9

numbers = [1,2,3,4]
i = 0

for i in numbers:
	print(i)

while i <= len(numbers):
	print(numbers[i])
	i+=1