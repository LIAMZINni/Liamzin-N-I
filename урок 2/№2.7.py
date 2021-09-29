# -*- coding: utf-8 -*-
#7
print('Чтобы узнать какой год високостный')
def vesokost_god():
	n= int(input('Введите год '))
	if n%4==0 and n%100!=0 or n%400==0:
		return('Да')
	else:
		return("Нет")
print(vesokost_god())
