# --------------------------------------------------
# EJERCICIO 5
# Pedir tres números y calcular su promedio
# --------------------------------------------------


def media_numbers():
    num1 = float(input("introduce el primer numero -> "))
    num2 = float(input("introduce el primer numero -> "))
    num3 = float(input("introduce el primer numero -> "))
    return (num1 + num2 + num3) / 3


print(media_numbers())
