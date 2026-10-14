use std::io;

fn main() {
    // Se pide un programa que al introducir una cantidad de euros
    // muestre su conversión a otras monedas.
    let tasa1: f64 = 1.42;
    let tasa2: f64 = 0.8713;
    let tasa3: f64 = 113.86;
    let tasa4: f64 = 166.386;

    println!("¿Qué cantidad de euros quieres convertir?");

    let mut entrada = String::new();
    io::stdin().read_line(&mut entrada).unwrap();
    let euro: f64 = entrada.trim().parse().unwrap();

    println!("La traducción de moneda es");
    println!("En dólar: {} euros son {} dólares", euro, euro * tasa1);
    println!("En libras: {} euros son {} libras", euro, euro * tasa2);
    println!("En yenes: {} euros son {} yenes", euro, euro * tasa3);
    println!("En pesetas: {} euros son {} pesetas", euro, euro * tasa4);
}
