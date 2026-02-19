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


def xor(booleano1: bool, booleano2: bool) -> bool:
    return booleano1 != booleano2


# 1ª solución
def xor1(x, y):
    match x, y:
        case True, True:
            return False
        case True, False:
            return True
        case False, True:
            return True
        case False, False:
            return False


# 2ª solución
def xor2(x: bool, y: bool) -> bool:
    if x:
        return not y
    return y


# 3ª solución
def xor3(x: bool, y: bool) -> bool:
    return (x or y) and not (x and y)


# 4ª solución
def xor4(x: bool, y: bool) -> bool:
    return (x and not y) or (y and not x)


# 5ª solución
def xor5(x: bool, y: bool) -> bool:
    return x != y


# La comprobación está al final de la relación.
# ---------------------------------------------------------------------
# Ejercicio 3. Las dimensiones de los rectángulos puede representarse
# por pares; por ejemplo, (5,3) representa a un rectángulo de base 5 y
# altura 3.
#
# Definir la función
# mayorRectangulo : (tuple[float, float], tuple[float, float])
# -> tuple[float, float]
# tal que mayorRectangulo(r1, r2) es el rectángulo de mayor área entre
# r1 y r2. Por ejemplo,
# mayorRectangulo((4, 6), (3, 7)) == (4, 6)
# mayorRectangulo((4, 6), (3, 8)) == (4, 6)
# mayorRectangulo((4, 6), (3, 9)) == (3, 9)
# ---------------------------------------------------------------------


def mayorRectangulo(
    r1: tuple[float, float], r2: tuple[float, float]
) -> tuple[float, float]:
    base1, altura1 = r1
    base2, altura2 = r2
    if base1 * altura1 > base2 * altura2:
        return r1
    return r2


def mayorRectangulo_sol(
    r1: tuple[float, float], r2: tuple[float, float]
) -> tuple[float, float]:
    (a, b) = r1
    (c, d) = r2
    if a * b >= c * d:
        return (a, b)
    return (c, d)


# ---------------------------------------------------------------------
# Ejercicio 4. Definir la función
# intercambia : (tuple[A, B]) -> tuple[B, A]
# tal que intercambia(p) es el punto obtenido intercambiando las
# coordenadas del punto p. Por ejemplo,
# intercambia((2,5)) == (5,2)
# intercambia((5,2)) == (2,5)
#
# Comprobar con Hypothesis que la función intercambia esidempotente; es
# decir, si se aplica dos veces es lo mismo que no aplicarla ninguna.
# ---------------------------------------------------------------------


def intercambia(r: tuple[A, B]) -> tuple[B, A]:
    (i, j) = r
    return (j, i)


def intercambia2(p: tuple[A, B]) -> tuple[B, A]:
    (x, y) = p
    return (y, x)
