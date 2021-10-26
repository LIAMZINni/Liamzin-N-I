# -- coding: utf-8 --
def nam7():
	res=1
	sum=0
	n=int(input('n='))
	for i in range(1,n+1):
		res*=i
		sum+=res 
	return  sum
print(nam7())
