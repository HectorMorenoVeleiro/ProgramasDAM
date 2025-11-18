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
# Ejercicio 4. Definir la función
# areaDeCoronaCircular : (float, float) -> float
# tal que areaDeCoronaCircular(r1, r2) es el área de una corona
# circular de radio interior r1 y radio exterior r2. Por ejemplo,
# areaDeCoronaCircular(1, 2) == 9.42477796076938
# areaDeCoronaCircular(2, 5) == 65.97344572538566
# areaDeCoronaCircular(3, 5) == 50.26548245743669
# ---------------------------------------------------------------------


def areaDeCoronaCircular(radio1: float, radio2: float) -> float:
    return pi * (radio2**2 - radio1**2)


# ---------------------------------------------------------------------
# Nada era lo mismo, saberse el area del circulo y ponerlo
# ---------------------------------------------------------------------
