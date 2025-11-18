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
# Ejercicio 5. Definir la función
# ultimoDigito : (int) -> int
# tal que ultimoDigito(x) es el último dígito del número x. Por
# ejemplo,
# ultimoDigito(325) == 5
# ---------------------------------------------------------------------


def ultimoDigito(a: int) -> int:
    return a % 10
