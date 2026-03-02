import json
import time
from datetime import datetime

# Formato estándar: Año-Mes-Día
DATE_FORMAT = "%Y-%m-%d"


class Task:
    def __init__(self, title, description, deadLine, status="pendiente") -> None:
        self.title = title
        self.description = description
        self.status = status
        # Convertimos el string que viene del JSON o del input en un objeto datetime
        self.deadLine = datetime.strptime(deadLine, DATE_FORMAT)

    def is_overdue(self):
        """Devuelve True si la fecha actual es mayor a la fecha límite"""
        return datetime.now() > self.deadLine and self.status != "Completada"

    def to_dict(self):
        """Preparamos los datos pra guardar en JSON (las fechas deben ser Strings)"""
        data = self.__dict__.copy()
        data["deadLine"] = self.deadLine.strftime(DATE_FORMAT)
        return data

    def pedir_fecha_valida(self):
        while True:
            fecha_str = input("Introduce la fecha limite(AAAA-MM-DD): ")
            try:
                # Intentamos convertir el texto a objeto datetiem
                fecha_obj = datetime.strptime(fecha_str, "%Y-%m-%d")

                # Validación EXTRA: ¿La fecha es en el pasado?
                if fecha_obj < datetime.now():
                    print("Error: no puedes poner una fecha límite en el pasado.")
                    continue

                return fecha_str  # Retornamos el string válido para la clase Task
            except ValueError:
                print(
                    "Formato incorrecto. Por favor usa el formato adecuado pedido anteriormente"
                )


class TaskManager:
    def __init__(self, filename="tasks.json"):
        self.filename = filename
        self.tasks = self.load_tasks()

    def get_urgent_tasks(self):
        ahora = datetime.now()
        tareas_urgentes = []

        for t in self.tasks:
            # Calculamos la diferencia de tiempo
            diferencia = t.deadLine - ahora

            # Si falta menos de 1 dia (86400 segundos) y no esta terminada
            if 0 <= diferencia.days < 1 and t.status != "Completada":
                tareas_urgentes.append(t)

        return tareas_urgentes

    def add_tasks(self):
        # TODO: Crear la instancia task y añadirla a la lista
        pass

    def find_task(self, keyword):
        # TODO: Usar ListComprehension para buscar por titulo
        return [t for t in self.tasks if keyword.lower() in t.title.lower()]

    def save_tasks(self):
        # TODO: Guardar la lista de objetos como JSON
        with open(self.filename, "w") as f:
            json.dump([t.to_dict() for t in self.tasks], f, indent=4)

    def load_tasks(self):
        # TODO: manejar el ERROR si el archivo no existe (FileNotFoundError)
        try:
            with open(self.filename, "r") as f:
                data = json.load(f)
                return [Task(**t) for t in data]
        except FileNotFoundError:
            return []
        
    def main():
        manager = TaskManager()
        
        while


# Ejemplo de ejecución sugerido
manager = TaskManager()
# manager.add_task("Aprender Python", "Dominar decoradores y POO")
# manager.save_tasks()
