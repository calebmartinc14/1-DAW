#include <iostream>
using namespace std;

int main() {
    // Definimos primero las variables que vamos a necesitar
    string dia = "Viernes";
    int numDia = 26;
    string mes = "Mayo";
    string curso = "1º";
    string asignatura = "Programación de aplicaciones web";
    string instituto = "IES Hlanz";
    string ciudad = "Granada";
    string hora = "20:30";

    // Una vez tenemos todas estas variables pasamos a mostrar por pantalla
    cout << "El " << dia << " día " << numDia << " de " << mes
         << " tendrá lugar la reunión de evaluación del " << curso
         << " curso de " << asignatura << " en el " << instituto
         << " de " << ciudad << ". Los profesores calificarán al alumnado "
         << "y se prevé que a las " << hora
         << " horas las notas estén publicadas en el tablón de anuncios del centro"
         << endl;

    return 0;
}
