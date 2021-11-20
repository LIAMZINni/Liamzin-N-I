# -- coding: utf-8 --
def nam4():
	x=int(input('x= '))
	y=int(input("y= "))
	i=1
	while x<y:
	   x=x*0.1+x
	   i+=1
	print(i,"дней")
print(nam4())
