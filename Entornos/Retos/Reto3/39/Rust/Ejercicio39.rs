use std::io;

fn leer_linea() -> String {
    let mut entrada = String::new();
    io::stdin().read_line(&mut entrada).unwrap();
    entrada.trim().to_string()
}

fn main() {
    println!("Introduzca el precio del artículo:");
    let precio: f64 = leer_linea().parse().unwrap();

    if precio < 0.0 {
        println!("El precio no puede ser negativo.");
    } else {
        println!("¿Cómo va a pagar? (efectivo, tarjeta o Bizum):");
        let metodo = leer_linea().to_lowercase();

        if metodo == "tarjeta" {
            println!("Introduzca su PIN:");
            let pin = leer_linea();
            println!(
                "Pago con tarjeta realizado. Cantidad cobrada: {} €",
                precio
            );
        } else if metodo == "bizum" {
            println!("Introduzca su número de teléfono:");
            let telefono = leer_linea();
            println!(
                "Bizum enviado al número {}. Cantidad cobrada: {} €",
                telefono, precio
            );
        } else if metodo == "efectivo" {
            println!("¿Cuánto dinero entrega?");
            let entregado: f64 = leer_linea().parse().unwrap();

            if entregado == precio {
                println!("Ha pagado el precio exacto.");
            } else if entregado > precio {
                println!("Su cambio es: {:.2} €", entregado - precio);
            } else {
                println!("Le falta por pagar: {:.2} €", precio - entregado);
            }
        } else {
            println!("Método de pago no válido.");
        }
    }
}
