# -*- coding: utf-8 -*-
def chokolete():
	n=int(input('Введите число '))
	m=int(input('Введите число '))
	k=int(input('Введите число '))
	if k <= m*n and k%m==0 or k%n==0:
		return('Да')
	else:
		return('Нет')
print(chokolete())
