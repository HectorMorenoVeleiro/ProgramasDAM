# ---------------------------------------------------------------------
# Introducción --
# ---------------------------------------------------------------------
# En esta relación se plantean ejercicios con definiciones de funciones
# por composición sobre números, listas y booleanos.
# ----------------------------------------------------------------------
# Cabecera
# ----------------------------------------------------------------------
from math import pi
from typing import TypeVar
from hypothesis import given
from hypothesis import strategies as st

A = TypeVar("A")

# ---------------------------------------------------------------------
# Ejercicio 6. Definir la función
# maxTres : (int, int, int) -> int
# tal que maxTres(x, y, z) es el máximo de x, y y z. Por ejemplo,
# maxTres(6, 2, 4) == 6
# maxTres(6, 7, 4) == 7
# maxTres(6, 7, 9) == 9
# ---------------------------------------------------------------------


def maxTres(a: int, b: int, c: int) -> int:
    return max(a, b, c)


# el lo pone como max(a, max(b, c))
