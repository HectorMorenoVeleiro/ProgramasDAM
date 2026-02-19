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
