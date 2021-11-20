# -- coding: utf-8 --
def nam7():
    n = None
    x = 0
    i = 0

    while n != 0:
        n = int(input("Введите числа "))
        if n > x:
            i += 1
        x=n
    
    print(i-1)
print(nam7())
