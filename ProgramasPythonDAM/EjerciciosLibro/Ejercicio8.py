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
# Ejercicio 8. Definir la función
# rota : (int, List[A]) -> List[A]
# tal que rota(n, xs) es la lista obtenida poniendo los n primeros
# elementos de xs al final de la lista. Por ejemplo,
# rota(1, [3, 2, 5, 7]) == [2, 5, 7, 3]
# rota(2, [3, 2, 5, 7]) == [5, 7, 3, 2]
# rota(3, [3, 2, 5, 7]) == [7, 3, 2, 5]
# ---------------------------------------------------------------------


def filtrar_pares(lista_numeros):
    pares = []
    for i in lista_numeros:
        if i % 2 == 0:
            pares.append(i)
    return pares


mis_numeros = {1, 2, 3, 4, 5, 6, 7, 8}

solo_pares = filtrar_pares(mis_numeros)

print(f"los pares son : {solo_pares}")
