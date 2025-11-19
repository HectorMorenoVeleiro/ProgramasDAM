# ---------------------------------------------------------------------
# Introducción --
# ---------------------------------------------------------------------
# En esta relación se plantean ejercicios con definiciones de funciones
# por composición sobre números, listas y booleanos.
# ----------------------------------------------------------------------
# Cabecera
# ----------------------------------------------------------------------

from math import pi
from typing import List, TypeVar
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


def rota1a(xs: list[A]) -> list[A]:
    if xs == []:
        return []
    return xs[1:] + [xs[0]]


# ---------------------------------------------------------------------
# vale trabajar con listas en python es bastante mas lioso de
# lo que me imaginaba
# ---------------------------------------------------------------------


class comerComida:
    a: int = 3
    b: int = 4

    def hacerComida(self) -> int:
        return self.a + self.b
