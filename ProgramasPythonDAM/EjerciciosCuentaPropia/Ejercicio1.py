# --------------------------------------------------
# EJERCICIO 1
# Pedir al usuario dos numeros y mostrar su división
# --------------------------------------------------


def pedir_numeros():
    num1 = float(input("introduce el primer numero por teclado -> "))
    num2 = float(input("introduce el segundo{num1} numero por teclado -> "))

    # corrección :
    # --------------------------------------------------
    if num2 == 0:
        return "ERROR, cant divide by 0"
    else:
        return num1 / num2
    # --------------------------------------------------


print(pedir_numeros())
