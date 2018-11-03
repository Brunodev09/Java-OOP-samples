smily = '\U0001f600'
y = 0

for x in range(1,10):
	print(smily*x)

while y < 10:
	print(smily*y)
	y+=1

# Without string multiplication - ugly solution
# for num in range(1,11): 
# 	count = 1
# 	smileys = ""
# 	while count <= num:
# 		smileys += "\U0001f600"
# 		count += 1
# 	print(smileys)

# msg = input("Say Something: ")


# while msg != "stop copying me":
# 	print(msg)
# 	msg = input()
# print("UGH FINE YOU WIN, BROTHER!")


# while msg != "stop copying me":
# 	msg = input(f"{msg}\n")
# print("UGH FINE YOU WIN, BROTHER!")

# while True:
# 	command = input()
# 	if(command == 'exit'):
# 		break