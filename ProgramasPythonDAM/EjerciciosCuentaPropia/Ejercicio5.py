# --------------------------------------------------
# EJERCICIO 5
# Pedir tres números y calcular su promedio
# --------------------------------------------------


def media_numbers():
    num1 = float(input("introduce el primer numero -> "))
    num2 = float(input("introduce el primer numero -> "))
    num3 = float(input("introduce el primer numero -> "))
    return (num1 + num2 + num3) / 3


def media_n_numbers():

    contador = 0
    sumatorio = 0
    numero = 1

    while numero != 0:
        numero = int(input("enter numero -> "))
        sumatorio = sumatorio + numero
        contador = contador + 1

    print(f"la media es {sumatorio / (contador - 1)}")


media_n_numbers()
