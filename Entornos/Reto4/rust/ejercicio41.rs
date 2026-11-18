use std::io;

fn main() {
    let mut carnet = String::new();
    println!("¿Tiene carnet de conducir? (s/n): ");
    io::stdin().read_line(&mut carnet).unwrap();

    let mut texto = String::new();
    println!("¿Cuántos puntos tiene?: ");
    io::stdin().read_line(&mut texto).unwrap();
    let puntos_actuales: i32 = texto.trim().parse().unwrap();

    texto = String::new();
    println!("Tasa de alcoholemia en mg/l (use punto decimal): ");
    io::stdin().read_line(&mut texto).unwrap();
    let alcohol: f64 = texto.trim().parse().unwrap();

    println!("1. Móvil: 6 puntos, 200 EUR");
    println!("2. Cinturón: 4 puntos, 200 EUR");
    println!("3. Semáforo rojo: 4 puntos, 200 EUR");
    println!("4. Sentido contrario: 6 puntos, 500 EUR");
    println!("5. Conducción temeraria: 6 puntos, 500 EUR");
    println!("6. Señales de los agentes: 4 puntos, 200 EUR");
    texto = String::new();
    println!("Elija la infracción (1-6): ");
    io::stdin().read_line(&mut texto).unwrap();
    let infraccion: i32 = texto.trim().parse().unwrap();

    let mut puntos_retirados = 0;
    let mut multa = 0;
    if infraccion == 1 {
        puntos_retirados = 6;
        multa = 200;
    } else if infraccion == 2 || infraccion == 3 || infraccion == 6 {
        puntos_retirados = 4;
        multa = 200;
    } else if infraccion == 4 || infraccion == 5 {
        puntos_retirados = 6;
        multa = 500;
    }

    if infraccion >= 1 && infraccion <= 6 {
        if carnet.trim() == "n" || carnet.trim() == "N" {
            multa = multa + 100;
        }
        if alcohol >= 0.25 && alcohol <= 0.5 {
            puntos_retirados = puntos_retirados + 4;
            multa = multa + 500;
        } else if alcohol > 0.5 {
            puntos_retirados = puntos_retirados + 6;
            multa = multa + 1000;
        }
        println!("Puntos que tenía: {}", puntos_actuales);
        println!("Puntos retirados: {}", puntos_retirados);
        println!("Multa total: {} EUR", multa);
    } else {
        println!("Infracción no válida.");
    }
}
