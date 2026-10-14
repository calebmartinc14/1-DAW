const NUMERO: number = 28590;

console.log("Introduzca un número entero");
const numeroIntroducido: number = Number(prompt());

if (numeroIntroducido !== 0 && NUMERO % numeroIntroducido === 0) {
    console.log(numeroIntroducido + " es un factor de " + NUMERO);
} else {
    console.log(numeroIntroducido + " no es un factor de " + NUMERO);
}
