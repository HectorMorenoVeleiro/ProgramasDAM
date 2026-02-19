# okay aqui hasta donde sabemos vamos a aplicar esta mierda ->
from math import pi
from typing import TypeVar
from hypothesis import given
from hypothesis import strategies as st

A = TypeVar("A")
# ---------------------------------------------------------------------
# Ejercicio 7. Definir la función
# rota1 : (List[A]) -> List[A]
# tal que rota1(xs) es la lista obtenida poniendo el primer elemento de
# xs al final de la lista. Por ejemplo,
# rota1([3, 2, 5, 7]) == [2, 5, 7, 3]
# rota1(['a', 'b', 'c']) == ['b', 'c', 'a']
# ---------------------------------------------------------------------


# solucion 1:
def rotal_a(lista: list[A]) -> list[A]:
    if lista == []:
        return []
        # si se le pasa una lista nula devuelve una lista nula (para evitar problemas)
    return lista[1:] + [lista[0]]
    # devuelve la lista desde la segunda posicion ([1:]) y le suma el primer valor al final (+ lista[0])


def rotal_b(lista: list[A]) -> list[A]:
    if lista == []:
        return []
    lista2 = lista[1:]  # creas otra lista que empieza desde la segunda posicion
    lista2.append(lista[0])
    # le añade la posicion 1 de la lista al final de la segunda lista creada
    return lista2  # devuelve esa lista


def rotal_c(lista: list[A]) -> list[A]:
    if lista == []:
        return []
    valor1, *listaDesde2 = lista
    # le dices al codigo que la lista esta creada por un primer valor y una lista con el resto del codigo
    # y le das vuelta a ese proceso
    return listaDesde2 + [valor1]


# ---------------------------------------------------------------------
# Ejercicio 8. Definir la función
# rota : (int, List[A]) -> List[A]
# tal que rota(n, xs) es la lista obtenida poniendo los n primeros
# elementos de xs al final de la lista. Por ejemplo,
# rota(1, [3, 2, 5, 7]) == [2, 5, 7, 3]
# rota(2, [3, 2, 5, 7]) == [5, 7, 3, 2]
# rota(3, [3, 2, 5, 7]) == [7, 3, 2, 5]
# ---------------------------------------------------------------------


def rota(num: int, lista: list[A]) -> list[A]:
    return lista[num:] + lista[:num]


# ---------------------------------------------------------------------
# Ejercicio 9. Definir la función
# rango : (List[int]) -> List[int]
# tal que rango(xs) es la lista formada por el menor y mayor elemento
# de xs.
# rango([3, 2, 7, 5]) == [2, 7]
# ---------------------------------------------------------------------


def rango(lista: list[int]) -> list[int]:
    return [min(lista), max(lista)]


# ---------------------------------------------------------------------
# Ejercicio 10. Definir la función
# palindromo : (List[A]) -> bool
# tal que palindromo(xs) se verifica si xs es un palíndromo; es decir,
# es lo mismo leer xs de izquierda a derecha que de derecha a
# izquierda. Por ejemplo,
# palindromo([3, 2, 5, 2, 3]) == True
# palindromo([3, 2, 5, 6, 2, 3]) == False
# ---------------------------------------------------------------------


def es_palindromo(lista: list[A]) -> bool:
    return lista == list(reversed(lista))


# ---------------------------------------------------------------------
# Ejercicio 11. Definir la función
# interior : (list[A]) -> list[A]
# tal que interior(xs) es la lista obtenida eliminando los extremos de
# la lista xs. Por ejemplo,
# interior([2, 5, 3, 7, 3]) == [5, 3, 7]
# ---------------------------------------------------------------------


def interior(lista: list[A]) -> list[A]:
    primero, *medio, ultimo = lista
    return [*medio]


# 1ª solución
def interior1(xs: list[A]) -> list[A]:
    return xs[1:][:-1]


# 2ª solución
def interior2(xs: list[A]) -> list[A]:
    return xs[1:-1]


# ---------------------------------------------------------------------
# Definir la función
# finales : (int, list[A]) -> list[A]
# tal que finales(n, xs) es la lista formada por los n finales
# elementos de xs. Por ejemplo,
# finales(3, [2, 5, 4, 7, 9, 6]) == [7, 9, 6]
# ---------------------------------------------------------------------


def finales(num: int, lista: list[A]) -> list[A]:
    if num == 0 or num < len(lista) or lista == []:
        return []
    return lista[
        -num:
    ]  # le falta mirar la posibilidad de que el numero o la lista sean 0(nulas)


def finales1(n: int, xs: list[A]) -> list[A]:
    if len(xs) <= n:
        return xs
    return xs[len(xs) - n :]


