# -- coding: utf-8 --
def nam8():    
    i=-1
    l1=-1
    a=1
    max = 1
    while i!= 0:
        i=int(input("Введите число "))
        if i==l1:
            a+=1
        else:
            if a>max:
                max=a
                a=0
        l1=i 
    return max
print(nam8())
	
