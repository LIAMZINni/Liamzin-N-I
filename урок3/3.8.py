# -- coding: utf-8 --
def nam8():
    n = int(input("Введите число от 1 до 9 - "))
    if 1 <= n <= 9:
        for i in range(1, n + 1):
            for j in range(1, i + 1):
                print(j, sep='', end='')
            print()

print(nam8())
