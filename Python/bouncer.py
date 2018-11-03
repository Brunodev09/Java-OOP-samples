age = input("How old are you: ")

if age: # If nothing is inputted inside the string, its default value is falsy. "" == false
	age = int(age)
	if age >= 18 and age < 21:
		print('You can enter but need a wristband!')
	elif age >= 21:
		print('You can enter and be fucking wasted')
	else: print("You can't come in you fucking dwarf")
else: print("Please input your age!")