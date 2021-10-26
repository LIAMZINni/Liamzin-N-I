# -- coding: utf-8 --
def nam4():
	s=str(input('Введите строку '))
	a=s[s.find(' ')+1:]+s[:s.find(' ')]
	return a
	
print(nam4())
