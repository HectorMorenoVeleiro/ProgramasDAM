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
print(resultado)  # (125.5, 3)
