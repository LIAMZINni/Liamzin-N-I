# -- coding: utf-8 --
def nam5():
	sum=0
	n=int(input('n= '))
	for i in range(1,n+1):
		sum+=i**3
	return sum
print(nam5())