# 2ª definición
def finales2(n: int, xs: list[A]) -> list[A]:
    if n == 0:
        return []
    return xs[-n:]


# 3ª definición
def finales3(n: int, xs: list[A]) -> list[A]:
    ys = list(reversed(xs))
    return list(reversed(ys[:n]))


# ---------------------------------------------------------------------
# Ejercicio 13. Definir la función
# segmento : (int, int, list[A]) -> list[A]
# tal que segmento(m, n, xs) es la lista de los elementos de xs
# comprendidos entre las posiciones m y n. Por ejemplo,
# segmento(3, 4, [3, 4, 1, 2, 7, 9, 0]) == [1, 2]
# segmento(3, 5, [3, 4, 1, 2, 7, 9, 0]) == [1, 2, 7]
# segmento(5, 3, [3, 4, 1, 2, 7, 9, 0]) == []
# ---------------------------------------------------------------------


def segmento(num1: int, num2: int, lista: list[A]) -> list[A]:
    return lista[(num1 - 1) : num2]


# 1ª definición
def segmento1(m: int, n: int, xs: list[A]) -> list[A]:
    ys = xs[:n]
    return ys[m - 1 :]


# 2ª definición
def segmento2(m: int, n: int, xs: list[A]) -> list[A]:
    return xs[m - 1 : n]


# ---------------------------------------------------------------------
# Ejercicio 14. Definir la función
# extremos : (int, list[A]) -> list[A]
# tal que extremos(n, xs) es la lista formada por los n primeros
# elementos de xs y los n finales elementos de xs. Por ejemplo,
# extremos(3, [2, 6, 7, 1, 2, 4, 5, 8, 9, 2, 3]) == [2, 6, 7, 9, 2, 3]
# ---------------------------------------------------------------------


def extremos(num: int, lista: list[A]) -> list[A]:
    return lista[:num] + lista[-num:]


# solucion
def extremos_sol(n: int, xs: list[A]) -> list[A]:
    return xs[:n] + xs[-n:]


# ---------------------------------------------------------------------
# Ejercicio 15. Definir la función
# mediano : (int, int, int) -> int
# tal que mediano(x, y, z) es el número mediano de los tres números x, y
# y z. Por ejemplo,
# mediano(3, 2, 5) == 3
# mediano(2, 4, 5) == 4
# mediano(2, 6, 5) == 5
# mediano(2, 6, 6) == 6
# ---------------------------------------------------------------------


def mediano(num1: int, num2: int, num3: int) -> int:
    return (num1 + num2 + num3) - min([num1, num2, num3]) - max([num1, num2, num3])


# ---------------------------------------------------------------------
# Ejercicio 16. Definir la función
# tresIguales : (int, int, int) -> bool
# tal que tresIguales(x, y, z) se verifica si los elementos x, y y z son
# iguales. Por ejemplo,
# tresIguales(4, 4, 4) == True
# tresIguales(4, 3, 4) == False
# ---------------------------------------------------------------------


def tresIguales(num1: int, num2: int, num3: int) -> bool:
    return num1 == num2 == num3


# 1ª solución
def tresIguales1(x: int, y: int, z: int) -> bool:
    return x == y and y == z


# 2ª solución
def tresIguales2(x: int, y: int, z: int) -> bool:
    return x == y == z


# ---------------------------------------------------------------------
# Ejercicio 17. Definir la función
# tresDiferentes : (int, int, int) -> bool
# tal que tresDiferentes(x, y, z) se verifica si los elementos x, y y z
# son distintos. Por ejemplo,
# tresDiferentes(3, 5, 2) == True
# tresDiferentes(3, 5, 3) == False
# ---------------------------------------------------------------------


def tresDiferentes(num1: int, num2: int, num3: int) -> bool:
    return num1 != num2 != num3 != num1


def tresDiferentes_sol(x: int, y: int, z: int) -> bool:
    return x != y and x != z and y != z


# ---------------------------------------------------------------------
# Ejercicio 18. Definir la función
# cuatroIguales : (int, int, int, int) -> bool
# tal que cuatroIguales(x,y,z,u) se verifica si los elementos x, y, z y
# u son iguales. Por ejemplo,
# cuatroIguales(5, 5, 5, 5) == True
# cuatroIguales(5, 5, 4, 5) == False
# ---------------------------------------------------------------------


def cuatroIguales(num1: int, num2: int, num3: int, num4: int) -> bool:
    return num1 == num2 == num3 == num4


# 1ª solución
def cuatroIguales1(x: int, y: int, z: int, u: int) -> bool:
    return x == y and tresIguales1(y, z, u)


# 2ª solución
def cuatroIguales2(x: int, y: int, z: int, u: int) -> bool:
    return x == y == z == u
