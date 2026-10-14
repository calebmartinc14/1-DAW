package main

import "fmt"

func main() {
    // Se pide un programa que al introducir una cantidad de euros
    // muestre su conversión a otras monedas.
    tasa1 := 1.42
    tasa2 := 0.8713
    tasa3 := 113.86
    tasa4 := 166.386

    var euro float64

    fmt.Println("¿Qué cantidad de euros quieres convertir?")
    fmt.Scan(&euro)

    fmt.Println("La traducción de moneda es")
    fmt.Println("En dólar:", euro, "euros son", euro*tasa1, "dólares")
    fmt.Println("En libras:", euro, "euros son", euro*tasa2, "libras")
    fmt.Println("En yenes:", euro, "euros son", euro*tasa3, "yenes")
    fmt.Println("En pesetas:", euro, "euros son", euro*tasa4, "pesetas")
}
