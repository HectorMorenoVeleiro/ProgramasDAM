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
# Ejercicio 1. Definir la función
# media3 : (float, float, float) -> float
# tal que (media3 x y z) es la media aritmética de los números x, y y
# z. Por ejemplo,
# media3(1, 3, 8) == 4.0
# media3(-1, 0, 7) == 2.0
# media3(-3, 0, 3) == 0.0
# ---------------------------------------------------------------------
def media3(x: float, y: float, z: float) -> float:
    return (x + y + z) / 3


x = 3
y = 8
z = -1

print("media(", (x), ", ", (y), ", ", (z), ") == ", media3(x, y, z))
