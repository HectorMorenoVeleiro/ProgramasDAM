# Crea un programa que simule una ciudad inteligente donde distintos
# sistemas funcionan de manera autonoma y conrurrente. El objetivo es
# modelar el comportamiento de la ciudad durante un dia completo

# REQUISITOS:
# Debes crear al menos estas clases ->
#   · Ciudad
#   · Edificio
#   · Sensor (abstract) (
#       sensor_temperatura
#       sensor_consumo_enegia
#       sensor_movimiento
#   )
#   · Controlador_central

import threading
import time
import random
from abc import ABC, abstractmethod


class Sensor(ABC):
    def __init__(self, edificio):
        self.edificio = edificio

    @abstractmethod
    def leer(self, minuto):
        pass


class Sensor_temperatura(Sensor):
    def leer(self, minuto):  # type: ignore
        base = 12 + 10 * (1 if 8 <= minuto // 60 <= 18 else 0)
        return base + random.uniform(-2, 2)


class Sensor_consumo_energia(Sensor):
    def leer(self, minuto):  # type: ignore
        hora = minuto // 60
        if 18 <= hora <= 23:
            return random.uniform(5, 15)
        return random.uniform(1, 5)


class Sensor_movimiento(Sensor):
    def leer(self, minuto):  # type: ignore
        hora = minuto // 60
        prob = 0.7 if 7 <= hora <= 22 else 0.1
        return random.random() < prob


class Edificio(threading.Thread):
    def __init__(self, nombre, controlador):
        super().__init__()
        self.nombre = nombre
        self.controlador = controlador
        self.sensores = [
            Sensor_temperatura(self),
            Sensor_consumo_energia(self),
            Sensor_movimiento(self),
        ]

    def run(self):
        for minuto in range(24 * 60):
            datos = {type(s).__name__: s.leer(minuto) for s in self.sensores}
            self.controlador.registrar(self.nombre, minuto, datos)
            time.sleep(0.001)  # simulación rápida.


class Controlador_central:
    def __init__(self):
        self.registros = []

    def registrar(self, edificio, minuto, datos):
        self.registros.append({"edificio": edificio, "minuto": minuto, **datos})


def main():
    controlador = Controlador_central()
    edificios = [Edificio(f"Edificio_{i}", controlador) for i in range(5)]

    for e in edificios:
        e.start()

    for e in edificios:
        e.join()

    print("Simulacion completada. Registros: ", len(controlador.registros))


if __name__ == "__main__":
    main()
