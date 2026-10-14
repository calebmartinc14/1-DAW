console.log("Introduzca el precio del artículo:");
const precio: number = Number(prompt());

if (precio < 0) {
    console.log("El precio no puede ser negativo.");
} else {
    console.log("¿Cómo va a pagar? (efectivo, tarjeta o Bizum):");
    const metodo: string = (prompt() || "").trim().toLowerCase();

    if (metodo === "tarjeta") {
        console.log("Introduzca su PIN:");
        const pin: string = prompt() || "";
        console.log(
            "Pago con tarjeta realizado. Cantidad cobrada: "
            + precio + " €"
        );
    } else if (metodo === "bizum") {
        console.log("Introduzca su número de teléfono:");
        const telefono: string = prompt() || "";
        console.log(
            "Bizum enviado al número " + telefono
            + ". Cantidad cobrada: " + precio + " €"
        );
    } else if (metodo === "efectivo") {
        console.log("¿Cuánto dinero entrega?");
        const entregado: number = Number(prompt());

        if (entregado === precio) {
            console.log("Ha pagado el precio exacto.");
        } else if (entregado > precio) {
            console.log("Su cambio es: " + (entregado - precio).toFixed(2) + " €");
        } else {
            console.log(
                "Le falta por pagar: " + (precio - entregado).toFixed(2) + " €"
            );
        }
    } else {
        console.log("Método de pago no válido.");
    }
}
