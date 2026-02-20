import random


def generar_entero(min: int, max: int):

    numero = int(input("introduce un numero -> "))

    if numero > min and numero < max:
        print(numero)
    else:
        random.randint(1, 100)


def limitar_lista(lista, techo):

    for i in range(len(lista)):
        if lista[i] > techo:
            lista[i] = techo

    return lista


# print(limitar_lista([5, 60, 100, 20], 50))


def analizar_inventario(productos):
    # Si la lista está vacía, devolvemos el caso especial
    if not productos:
        return (0, "Sin productos")

    valor_total = 0
    producto_mas_caro = None
    precio_mas_alto = 0

    for nombre, cantidad, precio in productos:
        # Sumar al valor total
        valor_total += cantidad * precio

        # Comprobar si este producto es el más caro
        if precio > precio_mas_alto:
            precio_mas_alto = precio
            producto_mas_caro = nombre

    return (valor_total, producto_mas_caro)


productos = [("Manzanas", 10, 2), ("Peras", 5, 3), ("Mango", 2, 5)]


def resumen_ventas(lista_ventas):
    total_importes = 0
    total_ventas = 0

    for producto, importe in lista_ventas:
        total_importes += importe
        total_ventas += 1

    return (total_importes, total_ventas)


ventas = [("Camisa", 25.5), ("Pantalón", 40), ("Zapatos", 60)]

resultado = resumen_ventas(ventas)


perro = [1, 2, 3, 4]

gatos = ["pedro", "paco", "nocilla"]

lista = ["nombre", "apellido", "calle"]

datos_usuario = "nombre;apellido;calle"


def generar_login(datos_usuario):
    lista = datos_usuario.split(";")
    print(lista)


def traducir_colores(lista_ingles):
    # Diccionario interno de traducciones
    colores = {
        "red": "rojo",
        "blue": "azul",
        "green": "verde",
        "black": "negro",
        "white": "blanco",
        "purple": "morado",
        "orange": "naranja",
    }

    traducciones = []

    for color in lista_ingles:
        traduccion = colores.get(color, "No encontrado")
        traducciones.append(traduccion)

    return traducciones


entrada = ["red", "yellow", "blue", "pink"]
resultado = traducir_colores(entrada)


def es_primo1(num):
    return False


def n_primeros_primos(n, ret_list=True):
    primos_encontrados = []
    num_a_comprobar = 2


def pedir_numero(val_min):
    num = int(input("introduce un numero igual al valor introducido -> "))
    while num < val_min:
        print("error.")
        num = int(input("introduce un numero igual o mayor al valor introducido -> "))
    return num


def crear_lista(rango_lista):
    rango_lista = pedir_numero(5)
    for i in range(0, rango_lista):
        return 0


numero123 = random.random()  # entre 0 y 1

numero123 = random.random() + 3  # entre 3 y 4
