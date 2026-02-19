from math import gcd, sqrt
from typing import TypeVar
from hypothesis import assume, given
from hypothesis import strategies as st

A = TypeVar("A")
B = TypeVar("B")


# ---------------------------------------------------------------------
# Ejercicio 1. Definir la función
# divisionSegura : (float, float) -> float
# tal que divisionSegura(x, y) es x/y si y no es cero y 9999 en caso
# contrario. Por ejemplo,
# divisionSegura(7, 2) == 3.5
# divisionSegura(7, 0) == 9999.0
# ---------------------------------------------------------------------


def divisionSegura(num1: float, num2: float) -> float:
    return num1 / num2 if num2 != 0 else 9999


# solucion 1
def divisionSegura1(x: float, y: float) -> float:
    if y == 0:
        return 9999.0
    return x / y


# solucion 2
def divisionSegura2(x: float, y: float) -> float:
    match y:
        case 0:
            return 9999.0
        case _:
            return x / y


# ---------------------------------------------------------------------
# Ejercicio 2. La disyunción excluyente de dos fórmulas se verifica si
# una es verdadera y la otra es falsa. Su tabla de verdad es
# x | y | xor x y
# ------+-------+---------
# True | True | False
# True | False | True
# False | True | True
# False | False | False
#
# Definir la función
# xor : (bool, bool) -> bool
# tal que xor(x, y) es la disyunción excluyente de x e y. Por ejemplo,
# xor(True, True) == False
# xor(True, False) == True
# xor(False, True) == True
# xor(False, False) == False
# ---------------------------------------------------------------------
