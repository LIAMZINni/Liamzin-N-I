# -- coding: utf-8 --
def nam2():
	n=int(input('n='))
	if n>=2:
		i=2
		while n%i!=0:
			i+=1
		return i
			
	else:
		print("n>=2")		
print(nam2())
