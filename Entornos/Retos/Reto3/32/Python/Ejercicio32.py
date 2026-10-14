NUMERO: int = 28590

print("Introduzca un número entero")
numero_introducido: int = int(input())

if numero_introducido != 0 and NUMERO % numero_introducido == 0:
    print(numero_introducido, "es un factor de", NUMERO)
else:
    print(numero_introducido, "no es un factor de", NUMERO)
