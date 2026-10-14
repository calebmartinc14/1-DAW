horas_lenguajes: int = 128
horas_redes: int = 192
horas_hardware: int = 96

max_faltas_lenguajes: float = horas_lenguajes * 20.0 / 100
max_faltas_redes: float = horas_redes * 20.0 / 100
max_faltas_hardware: float = horas_hardware * 20.0 / 100

print("a) Faltas máximas permitidas:")
print("Lenguajes de marcas:", max_faltas_lenguajes)
print("Redes:", max_faltas_redes)
print("Hardware:", max_faltas_hardware)

print("b) Introduzca el número de faltas del alumno en Redes")
faltas_redes: int = int(input())

ha_superado: bool = faltas_redes > max_faltas_redes
print("¿Ha superado las faltas permitidas en Redes?:", ha_superado)
