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
# Ejercicio 3. Definir la función
# volumenEsfera : (float) -> float
# tal que volumenEsfera(r) es el volumen de la esfera de radio r. Por
# ejemplo,
# volumenEsfera(10) == 4188.790204786391
# ---------------------------------------------------------------------


def volumenEsfera(radio: float) -> float:
    return (4 / 3) * pi * (radio**3)


# ---------------------------------------------------------------------
# Un numero se eleva a otro poniendo "**"
# ---------------------------------------------------------------------
