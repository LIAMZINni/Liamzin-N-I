# -- coding: utf-8 --
def nam6():
    x=int(input('n='))
    i=0
    sum=0
    while x!=0:
        sum+=x
        i+=1
        x=int(input('n='))
    print(sum/i)
print(nam6())
