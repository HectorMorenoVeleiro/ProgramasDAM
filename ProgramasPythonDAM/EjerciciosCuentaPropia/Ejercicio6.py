# --------------------------------------------------
# EJERCICIO 3
# Pedir dos números al usuario y mostrar su resta
# --------------------------------------------------


def par_impar() -> str:
    num = float(input("introduce un número sea par/impar -> "))
    if num % 2 == 0:
        return "par"
    else:
        return "impar"


print(par_impar())
