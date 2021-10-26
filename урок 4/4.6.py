# -- coding: utf-8 --
def nam6():
	s=str(input('Введите строку '))
	if s.count('f')==1:
		a=-1
		return a
	elif s.count('f')>1:
		b=s.find('f',s.find('f')+1)
		return b
	else:
		return -2
		
	
	
print(nam6())
