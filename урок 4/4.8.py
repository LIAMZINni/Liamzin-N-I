# -- coding: utf-8 --
def nam8():
	s=str(input('Введите строку '))
	b=((s[s.find('h')+1:s.rfind('h'):])[::-1])
	return b
	
	
print(nam8())
