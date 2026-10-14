#include <iostream>
using namespace std;

int main() {
    const int NUMERO = 28590;

    cout << "Introduzca un número entero" << endl;

    int numeroIntroducido;
    cin >> numeroIntroducido;

    if (numeroIntroducido != 0 && NUMERO % numeroIntroducido == 0) {
        cout << numeroIntroducido << " es un factor de "
             << NUMERO << endl;
    } else {
        cout << numeroIntroducido << " no es un factor de "
             << NUMERO << endl;
    }

    return 0;
}
