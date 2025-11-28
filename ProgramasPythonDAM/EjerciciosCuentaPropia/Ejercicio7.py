# --------------------------------------------------
# EJERCICIO 7
# verificar si un número es positivo, negativo o 0
# --------------------------------------------------


def veriyfy_numbers() -> str:
    num = float(input("enter a number -> "))
    return "es 0" if num == 0 else "es positivo" if num > 0 else "es negativo"


print(veriyfy_numbers())
