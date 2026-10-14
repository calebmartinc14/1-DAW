#include <stdio.h>

int main() {
    int horasLenguajes = 128;
    int horasRedes = 192;
    int horasHardware = 96;

    double maxFaltasLenguajes = horasLenguajes * 20.0 / 100;
    double maxFaltasRedes = horasRedes * 20.0 / 100;
    double maxFaltasHardware = horasHardware * 20.0 / 100;

    printf("a) Faltas máximas permitidas:\n");
    printf("Lenguajes de marcas: %.2f\n", maxFaltasLenguajes);
    printf("Redes: %.2f\n", maxFaltasRedes);
    printf("Hardware: %.2f\n", maxFaltasHardware);

    printf("b) Introduzca el número de faltas del alumno en Redes\n");

    int faltasRedes;
    scanf("%d", &faltasRedes);

    if (faltasRedes > maxFaltasRedes) {
        printf("¿Ha superado las faltas permitidas en Redes?: true\n");
    } else {
        printf("¿Ha superado las faltas permitidas en Redes?: false\n");
    }

    return 0;
}
