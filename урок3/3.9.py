# -- coding: utf-8 --
def nam9():
	sum=0
	n=int(input('n= '))
	x=0
	y=1
	for i in range(2,n+1):
		sum+=y
		z=y
		y+=x
		x=z
		
	return sum
print(nam9())
