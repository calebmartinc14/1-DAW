package main

import "fmt"

func main() {
    horasLenguajes := 128
    horasRedes := 192
    horasHardware := 96

    maxFaltasLenguajes := float64(horasLenguajes) * 20.0 / 100
    maxFaltasRedes := float64(horasRedes) * 20.0 / 100
    maxFaltasHardware := float64(horasHardware) * 20.0 / 100

    fmt.Println("a) Faltas máximas permitidas:")
    fmt.Println("Lenguajes de marcas:", maxFaltasLenguajes)
    fmt.Println("Redes:", maxFaltasRedes)
    fmt.Println("Hardware:", maxFaltasHardware)

    fmt.Println("b) Introduzca el número de faltas del alumno en Redes")
    var faltasRedes int
    fmt.Scan(&faltasRedes)

    haSuperado := float64(faltasRedes) > maxFaltasRedes
    fmt.Println("¿Ha superado las faltas permitidas en Redes?:", haSuperado)
}
