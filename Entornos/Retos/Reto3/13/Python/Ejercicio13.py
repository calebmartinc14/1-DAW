# Se pide un programa que al introducir una cantidad de euros
# muestre su conversión a otras monedas.
tasa1 = 1.42
tasa2 = 0.8713
tasa3 = 113.86
tasa4 = 166.386

print("¿Qué cantidad de euros quieres convertir?")
euro = float(input())

print("La traducción de moneda es")
print("En dólar:", euro, "euros son", euro * tasa1, "dólares")
print("En libras:", euro, "euros son", euro * tasa2, "libras")
print("En yenes:", euro, "euros son", euro * tasa3, "yenes")
print("En pesetas:", euro, "euros son", euro * tasa4, "pesetas")
