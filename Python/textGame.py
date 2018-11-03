from random import randint


gameLoop = True
rand_num1 = randint(1,101)
rand_num2 = randint(0,2)

print('Welcome to dragslay! Type play or quit!\n')

while gameLoop:
	user = input()
	if (user == "quit"):
		print('\n----Made by Bruno Giannotti, thanks for playing----')
		break
	if (user == "play"):
		print('OK. Before entering the depths please choose a number from 1-50. Pick wisely for it could be your damnation.')
		user = input()