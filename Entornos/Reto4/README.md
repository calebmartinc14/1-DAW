# Reto 4 - Ejercicio 41

Hay una solución por lenguaje:

- JavaScript: `javascript/ejercicio41.js`
- TypeScript: `typescript/ejercicio41.ts`
- Ruby: `ruby/ejercicio41.rb`
- Rust: `rust/ejercicio41.rs`
- Go: `go/ejercicio41.go`
- C: `c/ejercicio41.c`
- C++: `cpp/ejercicio41.cpp`
- COBOL: `cobol/ejercicio41.cob`
- Haskell: `haskell/ejercicio41.hs`

## Relación con el Tema 1

El Tema 1 incluye variables y tipos, entrada y salida, asignaciones, operaciones aritméticas, comparaciones, conversiones y condicionales `if/else`. No incluye bucles ni funciones auxiliares. Estas versiones usan esos conceptos y no tienen bucles ni funciones auxiliares. Los lenguajes que exigen un punto de entrada conservan su estructura obligatoria `main` (C, C++, Go, Rust, Haskell y COBOL); no es una función auxiliar añadida para resolver el ejercicio.

JavaScript y TypeScript leen la consola con la dependencia `readline-sync`. Desde la carpeta raíz ejecuta una vez `npm install`. Esto instala además `tsx` y TypeScript para ejecutar y compilar TypeScript.

## Ejecutar los programas

```text
JavaScript:  node javascript/ejercicio41.js
TypeScript:  npx tsx typescript/ejercicio41.ts
Ruby:        ruby ruby/ejercicio41.rb
Rust:        rustc rust/ejercicio41.rs -o rust/ejercicio41.exe
             ./rust/ejercicio41.exe
Go:          go run go/ejercicio41.go
C:           gcc c/ejercicio41.c -o c/ejercicio41.exe
             ./c/ejercicio41.exe
C++:         g++ cpp/ejercicio41.cpp -o cpp/ejercicio41.exe
             ./cpp/ejercicio41.exe
COBOL:       cobc -x -free cobol/ejercicio41.cob -o cobol/ejercicio41.exe
             ./cobol/ejercicio41.exe
Haskell:     runghc haskell/ejercicio41.hs
```

En Windows PowerShell los programas compilados se inician con `./carpeta/ejercicio41.exe`.

## Interpretación de las sanciones

- La infracción principal se escoge entre las seis opciones.
- No tener carnet añade 100 EUR y 0 puntos; se acumula con la infracción principal.
- Una tasa de 0,25 a 0,50 mg/l, incluidos ambos límites, añade 4 puntos y 500 EUR.
- Una tasa superior a 0,50 mg/l añade 6 puntos y 1.000 EUR.
- La tasa menor de 0,25 mg/l no añade sanción.
- Se muestran los puntos iniciales, los puntos retirados y la multa total. Una opción fuera de 1-6 se rechaza.

La imagen del ejercicio dice “entre 0.25 y 0.5”; he considerado incluidos los extremos. El PDF del Reto 4 pide estos nueve lenguajes y trabajar en Visual Studio Code con extensiones, compilación/ejecución y depuración. No pide un proyecto de Visual Studio (`.sln`).

La sintaxis y el entorno de cada lenguaje requieren sus herramientas: Node.js para JavaScript/TypeScript; Ruby; Rust; Go; un compilador C/C++ con depurador; GnuCOBOL; y GHC para Haskell. VS Code por sí solo no instala todos esos compiladores e intérpretes.
