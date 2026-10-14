print("Introduzca el precio del artículo:")
precio: float = float(input())

if precio < 0:
    print("El precio no puede ser negativo.")
else:
    print("¿Cómo va a pagar? (efectivo, tarjeta o Bizum):")
    metodo: str = input().strip().lower()

    if metodo == "tarjeta":
        print("Introduzca su PIN:")
        pin: str = input()
        print("Pago con tarjeta realizado. Cantidad cobrada:", precio, "€")
    elif metodo == "bizum":
        print("Introduzca su número de teléfono:")
        telefono: str = input()
        print("Bizum enviado al número", telefono,
              ". Cantidad cobrada:", precio, "€")
    elif metodo == "efectivo":
        print("¿Cuánto dinero entrega?")
        entregado: float = float(input())

        if entregado == precio:
            print("Ha pagado el precio exacto.")
        elif entregado > precio:
            print("Su cambio es:", round(entregado - precio, 2), "€")
        else:
            print("Le falta por pagar:", round(precio - entregado, 2), "€")
    else:
        print("Método de pago no válido.")
