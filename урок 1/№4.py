# -- coding: utf-8 --

seconds = int(input('Введите кол-во секунд '))
days = seconds // 86400
hours = (seconds % 86400) // 3600
minutes = ((seconds % 86400) % 3600) // 60
seconds = ((seconds % 86400) % 3600) % 60
print(days, ":",hours, ":", minutes, ":", seconds)
