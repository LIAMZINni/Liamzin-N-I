# -- coding: utf-8 --
def nam10():
	sum=0
	n=int(input('n= '))
	k=int(input('k= '))
	x=0
	y=1
	for i in range(2,n+1):
		if k<=i:
			sum+=y
		z=y
		y+=x
		x=z
		
	return sum
print(nam10())
